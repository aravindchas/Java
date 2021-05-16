package Com;

public class CaluculateSum {
	public static int caluculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
				sum=sum+i;
			else if(i%5==0)
				sum=sum+i;
		}
		return sum;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int res=caluculateSum(n);
		System.out.println(res);

	}

}
