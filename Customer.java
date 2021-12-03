package com.example;

public class Customer {
	String	customerName;
	String	customerEmail;
	String	customerType;
	String	customerAddress;
	
	public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerAddress = customerAddress;
	}

	void displayDetails() {
		System.out.println("Customer Name:"+customerName);
		System.out.println("Customer Email:"+customerEmail);
		System.out.println("Customer Type:"+customerType);
		System.out.println("Customer Address:"+customerAddress);
		
		
	}
	


}
