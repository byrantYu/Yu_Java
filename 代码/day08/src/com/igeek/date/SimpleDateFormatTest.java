package com.igeek.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		String rule = "yyyyÄêMMÔÂddÈÕHH:mm:ss-----z"; //CST 
		SimpleDateFormat df = new SimpleDateFormat(rule);
		String date = df.format(new Date());
		System.out.println(date);
	}

}
