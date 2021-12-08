package com.example;

import java.util.Scanner;

public class SilverMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Stall Type");
		System.out.println("1.Silver Stall");
		System.out.println("2.Gold Stall");
		System.out.println("3.Platinum Stall");
		int num=sc.nextInt();
		switch(num){
		case 1:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
			String line=sc.next();
			String arr[]=line.split(",");
			SilverStall ss=new SilverStall(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]));
			ss.display();
			break;
		case 2:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
			String line1=sc.next();
			String arr1[]=line1.split(",");
			GoldStall gs=new GoldStall(arr1[0],arr1[1],arr1[2],Integer.parseInt(arr1[3]), Integer.parseInt(arr1[4]));
			int tvset=100*gs.getTvSet();
			int cost=tvset+gs.getCost();
			System.out.println("Stall Name:"+gs.getName()+"\nDetails:"+gs.getDetail()+"\nOwner Name:"+gs.getOwner()+"\nTV Sets:"+tvset+"\nTotal Cost:"+cost);
			break;
		case 3:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
			String line2=sc.next();
			String arr2[]=line2.split(",");
			PlatinumStall ps=new PlatinumStall(arr2[0],arr2[1],arr2[2],Integer.parseInt(arr2[3]),Integer.parseInt(arr2[4]));
			int tvset1=100*ps.getTvset();
			int projector=500*ps.getProjector();
			int cost1=ps.getCost()+tvset1+projector;
			System.out.println("Stall Name:"+ps.getName()+"\nDetails:"+ps.getDetail()+"\nOwner Name:"+ps.getOwner()+"\nTV Sets:"+ps.getCost()+"\nProjectors:"+ps.getProjector()+"\nTotal Cost:"+cost1);
			break;
		

}
}
}