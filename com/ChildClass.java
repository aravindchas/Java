package com;
public class ChildClass extends ParentChild{
	
	ChildClass()
	{
//		use super as first in constructor
		super();
		System.out.println("this is childclass constructor");
//		dont use super after any statement it gives an error
//		super();
	}
	ChildClass(String name,int age)
	{
		super(name,age);
	}
	public void display()
	{
		System.out.println(name+" "+age);
	}
	@Override
	public void walk()
	{
		System.out.println("child  walk method");
		super.walk();
	}
	public static void test()
	{
		System.out.println("this is parent test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();
		c.walk();
		ChildClass c1=new ChildClass("chas",25);
		c1.display();
		c.test();

		

	}

}
