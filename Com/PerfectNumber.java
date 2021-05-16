package Com;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System .out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				temp+=i;
			}
		}
		if(n==temp)
		{
			System.out.print(n+" is perfect number");
		}
		else
		{
			System.out.print(n+" is not perfect number");
		}

	}

}
