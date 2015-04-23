package org.mum.asd.bank.view;


import java.awt.event.ActionListener;

import org.mum.asd.bank.controller.AddCompanyAccController;
import org.mum.asd.bank.controller.AddPersonalAccController;
import org.mum.asd.bank.controller.DepositController;
import org.mum.asd.bank.controller.ReportController;
import org.mum.asd.bank.controller.WithdrawController;
import org.mum.asd.bank.view.gui.ReportButton;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;
import org.mum.asd.framework.main.FinCo;

/**
 * A basic JFC based application.
 */
public class Bank extends AccountFrm {
	protected ReportButton JButton_Report = new ReportButton();

    static {
//        AppFactory.addAbstractFactory(MyAccountType.MYAC, new BankFactory());
        bank = new Bank();
    }
    

    public static Bank bank;

    public static Bank getInstance() {
            bank = new Bank();
        return bank;
    }
       public static void main(String[] args) {
        AppInitiator.setAccForm(bank);
        FinCo.initializeApp();
    }

    public Bank() {
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
