package com.ofss.main;

import com.ofss.main.pojo.Address;

public class AddressMain {

	public static void main(String[] args) {
		//Using Param Constructor
		// Create Address object and call its overloaded constructor
		Address address = new Address(101, "B12/Nisarga CHS", "M.G. Road", "Mumbai", "400012");
		System.out.println(address);

		//Using Setter
		// Create Address object and call set method to set values
		Address address2 = new Address();
		address2.setAddressId(102);
		address2.setHouseNumber("1024/Rosa Gardenia");
		address2.setStreet("Ghodbander Road");
		address2.setCity("Thane");
		address2.setPin("400015");
		System.out.println(address2);

		// Use get method to get the values

	}

}
