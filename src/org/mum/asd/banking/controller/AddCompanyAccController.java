package org.mum.asd.banking.controller;

import java.awt.event.ActionEvent;

import org.mum.asd.banking.enums.MyAccountType;
import org.mum.asd.banking.model.BankFactory;
import org.mum.asd.banking.view.gui.AddCompanyAccDialog;
import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.AccountManager.IAccount;
import org.mum.asd.framework.controller.BaseController;
import org.mum.asd.framework.enums.PartyType;
import org.mum.asd.framework.enums.Types;
import org.mum.asd.framework.factory.PartyFactory;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.partyPattern.Company;
import org.mum.asd.framework.partyPattern.IParty;

public class AddCompanyAccController implements BaseController {
    //TODO add account manager here, maybe utilise basecontroller here
    //private AccountManager accountManager = null;

    public AddCompanyAccController() {
        //accountManager = AppInstantiator.getInstanceAccountManager();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        AccountFrm accountFrm = AppInitiator.getAccForm();
        AddCompanyAccDialog dialog = new AddCompanyAccDialog(accountFrm);
        dialog.setBounds(450, 20, 300, 330);
        dialog.show();

    }

    public void createAccount(MyAccountType accType, String name, String city, String state, String str, String zip, String accNum, String numEmp, String email) throws NumberFormatException{
    	IAccount account = BankFactory.getAccount(accType);
        AAccount absAccount = (AAccount)account;
        absAccount.setAcctNumber(accNum);
        
        IParty party = PartyFactory.getParty(PartyType.COMPANY);
        Company company = (Company)party;

        company.setName(name);
        company.setCity(city);
        company.setState(state);
        company.setStreet(str);
		company.setZip(zip);
		company.setNoOfEmployee(Integer.parseInt(numEmp));
		company.setEmail(email);

       
        party = company;
        party.addAccount(account);
        account.setParty(party);
        
        AppInitiator.getAccManger().addAccountToList(account);

    }

}
