package com.example;

import java.util.Scanner;

public class Euler7 {
	

		
		private int count = 0;
		
		public Euler7(int n){
			int cur = 2;
			boolean f = true;
			while(n != count){
				for(int i = 2;i*i<=cur;i++){
					if(cur % i == 0){
						f = false;
						break;
					}
					f = true;
				}
				if(f){	
					System.out.println((count + 1) + ": " + cur);
					count++;
				}
				cur++;
			}
		}
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the amount of the prime numbers you want to display: ");
			int num = in.nextInt();
			new Euler7(num);
		}
}
