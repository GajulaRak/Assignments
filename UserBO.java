package com.example;

import java.util.Arrays;

public class UserBO {
	public void addUser(User[] userArrray,User userIns,Integer index){
		userArrray[index]=userIns;
	}
	public void sortUsers(User[] userArrray){
		Arrays.sort(userArrray, (a,b)->a.getName().compareTo(b.getName()));
	}
	public Boolean deleteUser(User[] userArray,String name){
		User[] temp=userArray;
		boolean flag=false;
		for(int i=0;i<userArray.length;i++){
			if(userArray[i].getName().equals(name)){
				flag=true;
				userArray[i]=null;
				System.out.println("Deleted Successful");
			}
		}
		return flag;
	}
	public void displayAll(User[] userArray){
		int count=1;
		for(int i=0;i<userArray.length;i++){
			if(userArray[i]!=null){
				System.out.println("User "+count);
				System.out.println(userArray[i]);
				count++;
			}
		}
	}
}
