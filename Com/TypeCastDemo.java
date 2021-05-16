package Com;

public class TypeCastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
//		Autoboxing
		Integer b=a;
		
//		Autounboxing
		int c=b;
		
		String str1=Integer.toString(a);
		System.out.println(str1+"|"+45);
		
		String str="7845621";
		int b1=Integer.parseInt(str);
		System.out.println(b1);
		
////		Number Format Exception
//		String str2="hello";
//		int b2=Integer.parseInt(str2);
//		System.out.println(b2);
		
		long l1=45786;
		int n=(int)l1;
		System.out.println(n);
		
		

	}

}
