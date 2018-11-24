package com.lattice.baoshu;

import java.sql.Timestamp;

public class Test1 {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		Timestamp timest=new Timestamp(time);
		System.out.println(timest.toString());
		
		String sDate="2017-03-22 16:17:11.483";
		Timestamp timestamp=Timestamp.valueOf(sDate);
		System.out.println(timestamp.toString());
	}

}
