package com.igeek.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {

	public static void main(String[] args) throws ParseException {
		String rule = "yyyy年MM月dd日HH:mm:ss";
		DateFormat df = new SimpleDateFormat(rule);
		//把date对象转换成你想要的日期格式 。
		
		//把日期格式 转换成你要的系统时间 。Date . 毫秒数。。。
		String date = "2016年10月30日08:08:08";
		
		Date d = df.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI); //资金  仓储 。。。  计算工具类。  CVS  .
		
	}

}
