package com.training.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	

	private Address address;

	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor Injection");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	 
	

}
