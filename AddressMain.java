package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Customer[] customers = null, duplicateCustomers = null;
		Customer customer = null;
		Address address = null;
		int customersCount = 0, i = 0, duplicateCustomersCount = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			customers = new Customer[100];
			duplicateCustomers = new Customer[100];

			System.out.println("Enter the number of customers");
			customersCount = scanner.nextInt();

			do {
				Customer1 ob1 = new Customer1();
				address = new Address();

				System.out.printf("Enter the Customer Details %d \n", i + 1);
				System.out.println("Enter the name");
				ob1.setName(scanner.next());

				System.out.println("Enter the street");
				address.setStreet(scanner.next());

				System.out.println("Enter the city");
				address.setCity(scanner.next());

				System.out.println("Enter the pincode");
				address.setPincode(scanner.nextInt());

				ob1.setAddress(address);
				customers[i] = customer;
			} while (++i < customersCount);

			for (i = 0; i < customersCount; i++) {
				for (int j = i + 1; j < customersCount; j++) {
					if (customers[i].equals(customers[j])) {
						duplicateCustomers[duplicateCustomersCount++] = customers[i];
					}
				}
			}

			if (duplicateCustomers[0] == null) {
				System.out.println("No duplicate details");
			} else {
				System.out.println("The identical Customers Details:");

				for (i = 0; i < duplicateCustomersCount; i++) {
					System.out.println((i + 1) + ")" + duplicateCustomers[i]);
				}
			}

		} catch (InputMismatchException inputMismatchException) {
			System.err.println("Error: Invalid input");
		} catch (Exception exception) {
			System.err.println("Error: An error occurred");
		}

	}

}

