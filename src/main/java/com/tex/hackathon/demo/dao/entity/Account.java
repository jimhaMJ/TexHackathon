package com.tex.hackathon.demo.dao.entity;

public class Account
{
    private String id;

    private String customerId;

    private AccountBalance accountBalance;

    private String accountStatus;

    private String balanceAmount;

    private String name;

    private String accountFamily;

    private String sortCodeAccountNumber;

    private String iban;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCustomerId ()
    {
        return customerId;
    }

    public void setCustomerId (String customerId)
    {
        this.customerId = customerId;
    }

    public AccountBalance getAccountBalance ()
    {
        return accountBalance;
    }

    public void setAccountBalance (AccountBalance accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public String getAccountStatus ()
    {
        return accountStatus;
    }

    public void setAccountStatus (String accountStatus)
    {
        this.accountStatus = accountStatus;
    }

    public String getBalanceAmount ()
    {
        return balanceAmount;
    }

    public void setBalanceAmount (String balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAccountFamily ()
    {
        return accountFamily;
    }

    public void setAccountFamily (String accountFamily)
    {
        this.accountFamily = accountFamily;
    }

    public String getSortCodeAccountNumber ()
{
    return sortCodeAccountNumber;
}

    public void setSortCodeAccountNumber (String sortCodeAccountNumber)
    {
        this.sortCodeAccountNumber = sortCodeAccountNumber;
    }

    public String getIban ()
    {
        return iban;
    }

    public void setIban (String iban)
    {
        this.iban = iban;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", customerId = "+customerId+", accountBalance = "+accountBalance+", accountStatus = "+accountStatus+", balanceAmount = "+balanceAmount+", name = "+name+", accountFamily = "+accountFamily+", sortCodeAccountNumber = "+sortCodeAccountNumber+", iban = "+iban+"]";
    }
}