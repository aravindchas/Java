package Com;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"chas","java");
		System.out.println(s1);
		
		System.out.println(s1.sid+" "+s1.name+" "+s1.course);
		
		Student s2=new Student(102,"sanju","python");
		System.out.println(s2.sid+" "+s2.name+" "+s2.course);
	}
	
	

}
