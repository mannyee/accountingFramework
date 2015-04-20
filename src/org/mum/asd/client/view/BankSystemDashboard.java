package org.mum.asd.client.view;


import java.awt.event.ActionListener;


import javax.swing.*;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;

/**
 * A basic JFC based application.
 */
public class BankSystemDashboard extends AccountFrm {

    static {
//        FactoryProducer.addAbstractFactory(MyAccountType.MYAC, new MyAccountFactory());
    }

    public static BankSystemDashboard bank;

    public static BankSystemDashboard getInstance() {
        if (bank == null) {
            bank = new BankSystemDashboard();
//            ClassicSingleton.setAccountFrm(bank);
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

//        JButton_CompAC.addActionListener(new AddCompanyController());
//        JButton_PerAC.addActionListener(new AddPersonController());
//        JButton_Deposit.addActionListener(new DepositController());
//        JButton_Withdraw.addActionListener(new WithdrawController());
    }

}
