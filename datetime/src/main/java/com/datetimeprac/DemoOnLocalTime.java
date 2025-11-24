package com.datetimeprac;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalTime {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		//creating our own time
		LocalTime t1=LocalTime.of(22, 30);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(22, 30, 10);
		System.out.println(t2);
		
		LocalTime t3=LocalTime.of(10, 25, 30, 12344);
		System.out.println(t3);
		
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t3.getSecond());
		System.out.println(t3.getNano());
		
		
		System.out.println(time.isBefore(t3));
		System.out.println(time.isAfter(t3));
		System.out.println(time.compareTo(t3));
		
		//converting string to localtime
		String strTime="11:35:20";
		LocalTime convertTime=LocalTime.parse(strTime);
		System.out.println(convertTime);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formatedTime=time.format(df);
		System.out.println(formatedTime);
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		
		
	}

}
