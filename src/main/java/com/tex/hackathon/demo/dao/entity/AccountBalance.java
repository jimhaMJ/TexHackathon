package com.tex.hackathon.demo.dao.entity;

public class AccountBalance
{
    private Amount Amount;

    private String AccountId;

    private String DateTime;

    public Amount getAmount ()
    {
        return Amount;
    }

    public void setAmount (Amount Amount)
    {
        this.Amount = Amount;
    }

    public String getAccountId ()
    {
        return AccountId;
    }

    public void setAccountId (String AccountId)
    {
        this.AccountId = AccountId;
    }

    public String getDateTime ()
    {
        return DateTime;
    }

    public void setDateTime (String DateTime)
    {
        this.DateTime = DateTime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Amount = "+Amount+", AccountId = "+AccountId+", DateTime = "+DateTime+"]";
    }
}