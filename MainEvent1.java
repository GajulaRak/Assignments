package com.example;

import java.util.Scanner;

public class MainEvent1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the event:");
sc.next();
String event=sc.nextLine();
System.out.println("Enter the detail of the event:");
String details=sc.nextLine();
System.out.println("Enter the owner name of the event:");
String owner=sc.next();
System.out.printf("Enter the type of the event:\n1.Exhibition\n2.StageEvent\n");
int choice=sc.nextInt();
switch (choice) {
case 1:
	System.out.println("Enter the number of stalls:");
	int noOfStalls=sc.nextInt();
	Exhibition e1=new Exhibition(event, details, owner, noOfStalls);
	Double projectedRevenue = e1.projectedRevenue();
	System.out.println("The projected revenue of the event is "+projectedRevenue);
	break;
case 2:
	System.out.println("Enter the number of shows:");
	int shows=sc.nextInt();
	System.out.println("Enter the number of seats shows:");
	int seatsPerShows=sc.nextInt();
	StageEvent1 se=new StageEvent1(event, details, owner, shows, seatsPerShows);
	Double projectedRevenueStageShow = se.projectedRevenue();
	System.out.println("The projected revenue of the event is "+projectedRevenueStageShow);
	break;
default:
	break;
}
	}

}
