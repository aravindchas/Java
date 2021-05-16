package Com;

public class TypeCastDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		converting character into ascci number
		char element='c';
		int n1=element;
		System.out.println(n1);
		
//		converting int to character 
		int n2=78;
		char ele1=(char) n2;
		System.out.println(ele1);
		
//		converting int to float
		float f1=n2;
		System.out.println(f1);
		
//		converting float to int
		float f2=10.0f;
		int n3=(int)f2;
		System.out.println(n3);
		
//		convert int to double
		int n4=456;
		double d1=n4;
		System.out.println(d1);
		
//		convert double to int
		double d2=456.0d;
		int n5=(int)d2;
		System.out.println(n5);
		

	}

}
