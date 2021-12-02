package com.example;

import java.util.Scanner;

public class Childrens {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of choclates:");
		int Choclates=s.nextInt();
		System.out.println("Enter Number of Childrens:");
		int childrens=s.nextInt();
		for(int i=1;i<=childrens;i++) {
			if(Choclates>=i) {
				Choclates=Choclates-i;
				count++;
				
			}
			
		}
		System.out.println("Remaing Choclates"+Choclates);
		System.out.println("Choclates got"+count);
		
		
	}

}
