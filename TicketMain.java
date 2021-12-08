package com.example;

import java.util.Scanner;

public class TicketMain {
public static void main (String[] args) {
	System.out.println("1:Cash Payment");
	System.out.println("2:Wallent Payment");
	System.out.println("3:Credit Card Payment");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	switch(n){
	case 1:
		System.out.println("Enter Details Show ,Cuustomer name, seats,Amount");
		String line1=sc.next();
		String[] arr=line1.split(",");
		TicketBoking tb=new TicketBoking(arr[0], arr[1], Integer.parseInt(arr[2]));
		tb.makepayment(sc.nextDouble());
	case 2:
		System.out.println("Enter Details Show ,Cuustomer name, seats,Amount");
		String line2=sc.next();
		String[] arr2=line2.split(",");
		TicketBoking tb2=new TicketBoking(arr2[0], arr2[1], Integer.parseInt(arr2[2]));
		System.out.println("Enter Amount");
		Double amount=sc.nextDouble();
		System.out.println("Enter WalletNumber");
		String walletNumber=sc.next();
		
		tb2.makePayment(walletNumber,amount);
		
case 3:
	System.out.println("Enter Details Show ,Cuustomer name, seats,Amount");
	String line3=sc.next();
	String[] arr3=line3.split(",");
	TicketBoking tb3=new TicketBoking(arr3[0], arr3[1], Integer.parseInt(arr3[2]));
	System.out.println("Enter credit card number");
	String creditCard=sc.next();
	System.out.println("Enter ccv");
	String ccv=sc.next();
	System.out.println("HolderName");
	String name=sc.next();
	System.out.println("Amount");
	Double amount1=sc.nextDouble();
	
	tb3.makePayment(creditCard,ccv,name,amount1);
	}
}
}
