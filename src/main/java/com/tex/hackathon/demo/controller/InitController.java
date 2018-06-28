package com.tex.hackathon.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tex.hackathon.demo.model.thirdparty.account.Account;
import com.tex.hackathon.demo.dao.entity.User;
import com.tex.hackathon.demo.dao.repository.UserRepository;
import com.tex.hackathon.demo.model.thirdparty.paymentRequest.*;
import com.tex.hackathon.demo.model.us.InitiatePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class InitController {

    public static final String REST_SERVICE_URI = "http://services.innofactory.io";

    @Value( "${app.accessToken}" )
    private String accessToken;

    @Autowired
    private UserRepository userRepository;

    private RestTemplate restTemplate =new RestTemplate();

    @RequestMapping("/users")
    List<User> getUsersByType(@RequestParam("userType") String userType) {
        return userRepository.findByUserType(userType);
    }

    @RequestMapping("/users/{userId}")
    User getUserById(@PathVariable Long userId) {
        return  userRepository.findById(userId).get();
    }

    @RequestMapping("/users/{userId}/accounts")
    List<Account> hello(@PathVariable Long userId) {

        User user=  userRepository.findById(userId).get();



        List<Account> accounts = restTemplate.exchange(
                REST_SERVICE_URI+"/account/accounts/customerId/" + user.getCustomerId(),
                HttpMethod.GET,
                getHttpEntity(),
                new ParameterizedTypeReference<List<Account>>() {}).getBody();

        return accounts;
    }

    @RequestMapping("/payments")
    String postPayment(@RequestBody InitiatePayment initiatePayment) throws JsonProcessingException {

        Account customerAccount = restTemplate.exchange(
                REST_SERVICE_URI+"/account/accounts/" + initiatePayment.getCustomerAccountId(),
                HttpMethod.GET,
                getHttpEntity(),
                new ParameterizedTypeReference<Account>() {}).getBody();

        User merchant=  userRepository.findById(initiatePayment.getMerchantId()).get();

        List<Account> merchantAccount = restTemplate.exchange(
                REST_SERVICE_URI+"/account/accounts/customerId/" + merchant.getCustomerId(),
                HttpMethod.GET,
                getHttpEntity(),
                new ParameterizedTypeReference<List<Account>>() {}).getBody();


        PaymentAccount creditorAccount = new PaymentAccount();
        creditorAccount.setIdentification(merchantAccount.get(0).getIban());
        creditorAccount.setName(merchantAccount.get(0).getName());
        creditorAccount.setSchemeName("IBAN");

        PaymentAccount debtorAccount = new PaymentAccount();
        debtorAccount.setIdentification(customerAccount.getIban());
        debtorAccount.setName(customerAccount.getName());
        debtorAccount.setSchemeName("IBAN");

        InstructedAmount instructedAmount = new InstructedAmount();
        instructedAmount.setAmount(initiatePayment.getAmount());
        instructedAmount.setCurrency("EUR");

        RemittanceInformation remittanceInformation = new RemittanceInformation();
        remittanceInformation.setReference("Mine");

        String endToEndIdentification = "122.54788.144F";
        String instructionIdentification = "AXE4";

        Initiation initiation = new Initiation();
        initiation.setEndToEndIdentification(endToEndIdentification);
        initiation.setInstructionIdentification(instructionIdentification);
        initiation.setInstructedAmount(instructedAmount);
        initiation.setRemittanceInformation(remittanceInformation);
        initiation.setCreditorAccount(creditorAccount);
        initiation.setDebtorAccount(debtorAccount);

        Data data = new Data();
        data.setInitiation(initiation);

        String paymentContextCode = "PersonToMerchant";
        Risk risk = new Risk();
        risk.setPaymentContextCode(paymentContextCode);

        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setData(data);
        paymentRequest.setRisk(risk);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer "+accessToken);

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = mapper.writeValueAsString(paymentRequest);

        HttpEntity<String> entity = new HttpEntity<>(jsonInString,headers);


        String response = restTemplate.postForObject(REST_SERVICE_URI+"/payment/payments",
                entity, String.class);

        return response;
    }

    private HttpEntity<String> getHttpEntity (){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer "+accessToken);

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return entity;
    }

}
