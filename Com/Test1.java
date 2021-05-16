package Com;

public class Test1 {
	public void display() {
		System.out.println("Inside the display of Test1 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.show();
		
		Test1 test1=new Test1();
		test1.display();
		
//		Test1 test12; reference variable
//		test12=test1;  assigning reference  to another reference
//		test12.display(); 
		
		System.out.println(Test.a);
		Test.show1("hello world");
	}

}
