package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class Account
{
    private String Name;

    private String Identification;

    private String SchemeName;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getIdentification ()
    {
        return Identification;
    }

    public void setIdentification (String Identification)
    {
        this.Identification = Identification;
    }

    public String getSchemeName ()
    {
        return SchemeName;
    }

    public void setSchemeName (String SchemeName)
    {
        this.SchemeName = SchemeName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", Identification = "+Identification+", SchemeName = "+SchemeName+"]";
    }
}
