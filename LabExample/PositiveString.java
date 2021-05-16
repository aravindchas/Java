package LabExample;

public class PositiveString {
	public static void positiveString(String str)
	{
		char[] ch=str.toCharArray();
		int arr[]=new int[ch.length];	
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i];
			arr[i]=a;		
		}
		int count=0;
		int count1=0;
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]<arr[j+1])
			{
				count++;
			}
			else
			{
				count1++;
				break;
			}
		}
		if((count1==0 && count>=1)||(count1!=1 && count!=0))
		{
			System.out.println("true");
		}	
		else
		{
			System.out.println("false");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="fant";
		positiveString(str);
		
		
	}
}
