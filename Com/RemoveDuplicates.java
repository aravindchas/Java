package Com;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void modifyArray(int arr[])
	{
		int j=0;
		Arrays.sort(arr);
		int size=arr.length;

		for(int i=0;i<size-1;i++)
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		arr[j++]=arr[size-1];
		for(int i=0;i<j;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		for(int i=j-1;i>=0;i--)
			System.out.print(arr[i]+" ");
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]=new  int[6];
		int arr[]= {7,6,1,5,6,3,5,2};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter array elements:");
//		for(int i=0;i<6;i++)
//		{
//			arr[i]=sc.nextInt();		
//		}	
		modifyArray(arr);
	}

}
