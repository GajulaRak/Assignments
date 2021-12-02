package com.example;

import java.util.Scanner;

public class TotalExpenses {

	public static void main(String[] args) {
		double BrandExp;
		double TravelExp;
        double FoodExp;
        double LogisticExp;
        double TotalExp;
        Scanner sc=new Scanner (System.in);
		System.out.println("Enter BrandExpenses");
		BrandExp=sc.nextInt();
		System.out.println("Enter TravelExp");
		TravelExp=sc.nextInt();
		System.out.println("Enter FoodExp");
		FoodExp=sc.nextInt();
		
		System.out.println("Enter LogisticExp");
		LogisticExp=sc.nextInt();
		TotalExp=BrandExp+TravelExp+FoodExp+LogisticExp;
		System.out.println("TotalExpanses:"+TotalExp);
	    System.out.println("BrandExp Percentage:"+((BrandExp/TotalExp)*100));
	    System.out.println("Travel Percentage:"+((TravelExp/TotalExp)*100));
	    System.out.println("FoodExp Percentage:"+((FoodExp/TotalExp)*100));
	    System.out.println("LogisticExp Percentage:"+((LogisticExp/TotalExp)*100));
	}

}
