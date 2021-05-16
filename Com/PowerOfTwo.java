package Com;

public class PowerOfTwo {
	public static boolean powerOfTwo(int n)
	{
		if(n==0 || n==1)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		boolean res=powerOfTwo(n);
		System.out.println(res);

	}

}
