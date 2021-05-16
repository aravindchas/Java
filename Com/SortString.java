package Com;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void sortString(String arr[])
	{
		Arrays.sort(arr);
		if(arr.length%2==0) {
			for(int i=0;i<arr.length/2;i++)
			{
				System.out.print(arr[i].toUpperCase()+" ");
			}
			for(int i=arr.length/2;i<arr.length;i++)
			{
				System.out.print(arr[i].toLowerCase()+" ");
			}
			
		}
		else
		{
			for(int i=0;i<arr.length/2+1;i++)
			{
				System.out.print(arr[i].toUpperCase()+" ");
			}
			for(int i=arr.length/2+1;i<arr.length;i++)
			{
				System.out.print(arr[i].toLowerCase()+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter length of array elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("enter Array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		sortString(arr);
		

	}

}
