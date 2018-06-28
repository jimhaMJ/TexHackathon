package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class Data
{
    private Initiation Initiation;

    public Initiation getInitiation ()
    {
        return Initiation;
    }

    public void setInitiation (Initiation Initiation)
    {
        this.Initiation = Initiation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Initiation = "+Initiation+"]";
    }
}