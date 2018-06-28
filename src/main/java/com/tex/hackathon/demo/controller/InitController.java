package com.tex.hackathon.demo.controller;

import com.tex.hackathon.demo.dao.entity.Account;
import com.tex.hackathon.demo.dao.entity.User;
import com.tex.hackathon.demo.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer "+accessToken);

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        List<Account> accounts = restTemplate.exchange(
                REST_SERVICE_URI+"/account/accounts/customerId/" + user.getCustomerId(),
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Account>>() {}).getBody();

        return accounts;


    }
}
