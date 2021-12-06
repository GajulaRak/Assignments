package com.example;

import java.util.Scanner;

public class MainOops2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		AddressOops2 obj1=new AddressOops2(null, null, null, null, 0);
		System.out.println("Enter the Address Line1");
	
		obj1.setAddressLine1(sc.next());
		System.out.println("Enter the Address Line2");
		obj1.setAddressLine2(sc.next());
		System.out.println("Enter the Address city");
		obj1.setCity(sc.next());
		System.out.println("Enter the Address State");
		obj1.setState(sc.next());
		System.out.println("Enter the Address Pincode");
		obj1.setPincode(sc.nextInt());
	
		obj1.display();
	}
}
