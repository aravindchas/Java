package Com;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDemo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt=LocalDateTime.of(2017,Month.APRIL,20,15,26);
		ZoneId india=ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1=ZonedDateTime.of(ldt,india);
		System.out.println(zone1);
		
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2=zone1.withZoneSameInstant(tokyo);
		System.out.println("In Tokyo central Time Zone"+zone2);
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		if(ldt instanceof LocalDateTime)
		{
			System.out.println("this is the object of class");
		}

	}

}
