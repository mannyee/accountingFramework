/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.AccountManager;

import java.util.ArrayList;
import java.util.List;
import org.mum.asd.framework.mediator.IColleague;
import org.mum.asd.framework.mediator.ISenderColleague;
import org.mum.asd.framework.mediator.Mediator;
import org.mum.asd.framework.mediator.Message;

/**
 *
 * @author dell
 */
public class AccountManager implements ISenderColleague {

    private static final String NAME = "ACCOUNT_MANAGER";
    public static final String ACCOUNT_SELECTED = "ACCOUNT_SELECTED";
    public static final String ACCOUNT_LIST_NOT_EMPTY = "ACCOUNT_LIST_NOT_EMPTY";
    public static final String UPDATE_ACCOUNT_TABLE = "UPDATE_ACCOUNT_TABLE";
    private Mediator mediator;

    public List<IAccount> listOfAccount;

    public AccountManager(Mediator md) {
        listOfAccount = new ArrayList<IAccount>();
        mediator = md;
    }

    public List<IAccount> getAccountList() {
        return listOfAccount;
    }

    public void addAccountToList(IAccount account) {
        System.out.println(account.getParty());
        this.listOfAccount.add(account);
        this.send(new Message(UPDATE_ACCOUNT_TABLE, true));
//        updateAccountTable();
    }

    @Override
    public void send(Message message) {
        mediator.send(this, message);
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void updateAccountTable() {
        this.send(new Message(UPDATE_ACCOUNT_TABLE, true));
    }

}
