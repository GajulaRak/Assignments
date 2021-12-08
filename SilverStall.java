package com.example;

public class SilverStall {
	String name;
	String detail;
	String owner;	
	int cost;
	public SilverStall(String name, String detail, String owner, int cost) {
		super();
		this.name = name;
		this.detail = detail;
		this.owner = owner;
		this.cost = cost;
	}
	public SilverStall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void display() {
		System.out.println("Stall Name:"+name+"\nDetails:"+detail+"\nOwner Name:"+owner+"\nTotal Cost:"+cost);
	
		
	}
	

}
