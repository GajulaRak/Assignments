package com.example;

public class CurrentAccount extends Account{
	private String tinNumber;

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public CurrentAccount(String accName,String accNo,String bankName,String tinNumber) {
		super();
		this.tinNumber = tinNumber;
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println("TinNumber:"+getTinNumber());
			}
	
	

}
