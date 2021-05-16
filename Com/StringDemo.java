package Com;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java";
		String str2="Java";
		System.out.println(str1);
		System.out.println(str2);
		
		String str3=new String("java");
		String str4=new String("java");
		
		System.out.println(str3);
		System.out.println(str4);
		
		if(str1==str2)
		{
			System.out.println("equal by reference");
		}
		else
		{
			System.out.println("not Equal by reference");
		}
		if(str1.equals(str2))
		{
			System.out.println("equal by value");
		}
		else
		{
			System.out.println("not Equal by value");
		}
		if(str3==str4)
		{
			System.out.println("equal by reference");
		}
		else
		{
			System.out.println("not Equal by reference");
		}
		if(str3.equals(str4))
		{
			System.out.println("equal by value");
		}
		else
		{
			System.out.println("not Equal by value");
		}


	}

}
