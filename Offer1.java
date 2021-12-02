package com.example;

import java.util.Scanner;

public class Offer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter product1 price:");
		int p1=s.nextInt();
		System.out.println("Enter product2 price:");
		int p2=s.nextInt();
		System.out.println("Enter product3 price:");
		int p3=s.nextInt();
		double total=p1+p2+p3;
		double discount=(total*20)/100;
		double offer1=total-discount;
		int temp=p1<p2?p1:p2;
		int smallest=p3<temp?p3:temp;
		double offer2=total-smallest;
		System.out.println(offer1);
		System.out.println(offer2);
		if(offer1<offer2){
			System.out.println("Go for offer1");
		}
		else{
			System.out.println("Go for offer2");
		}
		
		

	}


}
