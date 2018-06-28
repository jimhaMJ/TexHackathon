package com.tex.hackathon.demo.model.thirdparty.paymentRequest;

public class Initiation
{
    private PaymentAccount creditorPaymentAccount;

    private PaymentAccount debtorPaymentAccount;

    private String EndToEndIdentification;

    private InstructedAmount InstructedAmount;

    private RemittanceInformation RemittanceInformation;

    private String InstructionIdentification;

    public PaymentAccount getCreditorPaymentAccount()
    {
        return creditorPaymentAccount;
    }

    public void setCreditorPaymentAccount(PaymentAccount creditorPaymentAccount)
    {
        this.creditorPaymentAccount = creditorPaymentAccount;
    }

    public PaymentAccount getDebtorPaymentAccount()
    {
        return debtorPaymentAccount;
    }

    public void setDebtorPaymentAccount(PaymentAccount debtorPaymentAccount)
    {
        this.debtorPaymentAccount = debtorPaymentAccount;
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
        return "ClassPojo [creditorPaymentAccount = "+ creditorPaymentAccount +", debtorPaymentAccount = "+ debtorPaymentAccount +", EndToEndIdentification = "+EndToEndIdentification+", InstructedAmount = "+InstructedAmount+", RemittanceInformation = "+RemittanceInformation+", InstructionIdentification = "+InstructionIdentification+"]";
    }
}
