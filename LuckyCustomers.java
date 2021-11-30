package com.example;
import java.util.Scanner;
public class LuckyCustomers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		int dt=sc.nextInt();
		System.out.println("Enter bill number");
		int bl=sc.nextInt();
		int temp=bl%100;
		//System.out.println(dt%bl);
		if(dt==temp && dt%bl==0) {
			System.out.println("Lucky Customer");
		}
		else {
			System.out.println("Not lucky Customer");
		}
	}
	}

