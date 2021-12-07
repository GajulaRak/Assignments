package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EventMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("1.Exhibition Event");
		System.out.println("2.Stage Event");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the details,name, detail, type, ownerName, costPerDay,noOfStall");
			String line1=sc.next();
			String[] arr=line1.split(",");
			System.out.println("Enter the starting date of the event");
			Date startdate=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(sc.next());
			
			System.out.println("Enter the Ending date of the event");
			Date enddate=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(sc.next());
			long differmail=enddate.getTime()-startdate.getTime();
			long differ=TimeUnit.DAYS.convert(differmail,TimeUnit.MILLISECONDS);
			Exhibition e=new Exhibition(arr[0], arr[1], arr[2], arr[3],Double.parseDouble(arr[4]), Integer.parseInt(arr[5]));
			double costPerday=e.getCostPerDay();
			int noOfStall=e.getNoOfStall();
			double cost=costPerday*differ;
			double gst=cost*0.05;
			System.out.println("GST is"+gst);
			break;
		case 2:
			System.out.println("Enter the details of stage event:");
			String line=sc.next();
			String arr1[]=line.split(",");
			System.out.println("Enter the starting date of the event:");
			Date startdate1=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(sc.next());
			System.out.println("Enter the ending date of the event:");
			Date enddate1=(Date) new SimpleDateFormat("dd-mm-yyyy").parse(sc.next());
			long differmill1=enddate1.getTime()-startdate1.getTime();
			long differ1=TimeUnit.DAYS.convert(differmill1,TimeUnit.MILLISECONDS);
			StageEvent se=new StageEvent(arr1[0], arr1[1], arr1[2], arr1[3], Double.parseDouble(arr1[4]),Integer.parseInt(arr1[5]));
			double costPerDay2 = se.getCostPerDay();
			double cost1=costPerDay2*differ1;
			double gst1=cost1*0.15;
			System.out.println("The GST to be paid is Rs."+gst1);


			break;
		}
	}

}
