package com.example;


	import java.util.Scanner;

	public class EmployeeSalary {
		public static void main(String[] args) {
	int totalSalary;
	System.out.println("Enter the total salary paid to Justin");
	Scanner sc=new Scanner(System.in);
	totalSalary=sc.nextInt();
	for(int i=10; i<=totalSalary;i++)
	{
	int x=80*i+50*(i-10);
	if(totalSalary-x>=0 && totalSalary-x<130)
	{
		System.out.printf("Number of weekdays hours %d\nNumber of weekends hours %d",i,(i-10));
		}

	}
		}
	}


