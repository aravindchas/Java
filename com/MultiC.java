package com;

public class MultiC extends MultiB{
	int c=20;
	MultiC()
	{
		System.out.println("this is multiC constructor");
	}
	public void testC()
	{
		System.out.println("this is testC");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiC mulc=new MultiC();
		mulc.testA();
		mulc.testB();
		mulc.testC();
		System.out.println(mulc.a+mulc.b+mulc.c);
		
		if(mulc instanceof MultiC)
		{
			System.out.println("instance of class multiC");
		}
		
		

	}

}
