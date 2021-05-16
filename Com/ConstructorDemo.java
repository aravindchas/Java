package Com;

public class ConstructorDemo {
	public ConstructorDemo()
	{
		System.out.println("Default constructor invoked");
	}
	public ConstructorDemo(String msg)
	{
		System.out.println("Parametarized constructor invoked " +msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo demo=new ConstructorDemo();
		ConstructorDemo demo1=new ConstructorDemo("hello world");

	}

}
