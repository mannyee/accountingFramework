package org.mum.asd.client.view;


import java.awt.event.ActionListener;

import javax.swing.*;

import org.mum.asd.client.controller.AddCompanyAccController;
import org.mum.asd.client.controller.AddPersonalAccController;
import org.mum.asd.client.controller.DepositController;
import org.mum.asd.client.controller.ReportController;
import org.mum.asd.client.controller.WithdrawController;
import org.mum.asd.client.enums.MyAccountType;
import org.mum.asd.client.model.MyAccountFactory;
import org.mum.asd.client.view.bank.ReportButton;
import org.mum.asd.framework.factory.AppFactory;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.gui.components.ext.PersonalAccountButton;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.main.FinCo;

/**
 * A basic JFC based application.
 */
public class BankSystemDashboard extends AccountFrm {
	protected ReportButton JButton_Report = new ReportButton();

    static {
        AppFactory.addAbstractFactory(MyAccountType.MYAC, new MyAccountFactory());
        bank = new BankSystemDashboard();
    }
    

    public static BankSystemDashboard bank;

    public static BankSystemDashboard getInstance() {
            bank = new BankSystemDashboard();
        return bank;
    }
       public static void main(String[] args) {
        AppInitiator.setAccForm(bank);
        FinCo.initializeApp();
    }

    public BankSystemDashboard() {
        setTitle("Bank Application");
        
        JPanel1.add(JButton_Report);
        JButton_Report.setBounds(24, 60, 192, 29);
        JButton_Report.setText("Generate Report");

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
        for (ActionListener al : JButton_Report.getActionListeners()) {
        	JButton_Report.removeActionListener(al);
        }

        JButton_CompAC.addActionListener(new AddCompanyAccController());
        JButton_PerAC.addActionListener(new AddPersonalAccController());
        JButton_Deposit.addActionListener(new DepositController());
        JButton_Withdraw.addActionListener(new WithdrawController());
        JButton_Report.addActionListener(new ReportController());
        
       
        
    }

}
