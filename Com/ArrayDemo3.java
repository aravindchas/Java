package Com;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Elements:");
		int arr1[][] = new int[2][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("printing Array elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
