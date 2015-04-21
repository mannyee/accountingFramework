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

	
	public void createAccount(MyAccountType accountType, String name, String ct, String st, String str, String zip, String acnr, String bd, String em) {
        IAccount account = AppFactory.getFactory(MyAccountType.MYAC).getAccount(accountType);
        IParty party = AppFactory.getFactory(Types.PARTY).getParty(PartyType.PERSONAL);
        
        AAccount absAccount = (AAccount)account;
        absAccount.setAcctNumber(acnr);
        account = absAccount;
        
        Person person = (Person) party;
        person.setName(name);
        person.setCity(ct);
        person.setState(st);
        person.setStreet(str);
        person.setZip(zip);
        /*try{
            person.setDateOfBirth(new Date(bd));
        }catch(IllegalArgumentException e){
            System.err.println("IllegalArgumentException in setDateOfBirth");
        }*/
        person.setEmail(em);
        party = person;
        
        party.addAccount(account);
        account.setParty(party);
        
        System.out.println("party.getName(): " + party.getName());
        
        System.out.println("is account null? " + account ==null);
        System.out.println("account.getParty(): " + account.getParty());
        
        AppInitiator.getAccManger().addAccountToList(account);

    }
}
