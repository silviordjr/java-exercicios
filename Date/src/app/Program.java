package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDateTime date2 = LocalDateTime.now();
		Instant date3 = Instant.now();
		
		LocalDate date4 = LocalDate.parse("2002-07-06");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date5 = LocalDate.parse("06/01/2022", fmt1);
		
		LocalDate date6 = LocalDate.of(2002,8,14);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date5);
		System.out.println(date6);
		
		System.out.println("-------------------------------------------");
	
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //withZone necessario para Instant.
		
		System.out.println(date1.format(fmt1));
		System.out.println(fmt1.format(date1));
		System.out.println(fmt2.format(date3));
		
		System.out.println("-------------------------------------------");
		
		LocalDate pastWeek = date1.minusWeeks(1);
		LocalDate nextWeek = date1.plusWeeks(1);
		
		Instant pastWeekInstant = date3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = date3.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeek);
		System.out.println(nextWeek);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		System.out.println("------------------------------------------");
		
		LocalDateTime pastWeekTime = date2.minusWeeks(1);
		LocalDateTime nextWeekTime = date2.plusWeeks(1);
		
		Duration time1 = Duration.between(pastWeekTime, nextWeekTime);
		Duration time2 = Duration.between(pastWeek.atStartOfDay(), nextWeek.atTime(0,0));
		
		System.out.println(time1.toHours());
		System.out.println(time2.toHours());
	}

}

//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
