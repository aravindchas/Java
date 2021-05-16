package LabExample;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CurrentSystemDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter date in format of yyyy mm dd:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		int date=sc.nextInt();
//		date enter by user
		LocalDate pdate=LocalDate.of(year,month,date);
//		this is system current date
		LocalDate lod=LocalDate.now();
//		to find difference between current and entered date
		Period diff=Period.between(pdate,lod);
		
		System.out.println(diff.getDays());
		System.out.println(diff.getMonths());
		System.out.println(diff.getYears());
		

	}

}
