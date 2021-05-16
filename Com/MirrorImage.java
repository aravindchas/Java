package Com;

import java.util.Scanner;

public class MirrorImage {
	public static String getImage(String name)
	{
		StringBuffer kn=new StringBuffer(name);
		kn.append('|');
		StringBuffer stb=new StringBuffer(name);
		StringBuffer str2=stb.reverse();
		kn.append(str2);
		String str3=kn.toString();
		
		return str3 ;

//		return name+"|"+str3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String res=getImage(name);
		System.out.println(res);
		
		

	}

}
