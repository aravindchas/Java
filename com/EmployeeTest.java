package com;

public class EmployeeTest {

	public static void main(String[] args) {
		Address address=new Address("Vizag","Andhra Pradesh","INDIA");
		
//		Employee emp=new Employee(1001,"chas",21800,address);
   	Employee emp=new Employee();
		emp.setAddress(address);
		emp.setEid(1001);
	    emp.setEname("aravind");
	    emp.setSalary(21000);

		System.out.println(emp);
		
		System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getSalary());
	}

}
