package com.igeek.cp;

//票 
public class Ticket {

	//票号
	private int number = 0;

	//flag标志 。 用来表示 当前线程中是否存在数据 。
	boolean flag;
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
