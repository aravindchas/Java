package Com;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	public static void getSecondSmallest(int[] arr)
	{
//		Arrays.sort(arr);
//		System.out.println("Second smallest element is :"+arr[1]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i+1;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println(arr[1]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter Array elements:");
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		getSecondSmallest(arr);
		

	}

}
