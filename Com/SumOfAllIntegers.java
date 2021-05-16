package Com;

import java.util.Scanner;

public class SumOfAllIntegers {
	public static void sumOfIntegers(int arr[])
	{
		int sum=0;
		int j=1;
		for(int i=0;i<arr.length;i++)
		{	
			sum+=arr[i];
			System.out.println(j+" "+arr[i]+" "+sum);
			j++;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sumOfIntegers(arr);
		
	}
}
