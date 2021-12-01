package com.example;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int temp = 0;
		int reverse = 0;
		int product = 0;
		// System.out.println("Enter a number to reverse");
		// int n=sc.nextInt();

		// while(product>0) {
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				product = i * j;
				temp = product;
				while (product > 0) {

					int remainder = product % 10;
					reverse = reverse * 10 + remainder;
					// temp=reverse;
					product = product / 10;

					System.out.println(reverse);
				}
				if (temp == reverse) {
					System.out.println("palindrome");
				} else {
					System.out.println("not a palindrome");
				}

			}
		}
	}*/
		 int value = 0;
	        for(int i = 100;i <=999;i++)
	        {
	            for(int j = i;j <=999;j++)
	            {
	                int value1 = i * j;
	                StringBuilder sb1 = new StringBuilder(""+value1);
	                String sb2 = ""+value1;
	                sb1.reverse();
	                if(sb2.equals(sb1.toString()) && value<value1) {
	                    value = value1;

	                }

	            }
	        }

	        System.out.println(value);
	    }
}
