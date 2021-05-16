package Com;

import java.util.Scanner;

public class PrimeNumbers {
	public static void prime(int num)
	{
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					break;
				else
					System.out.print(i+" ");
			        break;			
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int nu=sc.nextInt();
		prime(nu);

	}

}
