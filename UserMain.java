package com.example;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserBO userbo=new UserBO();
		System.out.print("Enter the number of users:");
		int n=sc.nextInt();
		User[] user=new User[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the details of User "+(i+1));
			System.out.print("Enter the name of the user:");
			String name=sc.next();
			System.out.print("Enter the mobile number of the user:");
			String number=sc.next();
			System.out.print("Enter the username of the user:");
			String uname=sc.next();
			System.out.print("Enter the password of the user:");
			String pwd=sc.next();
			user[i]=new User(name,number,uname,pwd);
			userbo.addUser(user,user[i],i);
		}
		System.out.println("User details as entered:");
		userbo.displayAll(user);
		System.out.println("After sorting:");
		userbo.sortUsers(user);
		userbo.displayAll(user);
		System.out.print("Enter the user to be deleted:");
		String username=sc.next();
		Boolean deleteUser=userbo.deleteUser(user,username);
		if(deleteUser){
			userbo.displayAll(user);
		}else{
			System.out.println("User Name not Found..");
		}
		
	}

}
