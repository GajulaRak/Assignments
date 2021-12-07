package com.example;

public class SavingAccount extends Account{
	private String orgName;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public SavingAccount(String accName,String accNo,String bankName,String orgName) {
		super();
		this.orgName = orgName;
		this.accName = accName;
		this.bankName = bankName;
		this.accNo = accNo;
	}

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
 public	void display() {
	 super.display();
	 System.out.println("Organisation Name:"+getOrgName());
 }
}
