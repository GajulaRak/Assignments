package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ItemTypeBo itemTypeBO=new ItemTypeBo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of item type");
		int n=sc.nextInt();
		ItemType[] itemType=new ItemType[n];
		if(n>=1&&n<=10) {
			for(int i=0;i<n;i++) {
				System.out.printf("enter the item type name");
				System.out.println((i+1));
				String name=sc.next();
				System.out.println("enter the deposit number");
				Double deposit=sc.nextDouble();
				System.out.println("enter the cost per day");
				Double costPerDay=sc.nextDouble();
				itemType[i]=new ItemType(name,deposit,costPerDay);
				itemTypeBO.add(itemType[i],itemType,i);
			}
			itemTypeBO.display(itemType);
		}
		System.out.println("enter the name of the item to be searched");
		String search=sc.next();
		itemTypeBO.search(search, itemType);
		

	}

}

