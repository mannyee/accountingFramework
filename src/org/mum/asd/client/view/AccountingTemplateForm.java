/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.client.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.mum.asd.gui.bank.BankFrm;

/**
 *
 * @author Raj
 */
public abstract class AccountingTemplateForm extends JFrame {

    //bank
    public String clientName, street, city, zip, state, accountType, amountDeposit;
    //String accountnr,clientType
    public boolean newaccount;//all  public by me
    private DefaultTableModel model;
    private JTable JTable1;
    private JScrollPane JScrollPane1;
    // BankFrm myframe;
    private Object rowdata[];

//    //card
//    String clientName, street, city, zip, state, accountType, amountDeposit;
//    //String expdate, ccnumber;
//    boolean newaccount;
//    private DefaultTableModel model;
//    private JTable JTable1;
//    private JScrollPane JScrollPane1;
//    // CardFrm thisframe;
//    private Object rowdata[];
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStatee() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAmountDeposit() {
        return amountDeposit;
    }

    public void setAmountDeposit(String amountDeposit) {
        this.amountDeposit = amountDeposit;
    }

    public boolean isNewaccount() {
        return newaccount;
    }

    public void setNewaccount(boolean newaccount) {
        this.newaccount = newaccount;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JTable getJTable1() {
        return JTable1;
    }

    public void setJTable1(JTable JTable1) {
        this.JTable1 = JTable1;
    }

    public JScrollPane getJScrollPane1() {
        return JScrollPane1;
    }

    public void setJScrollPane1(JScrollPane JScrollPane1) {
        this.JScrollPane1 = JScrollPane1;
    }

    public Object[] getRowdata() {
        return rowdata;
    }

    public void setRowdata(Object[] rowdata) {
        this.rowdata = rowdata;
    }

}
