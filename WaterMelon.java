package com.example;

import java.util.Scanner;

public class WaterMelon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter WaterMelon Weight");
		int Weight=s.nextInt();
		if(Weight%2!=0) {
			System.out.println("You Try in Even");
			
		}
			else {
				for(int i=1;i<Weight;i++) {
					for(int j=1;j<=Weight;j++) {
						int temp=i+j;
						if(temp==Weight) {
							count++;
							System.out.println(i+"  "+j);
							
						}
						
						
					}
				}
				System.out.println(+count+"Possible Ways");
				
			
		}
	}

}
