package com.example;

import java.util.Scanner;

public class ItemType {
	 /* public static String name;
	public static double costPerDay;
	public double deposit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public double setCostPerDay(double costPerDay) {
		return this.costPerDay = costPerDay;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public void display() {
		
		
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		ItemType ob1=new ItemType();
		System.out.println("Enter Name");
		name=sc.next();
		ob1.setName(name);
		System.out.println("Enter Cost per day");
		costPerDay =ob1.setCostPerDay(sc.nextDouble());
		System.out.println("Enter Deposit");
		ob1.setDeposit(sc.nextDouble());
		System.out.println("Name:"+ob1.getName());
		System.out.println("Cost Per Day:"+ob1.getCostPerDay());
		System.out.println("Deposit:"+ob1.getDeposit());
	     
	}

}
*/
	private String name;
	private double costPerDay;
	private double deposit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public void display(){
		System.out.println("Item type details");
		System.out.println("Name:"+getName());
		System.out.println("CostPerDay:"+getCostPerDay());
		System.out.println("Deposit:"+getDeposit());
	}



public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ItemType obj=new ItemType();
		System.out.println("Enter the item type name:");
		obj.setName(s.next());
		System.out.println("Enter the cost per day:");
		obj.setCostPerDay(s.nextDouble());
		System.out.println("Enter the deposit:");
		obj.setDeposit(s.nextDouble());
		obj.display();
		

	}
}
