package org.mum.asd.client.model;

import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.partyPattern.IParty;
import org.mum.asd.framework.transaction.ITransaction;

public class CheckingAccount extends AAccount {

	public CheckingAccount() {
		super.setType("Ch");
	}

	@Override
	public void addEntry(ITransaction transaction) {
		// TODO Auto-generated method stub

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
