package org.mum.asd.client.controller;

import java.awt.event.ActionEvent;

import org.mum.asd.client.enums.MyAccountType;
import org.mum.asd.client.view.bank.AddCompanyAccDialog;
import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.AccountManager.AccountManager;
import org.mum.asd.framework.AccountManager.BasicAccount;
import org.mum.asd.framework.AccountManager.IAccount;
import org.mum.asd.framework.controller.BaseController;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.partyPattern.AParty;
import org.mum.asd.framework.partyPattern.Company;
import org.mum.asd.framework.partyPattern.IParty;

public class AddCompanyAccController implements BaseController {
    //TODO add account manager here, maybe utilise basecontroller here
    //private AccountManager accountManager = null;

    public AddCompanyAccController() {
        //accountManager = ClassicSingleton.getInstanceAccountManager();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        AccountFrm accountFrm = AppInitiator.getAccForm();
        AddCompanyAccDialog pac = new AddCompanyAccDialog(accountFrm);
        pac.setBounds(450, 20, 300, 330);
        pac.show();

    }

    public void createAccount(MyAccountType accountType, String name, String ct, String st, String str, String zip, String acnr, String noe, String em) {
        AAccount account = new BasicAccount();
//        AAccount aAccount = 
        account.setAcctNumber(acnr);

//        account = aAccount;
//        IParty party=FactoryProducer.getFactory(Types.PARTY).getParty(PartyType.COMPANY);
        Company c = new Company();

        c.setName(name);
        c.setCity(ct);
        c.setState(st);
        c.setStreet(str);
        c.setZip(zip);

        try {
            c.setNoOfEmployee(Integer.parseInt(noe));
        } catch (NumberFormatException e) {
            System.err.println("Number formate in noofemplyee");
            c.setNoOfEmployee(1);
        }
        c.setEmail(em);
//        party=c;
//        party.addAccount(account);

//        AParty party = new Company();
//        party = c;
        account.setParty(c);
        AccountManager am = AppInitiator.getAccManger();
        am.addAccountToList(account);

    }

}
