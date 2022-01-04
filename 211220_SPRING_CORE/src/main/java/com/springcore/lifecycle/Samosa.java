package com.springcore.lifecycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price ");
		this.price = price;
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	/*
	public void init() {
		System.out.println("Inside Init Method ");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method ");
	}
	*/
	// or
	
	public void hey() {
		System.out.println("Inside Init Method : Hey How are you.  ");
	}
	
	public void bye() {
		System.out.println("Inside Destroy Method : Bye going to die. ");
	}
}
