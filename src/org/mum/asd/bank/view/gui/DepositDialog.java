package org.mum.asd.bank.view.gui;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import org.mum.asd.bank.controller.DepositController;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.gui.CommonForm.TransactionDialog;

public class DepositDialog extends TransactionDialog {

    public DepositDialog(AccountFrm parent, String aaccnr) {
        super(parent, aaccnr);
        setTitle("Deposit Money");
    }

    @Override
    protected void JButtonOK_actionPerformed(ActionEvent event) {
        String name = JTextField_NAME.getText();
        String amount = JTextField_Deposit.getText();
        new DepositController().deposite(this.getAccnr(), amount, name);
        dispose();
        setVisible(false);
    }

}
