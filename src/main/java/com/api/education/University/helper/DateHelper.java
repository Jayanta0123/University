package com.api.education.University.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateHelper {
	private static final Logger log = LoggerFactory.getLogger(DateHelper.class);

	public static Date convertStringToDate(String dateString) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		formatter.setTimeZone(TimeZone.getDefault());
		Date date = new Date();
		try {
			date = formatter.parse(dateString);
		} catch (ParseException ex) {
			log.error("Exception in parsing the date {}", dateString, ex);
		}
		return date;
	}
}
