package com.example;

import java.util.Scanner;

public class ArjunaGame {

		static int count;
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int target=100,sum=0;
			for(int i=0;i<target;i++)
			{
				System.out.println("enter the points:");
				int turn = sc.nextInt();
				sum=sum+turn;
				count++;
				if(sum>=100){
					System.out.println("the no of turns:"+count);
					break;
				}
			}	
		}
}


