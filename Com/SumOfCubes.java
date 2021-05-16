package Com;

import java.util.Scanner;

public class SumOfCubes {
	public SumOfCubes() {
		System.out.println("this is constructor");
	}
	public  void cubes(int n)
	{
		int sum=0;
		while(n>0)
		{
			int temp=n%10;
			sum=sum+temp*temp*temp;
			n=n/10;
		}
		System.out.println(sum);
//		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nuber:");
		int n=sc.nextInt();
//		System.out.println(cubes(n));
//		int res=cubes(n);
//		System.out.println(res);
		SumOfCubes sob=new SumOfCubes();
//		sob.cubes(n);
//		cubes(n);
	}
}
