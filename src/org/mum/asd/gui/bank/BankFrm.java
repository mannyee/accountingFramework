package org.mum.asd.gui.bank;

import org.mum.asd.gui.ccard.JDialog_Deposit;
import org.mum.asd.gui.ccard.JDialog_AddCompAcc;
import org.mum.asd.gui.ccard.JDialog_Withdraw;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import org.mum.asd.client.view.AccountingTemplateForm;

/**
 * A basic JFC based application.
 */
public class BankFrm extends AccountingTemplateForm {

    /**
     * **
     * init variables in the object **
     */
//    public String accountnr, clientName, street, city, zip, state, accountType, clientType, amountDeposit;
//    public boolean newaccount;//all  public by me
//    private DefaultTableModel model;
//    private JTable JTable1;
//    private JScrollPane JScrollPane1;
    BankFrm myframe;
    String accountnr;
//    private Object rowdata[];

    public String ccnumber;//added by me
    public String expdate;//added by me

    public BankFrm() {
        myframe = this;

        setTitle("Bank Application.");
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(0, 0));
        setSize(575, 310);
        setVisible(false);
        JPanel1.setLayout(null);
        getContentPane().add(BorderLayout.CENTER, JPanel1);
        JPanel1.setBounds(0, 0, 575, 310);
        /*
         /Add five buttons on the pane 
         /for Adding personal account, Adding company account
         /Deposit, Withdraw and Exit from the system
         */
        // JScrollPane1 = new JScrollPane();
        setJScrollPane1(new JScrollPane());
        // model = new DefaultTableModel();
        setModel(new DefaultTableModel());
        //JTable1 = new JTable(model);
        setJTable1(new JTable(getModel()));
        // model.addColumn("AccountNr");
        getModel().addColumn("AccountNr");
        //model.addColumn("Name");
        getModel().addColumn("Name");
        // model.addColumn("City");
        getModel().addColumn("City");
        // model.addColumn("P/C");
        getModel().addColumn("P/C");
        // model.addColumn("Ch/S");
        getModel().addColumn("Ch/S");
        //model.addColumn("Amount");
        getModel().addColumn("Amount");
        //rowdata = new Object[8];
        setRowdata(new Object[8]);
        newaccount = false;

        // JPanel1.add(JScrollPane1);
        JPanel1.add(getJScrollPane1());
        // JScrollPane1.setBounds(12, 92, 444, 160);
        getJScrollPane1().setBounds(12, 92, 444, 160);
        //JScrollPane1.getViewport().add(JTable1);
        getJScrollPane1().getViewport().add(getJTable1());
        //JTable1.setBounds(0, 0, 420, 0);
        getJTable1().setBounds(0, 0, 420, 0);
//        rowdata = new Object[8];
        setRowdata(new Object[8]);

        JButton_PerAC.setText("Add personal account");
        JPanel1.add(JButton_PerAC);
        JButton_PerAC.setBounds(24, 20, 192, 33);
        JButton_CompAC.setText("Add company account");
        JButton_CompAC.setActionCommand("jbutton");
        JPanel1.add(JButton_CompAC);
        JButton_CompAC.setBounds(240, 20, 192, 33);
        JButton_Deposit.setText("Deposit");
        JPanel1.add(JButton_Deposit);
        JButton_Deposit.setBounds(468, 104, 96, 33);
        JButton_Withdraw.setText("Withdraw");
        JPanel1.add(JButton_Withdraw);
        JButton_Addinterest.setBounds(448, 20, 106, 33);
        JButton_Addinterest.setText("Add interest");
        JPanel1.add(JButton_Addinterest);
        JButton_Withdraw.setBounds(468, 164, 96, 33);
        JButton_Exit.setText("Exit");
        JPanel1.add(JButton_Exit);
        JButton_Exit.setBounds(468, 248, 96, 31);
        // lineBorder1.setRoundedCorners(true);
        // lineBorder1.setLineColor(java.awt.Color.green);
        //$$ lineBorder1.move(24,312);

