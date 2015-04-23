package org.mum.asd.bank.model;

import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.partyPattern.IParty;
import org.mum.asd.framework.transaction.ITransaction;

public class CheckingAccount extends AAccount {

    public CheckingAccount() {
        super.setType("Ch");
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
