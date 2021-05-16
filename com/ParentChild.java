package com;

public class ParentChild {
	String name;
	int age;
	ParentChild(){
		System.out.println("thsi parent class constructor");
	}
	public  ParentChild(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void walk() {
		System.out.println("parent  walk method");
	}
	public void test() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentChild p=new ParentChild();
		p.walk();
	}

}
