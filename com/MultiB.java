package com;

public class MultiB extends MultiA {
	int b=60;
	MultiB()
	{
		System.out.println("this is multiB constructor");
	}
//	we can make porected to the sub class
//	we cannot make method private
	protected  void testB()
	{
		System.out.println("this is testB");
	}
	
	

}
