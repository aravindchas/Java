package Com;

import java.util.Scanner;

public class BitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		System.out.println("enter values for a and b:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a<<2);
		System.out.println(b>>2);

	}

}
