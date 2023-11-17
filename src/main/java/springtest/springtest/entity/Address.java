package springtest.springtest.entity;

import jakarta.persistence.Entity;

@Entity
public class Address {
	private int id;
	private String city;
	private String state;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String city, String state, int pincode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
