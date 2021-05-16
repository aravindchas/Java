package Com;

import java.util.Scanner;

public class Varargs {
	public  int add(float b,int ...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a.length>6)
			{
				System.out.println("length should be lessthan or equal to 6");
			}
			sum+=a[i];
		}
		System.out.println(sum);
		System.out.println(b);
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs varargs=new Varargs();
		System.out.println("Enetr 6 values:");
		Scanner sc=new Scanner(System.in);
		int n[]=new int[6];
		for(int i=0;i<6;i++)
		{
			n[i]=sc.nextInt();		
		}
		
//     Enhanced  for loop or for-each loop
		for(int n1:n)
		{
			System.out.println(n1+" ");
		}
		varargs.add(10,50,70);
		varargs.add(12f,45,56,78);
	}

}
