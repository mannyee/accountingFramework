package org.mum.asd.framework.main;

import org.mum.asd.framework.AccountManager.AccountManager;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;

public class AppInitiator {
	private static AccountFrm accForm = null;
	private static AccountManager accManager = null;

	public static AccountFrm getAccForm() {
		if(accForm == null){
			accForm = new AccountFrm();
		}
		return accForm;
	}

	public static void setAccForm(AccountFrm accForm) {
		AppInitiator.accForm = accForm;
	}

	public static AccountManager getAccManger() {
		if(accManager == null)
			accManager = new AccountManager();
		
		return accManager;
	}

	public static void setAccManger(AccountManager accManger) {
		AppInitiator.accManager = accManger;
	}

}
