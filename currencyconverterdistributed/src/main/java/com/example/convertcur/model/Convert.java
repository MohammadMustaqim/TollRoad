package com.example.convertcur.model;


public class Convert {
	private String country;
	private Double currency;
	
	public Convert (String country, Double currency) {
		this.country = country;
		this.currency = currency;	
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Double getCurrency() {
		return currency;
	}
	public void setCurrency(Double currency) {
		this.currency = currency;
	}
	
}