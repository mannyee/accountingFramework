package org.mum.asd.framework.gui.CommonForm;

public class JDialog_Dialogview extends javax.swing.JDialog {

    private AccountFrm parentframe;
    private String accnr;

    public String getAccnr() {
        return accnr;
    }

    public void setAccnr(String accnr) {
        this.accnr = accnr;
    }

    public JDialog_Dialogview(AccountFrm parent, String aaccnr) {
        super(parent);
        parentframe = parent;
        accnr = aaccnr;
        // This code is automatically generated by Visual Cafe when you add
        // components to the visual environment. It instantiates and initializes
        // the components. To modify the code, only use code syntax that matches
        // what Visual Cafe can generate, or Visual Cafe may be unable to back
        // parse your Java file into its visual environment.
        //{{INIT_CONTROLS
        setTitle("Deposit");
        setModal(true);
        getContentPane().setLayout(null);
        setSize(268, 126);
        setVisible(false);
        JLabel1.setText("Acc Nr");
        getContentPane().add(JLabel1);
        JLabel1.setForeground(java.awt.Color.black);
        JLabel1.setBounds(12, 12, 48, 24);
        JLabel2.setText("Amount");
        getContentPane().add(JLabel2);
        JLabel2.setForeground(java.awt.Color.black);
        JLabel2.setBounds(12, 48, 48, 24);
        JTextField_NAME.setEditable(false);
        getContentPane().add(JTextField_NAME);
        JTextField_NAME.setBounds(84, 12, 144, 24);
        JButton_OK.setText("OK");
        JButton_OK.setActionCommand("OK");
        getContentPane().add(JButton_OK);
        JButton_OK.setBounds(36, 84, 84, 24);
        JButton_Cancel.setText("Cancel");
        JButton_Cancel.setActionCommand("Cancel");
        getContentPane().add(JButton_Cancel);
        JButton_Cancel.setBounds(156, 84, 84, 24);
        getContentPane().add(JTextField_Deposit);
        JTextField_Deposit.setBounds(84, 48, 144, 24);
        //}}
        JTextField_NAME.setText(accnr);

        //{{REGISTER_LISTENERS
        SymAction lSymAction = new SymAction();
        JButton_OK.addActionListener(lSymAction);
        JButton_Cancel.addActionListener(lSymAction);
        //}}
    }

    //{{DECLARE_CONTROLS
    protected javax.swing.JLabel JLabel1 = new javax.swing.JLabel();
    protected javax.swing.JLabel JLabel2 = new javax.swing.JLabel();
    protected javax.swing.JTextField JTextField_NAME = new javax.swing.JTextField();
    protected javax.swing.JButton JButton_OK = new javax.swing.JButton();
    protected javax.swing.JButton JButton_Cancel = new javax.swing.JButton();
    protected javax.swing.JTextField JTextField_Deposit = new javax.swing.JTextField();
    //}}

    protected class SymAction implements java.awt.event.ActionListener {

        public void actionPerformed(java.awt.event.ActionEvent event) {
            Object object = event.getSource();
            if (object == JButton_OK) {
                JButtonOK_actionPerformed(event);
            } else if (object == JButton_Cancel) {
                JButtonCalcel_actionPerformed(event);
            }
        }
    }

    protected void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
//        parentframe.amountDeposit = JTextField_Deposit.getText();
//        String amount=JTextField_Deposit.getText();
//        dispose();
    }

    protected void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {
        dispose();
    }

}
