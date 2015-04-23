package org.mum.asd.banking.view.gui;

import java.awt.event.ActionEvent;

import org.mum.asd.banking.controller.AddPersonalAccController;
import org.mum.asd.banking.enums.MyAccountType;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.gui.CommonForm.AccountDialog;

public class AddPersonalAccDialog extends AccountDialog {

	public AddPersonalAccDialog(AccountFrm parent) {
		super(parent);
		
		setTitle("Add Person Account");
		
		JLabel6.setText("Birthdate");
        getContentPane().add(JLabel6);
        JLabel6.setForeground(java.awt.Color.black);
        JLabel6.setBounds(12, 204, 96, 24);
	}
	
	
	@Override
    protected void JButtonOK_actionPerformed(ActionEvent event) {
        String name, ct, st, str, zip, acnr, bd, em;
        name = JTextField_NAME.getText();
        ct = JTextField_CT.getText();
        st = JTextField_ST.getText();
        str = JTextField_STR.getText();
        zip = JTextField_ZIP.getText();
        acnr = JTextField_ACNR.getText();
        bd = JTextField_BD.getText();
        em = JTextField_EM.getText();
        if (JRadioButton_Chk.isSelected()) {
            MyAccountType accountType = MyAccountType.CHECKING;
            new AddPersonalAccController().createAccount(accountType, name, ct, st, str, zip, acnr, bd, em);
        } else if (JRadioButton_Sav.isSelected()) {
            MyAccountType accountType = MyAccountType.SAVING;
            new AddPersonalAccController().createAccount(accountType, name, ct, st, str, zip, acnr, bd, em);
        }
        dispose();
        setVisible(false);
    }

}
