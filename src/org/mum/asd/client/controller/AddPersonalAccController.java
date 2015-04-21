package org.mum.asd.client.controller;

import java.awt.event.ActionEvent;
import java.util.Date;

import org.mum.asd.client.enums.MyAccountType;
import org.mum.asd.client.view.bank.AddPersonalAccDialog;
import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.AccountManager.IAccount;
import org.mum.asd.framework.controller.BaseController;
import org.mum.asd.framework.enums.PartyType;
import org.mum.asd.framework.enums.Types;
import org.mum.asd.framework.factory.AppFactory;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.partyPattern.IParty;
import org.mum.asd.framework.partyPattern.Person;

public class AddPersonalAccController implements BaseController{

	public AddPersonalAccController() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		AccountFrm accountFrm = AppInitiator.getAccForm();
		AddPersonalAccDialog pac = new AddPersonalAccDialog(accountFrm);
        pac.setBounds(450, 20, 300, 330);
        pac.show();		
	}

	
	public void createAccount(MyAccountType accType, String name,
			String city, String state, String street, String zip, String accNum,
			String dob, String email) throws IllegalArgumentException {
		
        IAccount account = AppFactory.getFactory(MyAccountType.MYAC).getAccount(accType);
        IParty party = AppFactory.getFactory(Types.PARTY).getParty(PartyType.PERSONAL);
        
        AAccount absAccount = (AAccount)account;
        absAccount.setAcctNumber(accNum);
        account = absAccount;
        
        Person person = (Person) party;
        person.setName(name);
        person.setCity(city);
        person.setState(state);
        person.setStreet(street);
        person.setZip(zip);
        person.setDateOfBirth(new Date(dob));
        person.setEmail(email);
        party = person;
        
        party.addAccount(account);
        account.setParty(party);
        
        AppInitiator.getAccManger().addAccountToList(account);

    }
}
