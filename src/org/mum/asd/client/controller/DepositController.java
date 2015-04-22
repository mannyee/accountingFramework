package org.mum.asd.client.controller;

import java.awt.event.ActionEvent;

import org.mum.asd.client.view.bank.DepositDialog;
import org.mum.asd.framework.AccountManager.AAccount;
import org.mum.asd.framework.AccountManager.AccountManager;
import org.mum.asd.framework.AccountManager.IAccount;
import org.mum.asd.framework.controller.BaseController;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.transaction.ATransaction;
import org.mum.asd.framework.transaction.ITransaction;
import org.mum.asd.framework.transaction.WithDrawl;

public class DepositController implements BaseController {

    private AccountManager accountManager;

    public DepositController() {
        accountManager = AppInitiator.getAccManger();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        AccountFrm accountFrm = AppInitiator.getAccForm();
        String accnr = accountFrm.getAccountNo();
        DepositDialog dep = new DepositDialog(accountFrm, accnr);
        dep.setBounds(430, 15, 275, 140);
        dep.show();

    }

    public void deposite(String accrno, String amount, String name) {
        try {
            IAccount account = accountManager.getAccountById(accrno);
            ITransaction iTransaction = new WithDrawl();
            iTransaction.setAmount(Double.parseDouble(amount));
            iTransaction.setName(name);
            accountManager.deposite((AAccount)account, (ATransaction)iTransaction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
