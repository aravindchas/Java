package Com;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int data=a;
		int count=0;
		int res=0;
		while(a>0)
		{
			count+=1;
			a=a/10;
		}
		while(data>0)
		{
			int temp=a%10;
			for(int i=1;i<=count;i++) {
				res=res+temp*temp;
			}
			data=data/10;	
			
		}
		System.out.println(res);

	}

}
