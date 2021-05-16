package Com;

public class CaluculateDifference {
	public static int caluculateDiff(int n)
	{
		int sum=0;
		int sum1=0;
		int res=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i;
			sum1=sum1+i;
			res=sum1*sum1;
		}
		return sum-res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int res1=caluculateDiff(n);
		System.out.println(res1);

	}

}
