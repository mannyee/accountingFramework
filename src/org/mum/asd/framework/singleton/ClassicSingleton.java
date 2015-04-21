package org.mum.asd.framework.singleton;

import org.mum.asd.framework.gui.CommonForm.AccountFrm;

public class ClassicSingleton {

    private static AccountFrm instance = null;
//    private static AccountManager accountManager = null;
//    private static TransactionManager transactionManager = null;
//    private static Mediator mediator = null;

    protected ClassicSingleton() {
        // Exists only to defeat instantiation.
    }

    public static void setAccountFrm(AccountFrm accountFrm) {
        instance = accountFrm;
    }

    public static AccountFrm getInstanceAccountFrm() {
        if (instance == null) {
            instance = new AccountFrm();
        }
        return instance;
    }

    /*
    public static AccountManager getInstanceAccountManager() {
        if (accountManager == null) {
            accountManager = new AccountManager(getMediator());
        }
        return accountManager;
    }

    public static TransactionManager getInstanceTransactionManager() {
        if (transactionManager == null) {
            transactionManager = new TransactionManager(getMediator());
        }
        return transactionManager;
    }

    public static Mediator getMediator() {
        if (mediator == null) {
            mediator = new Mediator();
        }
        return mediator;
    }*/
}