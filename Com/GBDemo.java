package Com;

public class GBDemo {
	public void finalize()
	{
		System.out.println("Object is ready to Garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GBDemo  demo =new GBDemo();
		GBDemo  demo1 =new GBDemo();
		demo=null;
		demo1=null;
		System.gc();


	}

}
