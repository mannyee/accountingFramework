package org.mum.asd.bank.model;

import org.mum.asd.bank.enums.MyAccountType;
import org.mum.asd.framework.AccountManager.IAccount;

public class BankFactory {

    

    public static IAccount getAccount(Enum type) {
        if (type == MyAccountType.CHECKING) {
            return new CheckingAccount();
        } else if (type == MyAccountType.SAVING) {
            return new SavingAccount();
        }
        return null;
    }

}