package com.efrei.RestWebService;

public class Car {
	
	private String plateNumber;
	private int price;
	//private Rent rent;
	private boolean rent;
	
	public Car() {
		super();
	}
	
	public Car(String plateNumber, int price) {
		super();
		this.plateNumber = plateNumber;
		this.price = price;
		//this.rent=new Rent();
		this.rent=false;
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
	
	public void setRent(boolean b)
	{
		this.rent=b;
	}
	
	public boolean getRent()
	{
		return rent;
	}

}