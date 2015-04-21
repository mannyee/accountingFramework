package org.mum.asd.client.model;

import org.mum.asd.client.enums.MyAccountType;
import org.mum.asd.framework.AccountManager.IAccount;
import org.mum.asd.framework.factory.AccountFactory;

public class MyAccountFactory extends AccountFactory {

    public MyAccountFactory() {
    }

    @Override
    public IAccount getAccount(Enum type) {
        if (type == MyAccountType.CHECKING) {
            return new CheckingAccount();
        } else if (type == MyAccountType.SAVING) {
            return new SavingAccount();
        }
        return null;
    }

}