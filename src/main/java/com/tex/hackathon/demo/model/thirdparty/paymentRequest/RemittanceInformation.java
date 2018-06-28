package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class RemittanceInformation
{
    private String Unstructured;

    private String Reference;

    public String getUnstructured ()
    {
        return Unstructured;
    }

    public void setUnstructured (String Unstructured)
    {
        this.Unstructured = Unstructured;
    }

    public String getReference ()
    {
        return Reference;
    }

    public void setReference (String Reference)
    {
        this.Reference = Reference;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Unstructured = "+Unstructured+", Reference = "+Reference+"]";
    }
}
