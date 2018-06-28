package com.tex.hackathon.demo.model.us;

public class InitiatePayment {

    private Long customerAccountId;
    private Long merchantId;
    private String amount;

    public Long getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(Long customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
