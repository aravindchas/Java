package Com;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("java");
		StringBuilder str2=str.reverse();
		System.out.println(str2.toString());

		
		StringBuffer str3=new StringBuffer("python");
		StringBuffer str4=str3.reverse();
		System.out.println(str4.toString());
		
		String st="chas";
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}

	}

}
