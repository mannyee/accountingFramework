package org.mum.asd.client.view;


import java.awt.event.ActionListener;

import javax.swing.*;

import org.mum.asd.client.controller.AddCompanyAccController;
import org.mum.asd.client.controller.AddPersonalAccController;
import org.mum.asd.client.controller.DepositController;
import org.mum.asd.client.controller.WithdrawController;
import org.mum.asd.client.enums.MyAccountType;
import org.mum.asd.client.model.MyAccountFactory;
import org.mum.asd.framework.factory.AppFactory;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;

/**
 * A basic JFC based application.
 */
public class BankSystemDashboard extends AccountFrm {

    static {
        AppFactory.addAbstractFactory(MyAccountType.MYAC, new MyAccountFactory());
    }

    public static BankSystemDashboard bank;

    public static BankSystemDashboard getInstance() {
        if (bank == null) {
            bank = new BankSystemDashboard();
            AppInitiator.setAccForm(bank);
        }
        return bank;
    }

    public BankSystemDashboard() {
        setTitle("Bank Application");

        //remove all listener that we have first
        for (ActionListener al : JButton_PerAC.getActionListeners()) {
            JButton_PerAC.removeActionListener(al);
        }
        for (ActionListener al : JButton_CompAC.getActionListeners()) {
            JButton_CompAC.removeActionListener(al);
        }
        for (ActionListener al : JButton_Deposit.getActionListeners()) {
            JButton_Deposit.removeActionListener(al);
        }
        for (ActionListener al : JButton_Withdraw.getActionListeners()) {
            JButton_Withdraw.removeActionListener(al);
        }

        JButton_CompAC.addActionListener(new AddCompanyAccController());
        JButton_PerAC.addActionListener(new AddPersonalAccController());
        JButton_Deposit.addActionListener(new DepositController());
        JButton_Withdraw.addActionListener(new WithdrawController());
    }

}
