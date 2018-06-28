package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class PaymentRequest
{
    private Risk Risk;

    private Data Data;

    public Risk getRisk ()
    {
        return Risk;
    }

    public void setRisk (Risk Risk)
    {
        this.Risk = Risk;
    }

    public Data getData ()
    {
        return Data;
    }

    public void setData (Data Data)
    {
        this.Data = Data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Risk = "+Risk+", Data = "+Data+"]";
    }
}

