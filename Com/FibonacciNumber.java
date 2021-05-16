package Com;

import java.util.Scanner;

public class FibonacciNumber {
	public static int fibonacci(int num)
	{
		if(num==1 || num==2)
			return 1;
		else
			return fibonacci(num-1)+fibonacci(num-2);			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=fibonacci(num);
		System.out.println(res);
		
	}

}
