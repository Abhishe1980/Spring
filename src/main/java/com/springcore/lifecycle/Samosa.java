package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println("setting Price");
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		
		System.out.println("inside init method");
	}
	
	public void destroy() {
		
		System.out.println("inside Destory method ");
	}
	
	

}
