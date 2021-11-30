package com.example;

import java.util.Scanner;

public class LargestPrimeFactor {
	public static void main(String[]args) {
		int flag=0;
		int temp=0;
Scanner sc=new Scanner(System.in);

System.out.print("Enter a number");
long number=sc.nextLong();
for(int i=1;i<=number;i++) {
	if(number%i==0)//factors of given number
		{
		//System.out.print(i+"\t");
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag++;
			}
			
			
		}
		if(flag==0)
		{
			temp=i;
		}
	}
}
System.out.println(temp);

	}
}
