package com.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressMain1 {

	public static void main(String[] args) {
		Customer2 customer = null;
		Address address = null;

		 Scanner scanner = new Scanner(System.in);
			customer = new Customer2();
			address = new Address();

			System.out.println("Enter the name");
			customer.setName(scanner.next());

			System.out.println("Enter the street");
			address.setStreet(scanner.next());

			System.out.println("Enter the city");
			address.setCity(scanner.next());

			System.out.println("Enter the pincode");
			address.setPincode(scanner.nextInt());

			customer.setAddress(address);

			System.out.println(customer);

		} 

}

