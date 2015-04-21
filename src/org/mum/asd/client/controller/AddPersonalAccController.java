package org.mum.asd.client.controller;

import java.awt.event.ActionEvent;
import java.util.Date;

import org.mum.asd.client.enums.MyAccountType;
import org.mum.asd.client.view.bank.AddPersonalAccDialog;
import org.mum.asd.framework.AccountManager.AccountManager;
import org.mum.asd.framework.AccountManager.BasicAccount;
import org.mum.asd.framework.AccountManager.IAccount;
import org.mum.asd.framework.controller.BaseController;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.gui.CommonForm.JDialog_AddAccount;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.partyPattern.Person;
import org.mum.asd.framework.singleton.ClassicSingleton;

public class AddPersonalAccController implements BaseController{

	public AddPersonalAccController() {
		// TODO we need an account manager here
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		AccountFrm accountFrm = ClassicSingleton.getInstanceAccountFrm();
		AddPersonalAccDialog pac = new AddPersonalAccDialog(accountFrm);
        pac.setBounds(450, 20, 300, 330);
        pac.show();		
	}

	
	public void createAccount(MyAccountType accountType, String name, String ct, String st, String str, String zip, String acnr, String bd, String em) {
        /*IAccount account = FactoryProducer.getFactory(MyAccountType.MYAC).getAccount(accountType);
        IParty party = FactoryProducer.getFactory(Types.PARTY).getParty(PartyType.PERSONAL);
        AAccount aAccount = (AAccount) account;
        aAccount.setAcctNumber(acnr);

        account = aAccount;*/
		
		IAccount account = new BasicAccount();
		account.setAcctNumber(acnr);

        // Person c = (Person) party;
		Person person = new Person();
        person.setName(name);
        person.setCity(ct);
        person.setState(st);
        person.setStreet(str);
        person.setZip(zip);
        try{
            person.setDateOfBirth(new Date(bd));
        }catch(IllegalArgumentException e){
            System.err.println("IllegalArgumentException in setDateOfBirth");
        }
        person.setEmail(em);
       /* party = person;
        party.addAccount(account);
        ClassicSingleton.getInstanceAccountManager().addAccountToList(account);*/
        
        AppInitiator.getAccManger().addAccountToList(account);
        AccountManager ac = AppInitiator.getAccManger();

    }
}
