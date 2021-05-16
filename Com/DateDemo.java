package Com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		LocalDate ydate=date.minusDays(2);
		LocalDate tdate=date.plusDays(2);
		LocalDate ymonth=date.minusMonths(1);
		
		System.out.println(date);
		System.out.println(ydate);
		System.out.println(tdate);
		System.out.println(ymonth);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);


	}

}
