package com.example;

public class Divisible35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
       for( int i=0;i<1000;i++) {
    	 // int sum=0;
    	   if(i%3==0 || i%5==0) {
    		  sum+=i;
    	   }
    	   
    		   
       }
       System.out.println(sum);
	}

}
