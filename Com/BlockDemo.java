package Com;

public class BlockDemo {
	static int s=300;
	static 
	{
		int s=100;
		System.out.println("Inside static block 1:"+s);
	}
	static 
	{
		System.out.println("Inside  static block 2 :"+s);
	}

	{
		int s=400;
		System.out.println("Inside Instance block1:"+s);
	}
	{
		System.out.println("Inside Instance block2:"+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main block");
		BlockDemo obj=new BlockDemo();
	
	}

}
