package com.example;

public class TicketBoking {
	public String stageEvent;
	public String customer;
	public int noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBoking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public TicketBoking() {
		super();
	}
	public Double makepayment(Double amount) {
System.out.println("Stage Event"+getStageEvent());
System.out.println("Customer:"+getCustomer());
System.out.println("Number of seats:"+getNoOfSeats());
System.out.println("Amount"+amount);
return  amount;
	}
	public String makePayment(String walletNumber , Double amount) {
		
			System.out.println("Stage Event"+getStageEvent());
			System.out.println("Customer:"+getCustomer());
			System.out.println("Number of seats:"+getNoOfSeats());
			System.out.println("Amount"+amount);
			System.out.println("WalletNumber"+walletNumber);
			return walletNumber;
		
	}
	public void makePayment(String creditCard,String ccv,String name,Double amount) {
		System.out.println("Stage Event:"+getStageEvent());
		System.out.println("Customer:"+getCustomer());
		System.out.println("Number of seats:"+getNoOfSeats());
		System.out.println("Holder Name:"+name);
		System.out.println("Amount:"+amount);
		System.out.println("CCV:"+ccv);
		
	}
	
}
