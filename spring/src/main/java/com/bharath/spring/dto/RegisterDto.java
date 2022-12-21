package com.bharath.spring.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
public class RegisterDto implements Serializable {
	private String name;
	private String email;
	private String contactNumber;
	private String city;
	private String country;
	private String pincode;
	@Override
	public String toString() {
		return "RegisterDto [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + ", city=" + city
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
