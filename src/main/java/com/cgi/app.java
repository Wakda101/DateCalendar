package com.cgi;

import java.util.*;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.cgi.model.Deliverer;

public class app {

	public static void main(String[] args) {

		System.out.println("Give me date in ISO format: YYYY-MM-DD");
		Scanner scaner = new Scanner(System.in);
		String date = scaner.nextLine();

		DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-M-dd EEE");

		DateTime fdate = DateTime.parse(date, DateTimeFormat.forPattern("yyyy-M-d"));
		System.out.println(dtf.print(fdate));

		DateTime startDate = fdate.dayOfMonth().withMinimumValue().dayOfWeek().withMinimumValue();
		DateTime endDate = fdate.dayOfMonth().withMaximumValue().dayOfWeek().withMaximumValue();
		
		
		Deliverer d = new Deliverer();
		List<DateTime> calendar = new ArrayList<>();
		Days dbetween = Days.daysBetween(startDate, endDate);
		
		
		
		for (int i = 0; i < dbetween.getDays()+1; i++) {
			calendar.add(startDate.plusDays(i));
		}

		d.printCalendar(calendar);

	}

}
