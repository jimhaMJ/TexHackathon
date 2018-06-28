package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class Initiation
{
    private PaymentAccount creditorAccount;

    private PaymentAccount debtorAccount;

    private String EndToEndIdentification;

    private InstructedAmount InstructedAmount;

    private RemittanceInformation RemittanceInformation;

    private String InstructionIdentification;

    public PaymentAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(PaymentAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public PaymentAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(PaymentAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
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

}
