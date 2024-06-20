package com.AutoWiring.Xml;

public class Address {

	private String dist;
	private String city;

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String dist, String city) {
		this.dist = dist;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [dist=" + dist + ", city=" + city + "]";
	}
}
