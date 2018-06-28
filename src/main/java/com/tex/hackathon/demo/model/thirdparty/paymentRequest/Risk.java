package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class Risk
{
    private String PaymentContextCode;

    public String getPaymentContextCode ()
    {
        return PaymentContextCode;
    }

    public void setPaymentContextCode (String PaymentContextCode)
    {
        this.PaymentContextCode = PaymentContextCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PaymentContextCode = "+PaymentContextCode+"]";
    }
}
