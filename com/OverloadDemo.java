package com;

public class OverloadDemo {
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public float add(float a,float b) {
		float c=a+b;
		System.out.println(c);
		return c;
	}
	public String add(String a,String b,String c) {
		String d=a+b+c;
		System.out.println(d);
		return d;
	}

	public static void main(String[] args) {
		OverloadDemo ol=new OverloadDemo();
		ol.add(10,20);
		ol.add(10.5f,45.23f);
		ol.add("chas"," is a"," goodboy");

	}

}
