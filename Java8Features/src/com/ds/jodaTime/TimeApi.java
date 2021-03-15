package com.ds.jodaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeApi {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		
		int dd = date.getDayOfMonth();
		int mm= date.getMonthValue();
		int year = date.getYear();
		
		System.out.printf("%d-%d-%d",dd,mm,year);
		System.out.println();
		/*-----------------------*/
		LocalTime time = LocalTime.now();
		System.out.println(time);
	
		
		int h= time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
		/*-----------------------*/
		LocalDateTime dt= LocalDateTime.now();
		int d = dt.getDayOfYear();
		int mon = dt.getMonthValue();
		int y = dt.getYear();
		
		System.out.println(d+""+mon+""+y);
		
		int hr = dt.getHour();
		int min = dt.getMinute();
		int sec = dt.getSecond();
		int nsec = dt.getNano();
		
		System.out.println(hr+":"+min+":"+sec+":"+nsec);
		
		/*-----------------------*/
		System.out.println("___________________________");
		LocalDateTime ldt = LocalDateTime.of(1996, Month.JANUARY, 12, 1, 30, 40, 150);
		System.out.println(ldt);
		System.out.println("after 6 months "+ ldt.plusMonths(6));
		System.out.println("before 10 months"+ ldt.minusMonths(10));
		
		
		/*-----------------------*/
		System.out.println("_______________________");
		LocalDate doj = LocalDate.of(2018, Month.AUGUST, 20);
		LocalDate today = LocalDate.now();
		Period p = Period.between(doj, today);
		System.out.println("year "+p.getYears()+" months "+p.getMonths()+" days "+p.getDays());
		
		/*-----------------------*/
		System.out.println("_______________________");
		
		Year yr = Year.of(1610);
		 if(yr.isLeap()) {
			 System.out.println(yr+" is leap");
		 }else {
			 System.out.println(yr +" not leap");
		 }
		 
		 /*-----------------------*/
			System.out.println("_______________________");
			
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
		

	}

}
