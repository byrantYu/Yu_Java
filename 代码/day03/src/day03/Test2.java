package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		//获取当前系统时间  到计算机元年 。 毫秒数 。
		long  startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		Date date = new Date(startTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		String nowDate = sdf.format(date);
		System.out.println(nowDate);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);//单位是毫秒 。
	}

}
