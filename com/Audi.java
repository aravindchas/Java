package com;

public class Audi extends Car{
	String model="SUV";
	String carname="audi";
	String color="black";
	
	public void autoPilot()
	{
		System.out.println("car is auto filite");
		System.out.println(super.model);
		System.out.println(super.carname);
		System.out.println(super.color);
//		we can call super class method directly
		register();
//		we can using super keyword method directly
		super.register();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi au=new Audi();
		System.out.println(au.model);
		System.out.println(au.carname);
		System.out.println(au.color);
		au.register();
		au.applyBrakes();
		au.autoPilot();

	}

}
