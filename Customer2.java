package com.example;

public class Customer2 {
	
		private String name;
		private Address address;

		public Customer2() {
		}

		public Customer2(String name, Address address) {
			this.name = name;
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return name + " " + address.toString();
		}

	}


