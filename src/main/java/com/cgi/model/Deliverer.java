package com.cgi.model;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Deliverer {

	public Deliverer() {

	}

	public String GiveFormatedDate(DateTime dateTime) {
		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd");

		return dtf.print(dateTime);
	}

	public void printCalendar(List<DateTime> calendar) {
		int j = 0;
		System.out.println(" Mon Tue Wed Thr Fri Sat Sun ");
		for (int i = 0; i < (calendar.size() / 7); i++) {
			System.out.println("  " + this.GiveFormatedDate(calendar.get(i + j + 0)) + "  "
									+ this.GiveFormatedDate(calendar.get(i + j + 1)) + "  "
									+ this.GiveFormatedDate(calendar.get(i + j + 2)) + "  "
									+ this.GiveFormatedDate(calendar.get(i + j + 3)) + "  "
									+ this.GiveFormatedDate(calendar.get(i + j + 4)) + "  "
									+ this.GiveFormatedDate(calendar.get(i + j + 5)) + "  "
									+ this.GiveFormatedDate(calendar.get(i + j + 6)));
					j = j + 6;

		}

	}

}
