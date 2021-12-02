package com.example;

import java.util.Scanner;

public class Offers {

	public static void main(String[] args) {
		int p1;
		int p2;
		int p3,a = 0,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter p1");
		p1=sc.nextInt();
		System.out.println("Enter p2");
		p2=sc.nextInt();
		
		System.out.println("Enter p3");
		p3=sc.nextInt();
	  
		int psum=p1+p2+p3;
		 double offerprice1=((psum*0.2));
		 //System.out.println(offerprice1);
		 if(p1<p2 && p1<p3) {
			  a=p1;
		 }
		 if(p2<p3) {
			 b=p2;
		 }
		 else {
		 c=p3;
		 }
		 if(offerprice1<a  ) {
			 System.out.println("Choose Offerprice 1");
		 }
		 else {
			 System.out.println("choose offer 2");
		 }
		}
	

}
