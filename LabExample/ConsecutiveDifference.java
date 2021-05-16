package LabExample;

public class ConsecutiveDifference {
	public static void modifyNumber(int num)
	{
		String number=String.valueOf(num);
		char[] digits=number.toCharArray();
		for(int i=0;i<(digits.length)-1;i++)
		{
			System.out.print(Math.abs((digits[i+1])-(digits[i])));
		}
		System.out.print(digits.length-1);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=72514;
		modifyNumber(num);
		
	}

}
