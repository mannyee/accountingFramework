package org.mum.asd.bank.model;

import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.partyPattern.IParty;

public class SavingAccount extends AAccount {

    public SavingAccount() {
        super.setType("S");
    }

    

    public double getCurrentBalance() {
        return super.getBalance();
    }

    @Override
    public void setParty(IParty iParty) {
        super.setParty(iParty);

    }

    @Override
    public Double getInterest() {
        return 5d;
    }

}
