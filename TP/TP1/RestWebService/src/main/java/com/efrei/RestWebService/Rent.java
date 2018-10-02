package com.efrei.RestWebService;

public class Rent {
	private String begin;
	private String end;
	private Boolean b;
	
	public Rent()
	{
		super();
	}
	
	public Rent(String begin, String end, Boolean b)
	{
		this.begin=begin;
		this.end=end;
		this.b=b;
	}
	
	public void setbegin(String begin)
	{
		this.begin=begin;
	}
	
	public void setend(String end)
	{
		this.end=end;
	}
	
	public void setbool(Boolean b)
	{
		this.b=b;
	}
}
