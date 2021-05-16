package Com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		method 1 for declaring Array
		int arr1[]= {1,5,8,6,7,3};
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println(arr1.length);
		
//	Method 2 for Declaring Array
		String name[]=new String[5];
		System.out.println("Enter Array elememnts:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}
		Arrays.sort(name);
		System.out.println();
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}
	}
}
