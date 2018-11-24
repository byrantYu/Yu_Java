package com.igeek.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cd = Calendar.getInstance();//类名.来调用创建对象的方法 。拿到日历对象。
		System.out.println(cd);
		
		//转换成Date对象。
		Date date = cd.getTime();
		System.out.println(date);
		
		
		int year = cd.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cd.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day = cd.get(Calendar.DAY_OF_MONTH);//29     日
		System.out.println(day);
		
		cd.set(2018, 7, 29);
		System.out.println(cd);
		//Calendar 类 ，知道表示日历类就OK...
	}

}
