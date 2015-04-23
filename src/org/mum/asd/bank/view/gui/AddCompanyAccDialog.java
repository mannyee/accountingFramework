package org.mum.asd.bank.view.gui;

import java.awt.event.ActionEvent;

import org.mum.asd.bank.controller.AddCompanyAccController;
import org.mum.asd.bank.enums.MyAccountType;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.gui.CommonForm.JDialog_AddAccount;

import java.awt.*;

import javax.swing.*;

public class AddCompanyAccDialog extends JDialog_AddAccount {
	public AddCompanyAccDialog(AccountFrm parent) {
        super(parent);
        setTitle("Add Company Account");

        JLabel6.setText("No of employees");
        getContentPane().add(JLabel6);
        JLabel6.setForeground(java.awt.Color.black);
        JLabel6.setBounds(12, 204, 96, 24);

        repaint();
    }

    @Override
    protected void JButtonOK_actionPerformed(ActionEvent event) {
        String name, ct, st, str, zip, acnr, noe, em;
        name = JTextField_NAME.getText();
        ct = JTextField_CT.getText();
        st = JTextField_ST.getText();
        str = JTextField_STR.getText();
        zip = JTextField_ZIP.getText();
        acnr = JTextField_ACNR.getText();
        noe = JTextField_BD.getText();
        em = JTextField_EM.getText();
        
        if (JRadioButton_Chk.isSelected()) {
            MyAccountType accountType = MyAccountType.CHECKING;
            new AddCompanyAccController().createAccount(accountType, name, ct, st, str, zip, acnr, noe, em);
        } else if (JRadioButton_Sav.isSelected()) {
            MyAccountType accountType = MyAccountType.SAVING;
            new AddCompanyAccController().createAccount(accountType, name, ct, st, str, zip, acnr, noe, em);
        }
        
        dispose();
        setVisible(false);

    }

}