package org.mum.asd.client.model;

import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.partyPattern.IParty;
import org.mum.asd.framework.transaction.ITransaction;

public class SavingAccount extends AAccount{

	public SavingAccount() {
        super.setType("S");
    }
	
	@Override
	public void addEntry(ITransaction transaction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCurrentBalance() {
		return super.getBalance();
	}

	@Override
	public void setParty(IParty iParty) {
		super.setParty(iParty);
		
	}

}
