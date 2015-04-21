/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.partyPattern;

/**
 *
 * @author Raj
 */
public class Company extends AParty implements ICompany {

	private Integer employeeNumber;

	public double getBalance() {
		return 0d;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public void setNoOfEmployee(Integer parseInt) {
		this.employeeNumber = parseInt;

	}

}
