/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.AccountManager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class AccountManager {
    
    public List<IAccount> listOfAccount;
    public AccountManager() {
    	listOfAccount = new ArrayList<IAccount>();
	}
    
    
    public List<IAccount> getAccountList(){
        
        return listOfAccount;
    }
    
    
    public void addAccountToList(IAccount account) {
        this.listOfAccount.add(account);
        //this.send(new Message(ACCOUNT_LIST_NOT_EMPTY, true));
        //this.updateAccountTable();
    }
    
}
