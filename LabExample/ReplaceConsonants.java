package LabExample;

public class ReplaceConsonants {
	public static String afterString(String str1)
	{
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='a'||ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u')
			{
				ch[i]=(char)(ch[i]+1);
			}			
		}
		
		String st=new String(ch);
		return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="chas";
		String res=afterString(str1);
		System.out.print(res);
		

	}

}
