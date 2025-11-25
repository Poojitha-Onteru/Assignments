package com.nov25.zonedtime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnZoneDateTime {

	public static void main(String[] args) {
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getOffset());
		System.out.println(dateTime.getZone());
		ZonedDateTime regionDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(regionDateTime);
		System.out.println(regionDateTime.getZone());
		//Duration durationDiff=Duration.between(regionDateTime.toInstant(),dateTime.toInstant());
		//System.out.println(durationDiff.toHours());

		int diffSeconds=dateTime.getOffset().getTotalSeconds()-regionDateTime.getOffset().getTotalSeconds();
		int hours=diffSeconds/3600;
		int min=(diffSeconds%3600)/60;
		System.out.println("Difference is:"+hours+" hours "+min+" mins");
		
		//converting local date to zoned date
		LocalDateTime dateTime2=LocalDateTime.now();
		ZonedDateTime zdt=dateTime2.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(zdt);
		
		//converting Indian timing to other region time
		ZonedDateTime india=ZonedDateTime.now();
		ZonedDateTime usa=india.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India time:"+india);
		System.out.println("USA:"+usa);
		
		//print zonedatetime in the specific pattern
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a z");
		String formatedZoneDateTime=india.format(df);
		System.out.println("Formated zone time:"+formatedZoneDateTime);
		System.out.println(regionDateTime.format(df));
		
		
		
	}

}
