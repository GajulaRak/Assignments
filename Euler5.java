package com.example;

public class Euler5 {

	public static void main(String[] args) {
		int j,flag=0;
		long  i=2520;
		while( i>0) {
			for(j=11;j<21;j++) {
				if(i%j==0)
					flag++;
			}
			if(flag==10) {
				System.out.println(+i);
				break;
			}
		flag=0 ;
		i+=20;		
		}
	
	}

}
