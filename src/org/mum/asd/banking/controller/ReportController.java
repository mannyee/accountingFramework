package org.mum.asd.banking.controller;

import java.awt.event.ActionEvent;

import org.mum.asd.banking.view.gui.ReportDialog;
import org.mum.asd.framework.controller.BaseController;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;
import org.mum.asd.framework.main.AppInitiator;

public class ReportController implements BaseController{

	@Override
	public void actionPerformed(ActionEvent ae) {
		AccountFrm accountFrm = AppInitiator.getAccForm();
		ReportDialog dialog = new ReportDialog(accountFrm);
		String a = AppInitiator.getAccManger().generateReport().toString();
		dialog.setReport(a);
		dialog.setBounds(450, 20, 300, 330);
		dialog.show();
		
	}

}
