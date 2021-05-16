package Com;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void getSorted(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		for(int n1:arr) {
			System.out.print(n1+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		getSorted(arr);

	}

}
