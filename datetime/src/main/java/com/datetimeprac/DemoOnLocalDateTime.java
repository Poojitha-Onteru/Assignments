package com.datetimeprac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		
		//convert string to local date time
		String str="2024-11-24T16:44:58.418110100";
		LocalDateTime ldt=LocalDateTime.parse(str);
		System.out.println(ldt.getClass());
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
		String formatedTime=ldt.format(df);
		System.out.println("Formated date:"+formatedTime);
		
		LocalDateTime formatedTime2=LocalDateTime.of(2024, 11,24,16,44,58);
		String str1=df.format(formatedTime2);
		System.out.println("Formated date:"+str1);
		
		LocalDateTime dt1=LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println(dt1);
		
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);
		

	}

}
