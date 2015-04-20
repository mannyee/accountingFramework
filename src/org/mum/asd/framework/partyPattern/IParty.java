package org.mum.asd.framework.partyPattern;

public interface IParty {
//	public void addAcccount(Account account);
//	public void removeAccount(Account account);
	//public void sendEmail(Functor f, Predicate p);
	public String getType();
	public String getName();
	public void setName(String name);
	public double getBalance();
}
