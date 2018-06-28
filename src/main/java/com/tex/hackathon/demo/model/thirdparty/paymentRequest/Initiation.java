package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class Initiation
{
    private Account CreditorAccount;

    private Account DebtorAccount;

    private String EndToEndIdentification;

    private InstructedAmount InstructedAmount;

    private RemittanceInformation RemittanceInformation;

    private String InstructionIdentification;

    public Account getCreditorAccount ()
    {
        return CreditorAccount;
    }

    public void setCreditorAccount (Account CreditorAccount)
    {
        this.CreditorAccount = CreditorAccount;
    }

    public Account getDebtorAccount ()
    {
        return DebtorAccount;
    }

    public void setDebtorAccount (Account DebtorAccount)
    {
        this.DebtorAccount = DebtorAccount;
    }

    public String getEndToEndIdentification ()
    {
        return EndToEndIdentification;
    }

    public void setEndToEndIdentification (String EndToEndIdentification)
    {
        this.EndToEndIdentification = EndToEndIdentification;
    }

    public InstructedAmount getInstructedAmount ()
    {
        return InstructedAmount;
    }

    public void setInstructedAmount (InstructedAmount InstructedAmount)
    {
        this.InstructedAmount = InstructedAmount;
    }

    public RemittanceInformation getRemittanceInformation ()
    {
        return RemittanceInformation;
    }

    public void setRemittanceInformation (RemittanceInformation RemittanceInformation)
    {
        this.RemittanceInformation = RemittanceInformation;
    }

    public String getInstructionIdentification ()
    {
        return InstructionIdentification;
    }

    public void setInstructionIdentification (String InstructionIdentification)
    {
        this.InstructionIdentification = InstructionIdentification;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CreditorAccount = "+CreditorAccount+", DebtorAccount = "+DebtorAccount+", EndToEndIdentification = "+EndToEndIdentification+", InstructedAmount = "+InstructedAmount+", RemittanceInformation = "+RemittanceInformation+", InstructionIdentification = "+InstructionIdentification+"]";
    }
}
