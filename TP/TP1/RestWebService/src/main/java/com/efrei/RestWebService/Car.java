package com.efrei.RestWebService;

public class Car {
	
	private String plateNumber;
	private int price;
	private Rent rent;
	
	
	public Car() {
		super();
	}
	
	public Car(String plateNumber, int price) {
		super();
		this.plateNumber = plateNumber;
		this.price = price;
		this.rent=new Rent();
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Rent getRent()
	{
		return rent;
	}

}