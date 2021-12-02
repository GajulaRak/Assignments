package com.example;

import java.util.Scanner;

public class Vitalparameter {
	static double RRunrate;
	static double CurrentRunrate;
	static int Totalruns;
	static int Totalovers;
	static int Target;
	static int OversBowled;
	static int Runsscored;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Totalnumber overs");
		Totalovers=sc.nextInt();
		System.out.println("Enter Target");
		Target=sc.nextInt();
		
		System.out.println("Enter OversBowled");
		OversBowled=sc.nextInt();
		System.out.println("Enter Enter RunsScored");
		Runsscored=sc.nextInt();
		
	RRunrate=(double)(Target-Runsscored)/(Totalovers-OversBowled);
	
 System.out.println("Required Run Rate"+RRunrate);
 CurrentRunrate=Runsscored/OversBowled;
	System.out.println("Current Run Rate"+CurrentRunrate);
	}

}
