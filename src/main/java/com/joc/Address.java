package com.joc;

public class Address {
	int hno;
	String city, state;
	
	public Address(int hno, String city, String state) {
		this.hno = hno;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	
	public void display() {
		System.out.println("My house no : "+hno+" My city : "+city+" My state : "+state);
	}

}
