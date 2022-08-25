package com.ofss.main.pojo;

public class Address {
	private int addressId;
	private String houseNumber;
	private String street;
	private String city;
	private String pin;

	public Address() {
		System.out.println("Address object is created!!");
	}

	public Address(int addressId, String houseNumber, String street, String city, String pin) {
		System.out.println("Overloaded Constructor Of Address");
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public int getAddressId() {
		System.out.println("getAddressId() Called");
		return addressId;
	}

	public void setAddressId(int addressId) {
		System.out.println("setAddressId() Called");
		this.addressId = addressId;
	}

	public String getHouseNumber() {
		System.out.println("getHouseNumber() Called");
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		System.out.println("setHouseNumber() Called");
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		System.out.println("getStreet() Called");
		return street;
	}

	public void setStreet(String street) {
		System.out.println("setStreet() Called");
		this.street = street;
	}

	public String getCity() {
		System.out.println("getCity() Called");
		return city;
	}

	public void setCity(String city) {
		System.out.println("setCity() Called");
		this.city = city;
	}

	public String getPin() {
		System.out.println("getPin()  Called");
		return pin;
	}

	public void setPin(String pin) {
		System.out.println("setPin() Called");
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", street=" + street + ", city="
				+ city + ", pin=" + pin + "]";
	}

}
