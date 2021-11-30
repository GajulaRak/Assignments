package com.example;

public class Fibanoccic {

	public static void main(String[] args) {
		int a, b,sum=0;
        int c=0;
		a = 1;
		b = 2;
		//c = a + b;
		while(a<40) {
			if(a%5==0) 
				sum+=a;
				 c=a+b;
				a=b;b=c;
			
				System.out.println(c);
				
			}
		

	}

}