        JButton_PerAC.setActionCommand("jbutton");

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();
        JButton_Exit.addActionListener(lSymAction);
        JButton_PerAC.addActionListener(lSymAction);
        JButton_CompAC.addActionListener(lSymAction);
        JButton_Deposit.addActionListener(lSymAction);
        JButton_Withdraw.addActionListener(lSymAction);
        JButton_Addinterest.addActionListener(lSymAction);

    }

    /**
     * ***************************************************
     * The entry point for this application. Sets the Look and Feel to the
     * System Look and Feel. Creates a new JFrame1 and makes it visible.
     * ***************************************************
     */
    static public void main(String args[]) {
        try {
            // Add the following code if you want the Look and Feel
            // to be set to the Look and Feel of the native system.

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }

            //Create a new instance of our application's frame, and make it visible.
            (new BankFrm()).setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }

    javax.swing.JPanel JPanel1 = new javax.swing.JPanel();
    javax.swing.JButton JButton_PerAC = new javax.swing.JButton();
    javax.swing.JButton JButton_CompAC = new javax.swing.JButton();
    javax.swing.JButton JButton_Deposit = new javax.swing.JButton();
    javax.swing.JButton JButton_Withdraw = new javax.swing.JButton();
    javax.swing.JButton JButton_Addinterest = new javax.swing.JButton();
    javax.swing.JButton JButton_Exit = new javax.swing.JButton();

    void exitApplication() {
        try {
            this.setVisible(false);    // hide the Frame
            this.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends java.awt.event.WindowAdapter {

        public void windowClosing(java.awt.event.WindowEvent event) {
            Object object = event.getSource();
            if (object == BankFrm.this) {
                BankFrm_windowClosing(event);
            }
        }
    }

    void BankFrm_windowClosing(java.awt.event.WindowEvent event) {
        // to do: code goes here.

        BankFrm_windowClosing_Interaction1(event);
    }

    void BankFrm_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

    class SymAction implements java.awt.event.ActionListener {

        public void actionPerformed(java.awt.event.ActionEvent event) {
            Object object = event.getSource();
            if (object == JButton_Exit) {
                JButtonExit_actionPerformed(event);
            } else if (object == JButton_PerAC) {
                JButtonPerAC_actionPerformed(event);
            } else if (object == JButton_CompAC) {
                JButtonCompAC_actionPerformed(event);
            } else if (object == JButton_Deposit) {
                JButtonDeposit_actionPerformed(event);
            } else if (object == JButton_Withdraw) {
                JButtonWithdraw_actionPerformed(event);
            } else if (object == JButton_Addinterest) {
                JButtonAddinterest_actionPerformed(event);
            }

        }
    }

    //When the Exit button is pressed this code gets executed
    //this will exit from the system
    void JButtonExit_actionPerformed(java.awt.event.ActionEvent event) {
        System.exit(0);
    }

    void JButtonPerAC_actionPerformed(java.awt.event.ActionEvent event) {
        /*
         JDialog_AddPAcc type object is for adding personal information
         construct a JDialog_AddPAcc type object 
         set the boundaries and show it 
         */

        JDialog_AddCompAcc pac = new JDialog_AddPAcc(myframe);
        pac.setBounds(450, 20, 300, 330);
        pac.show();

        if (newaccount) {
            // add row to table
//            rowdata[0] = accountnr;
//            rowdata[1] = clientName;
//            rowdata[2] = city;
//            rowdata[3] = "P";
//            rowdata[4] = accountType;
//            rowdata[5] = "0";
//            model.addRow(rowdata);
//            JTable1.getSelectionModel().setAnchorSelectionIndex(-1);

            getRowdata()[0] = accountnr;
            getRowdata()[1] = clientName;
            getRowdata()[2] = city;
            getRowdata()[3] = "P";
            getRowdata()[4] = accountType;
            getRowdata()[5] = "0";
            getModel().addRow(getRowdata());
            getJTable1().getSelectionModel().setAnchorSelectionIndex(-1);

            newaccount = false;
        }

    }

    void JButtonCompAC_actionPerformed(java.awt.event.ActionEvent event) {
        /*
         construct a JDialog_AddCompAcc type object 
         set the boundaries and 
         show it 
         */

        JDialog_AddCompAcc pac = new JDialog_AddCompAcc(myframe);
        pac.setBounds(450, 20, 300, 330);
        pac.show();

        if (newaccount) {
            // add row to table
            getRowdata()[0] = accountnr;
            getRowdata()[1] = clientName;
            getRowdata()[2] = city;
            getRowdata()[3] = "C";
            getRowdata()[4] = accountType;
            getRowdata()[5] = "0";
            getModel().addRow(getRowdata());
            getJTable1().getSelectionModel().setAnchorSelectionIndex(-1);
            newaccount = false;
        }

    }

    void JButtonDeposit_actionPerformed(java.awt.event.ActionEvent event) {
        // get selected name
        int selection = getJTable1().getSelectionModel().getMinSelectionIndex();
        if (selection >= 0) {
            String accnr = (String) getModel().getValueAt(selection, 0);

            //Show the dialog for adding deposit amount for the current mane
            JDialog_Deposit dep = new JDialog_Deposit(myframe, accnr);
            dep.setBounds(430, 15, 275, 140);
            dep.show();

            // compute new amount
            long deposit = Long.parseLong(amountDeposit);
            String samount = (String) getModel().getValueAt(selection, 5);
            long currentamount = Long.parseLong(samount);
            long newamount = currentamount + deposit;
            getModel().setValueAt(String.valueOf(newamount), selection, 5);
        }

    }

    void JButtonWithdraw_actionPerformed(java.awt.event.ActionEvent event) {
        // get selected name
        int selection = getJTable1().getSelectionModel().getMinSelectionIndex();
        if (selection >= 0) {
            String accnr = (String) getModel().getValueAt(selection, 0);

            //Show the dialog for adding withdraw amount for the current mane
            JDialog_Withdraw wd = new JDialog_Withdraw(myframe, accnr);
            wd.setBounds(430, 15, 275, 140);
            wd.show();

            // compute new amount
            long deposit = Long.parseLong(amountDeposit);
            String samount = (String) getModel().getValueAt(selection, 5);
            long currentamount = Long.parseLong(samount);
            long newamount = currentamount - deposit;
            getModel().setValueAt(String.valueOf(newamount), selection, 5);
            if (newamount < 0) {
                JOptionPane.showMessageDialog(JButton_Withdraw, " Account " + accnr + " : balance is negative: $" + String.valueOf(newamount) + " !", "Warning: negative balance", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    void JButtonAddinterest_actionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(JButton_Addinterest, "Add interest to all accounts", "Add interest to all accounts", JOptionPane.WARNING_MESSAGE);

    }
}
