package com.example;

public class StageEvent extends Event{
	int noOfSeats;

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
		super(name, detail, type, ownerName, costPerDay);
		this.noOfSeats = noOfSeats;
	}

	
	

}
