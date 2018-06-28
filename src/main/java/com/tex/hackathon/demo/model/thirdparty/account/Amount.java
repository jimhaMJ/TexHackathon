package com.tex.hackathon.demo.model.thirdparty.account;

public class Amount
{
    private String Amount;

    private String Currency;

    public String getAmount ()
    {
        return Amount;
    }

    public void setAmount (String Amount)
    {
        this.Amount = Amount;
    }

    public String getCurrency ()
    {
        return Currency;
    }

    public void setCurrency (String Currency)
    {
        this.Currency = Currency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Amount = "+Amount+", Currency = "+Currency+"]";
    }
}
