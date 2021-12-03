package com.example;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Cname,CEmail,CType ,CAddress");
  Customer ob1=new Customer(sc.next(),sc.next(),sc.next(),sc.next());
  ob1.displayDetails();
	}

}
