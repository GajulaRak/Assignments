package com.example;

import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	CurrentAccount c=new CurrentAccount();
	SavingAccount s=new SavingAccount();
	System.out.println("Choose Account Type");
	System.out.println("1 Saving Account");
	System.out.println("2 Currrent Account");
	int n=sc.nextInt();
	switch(n) {
	case 1:
		System.out.println("Enter account details,name,accno, bankname,orgname");
		System.out.println();
		String line1=sc.next();
		String[] arr=line1.split(",");
		
		s=new SavingAccount(arr[0],arr[1], arr[2],arr[3]);
		s.display();
		break;
	case 2:
		System.out.println("Enter Currentaccount details,tinNumber,accno1, bankname1,orgname1,no of seats");
		String tinNumber=sc.next();
		String accno1=sc.next();
		String bankname1=sc.next();
		String orgname1=sc.next();
	c=new CurrentAccount(tinNumber,accno1, bankname1,orgname1);
	c.display();
	break;
	}
}
}
