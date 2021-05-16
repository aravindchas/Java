package Com;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			{
				System.out.println("even numbers:"+i+" ");
				
			}
			
			else {
				System.out.println("odd numbers:"+i+" ");
			}
		
		}
		
		

	}

}
