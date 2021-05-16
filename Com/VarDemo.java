package Com;

import java.util.Scanner;

public class VarDemo {
	
	static int x,y;
	String name="c";
	
	public static int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println(x);
		return c;
	}
	public void test()
	{
		String name="java";
		System.out.println(x);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		System.out.println("enter values of x & y:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		add(x,y);
		VarDemo va=new VarDemo();
		va.test();
		
		

	}

}
