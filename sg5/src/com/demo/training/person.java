package com.demo.training;

import java.io.Serializable;

public class person implements Serializable{

	
		
		String name;
		String address;
		int number;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		@Override
		public String toString() {
			return "person [name=" + name + ", address=" + address + ", number=" + number + "]";
		}

	}


