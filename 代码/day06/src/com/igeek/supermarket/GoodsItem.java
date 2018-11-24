package com.igeek.supermarket;

//JavaBean , Entity ,domain  有个类，只描述这个类的属性，然后提供共有的set/get...
public class GoodsItem {
	/**  
	* @Fields name : 名称 
	*/  
	private String name;
	/**  
	* @Fields id : 货号  
	*/  
	private String id;
	/**  
	* @Fields price : 单价  
	*/  
	private double price;
	/**  
	* @Fields number : 数量  
	*/  
	private int number;
	/**  
	* @Fields unit : 计价单位  
	*/  
	private String unit;
	/**  
	* @Fields money : 金额  
	*/  
	private double money;
	
	
	
	
	public GoodsItem() {
		super();
	}




	public GoodsItem(String name, String id, double price, int number, String unit, double money) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.number = number;
		this.unit = unit;
		this.money = money;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public String getUnit() {
		return unit;
	}




	public void setUnit(String unit) {
		this.unit = unit;
	}




	public double getMoney() {
		return money;
	}




	public void setMoney(double money) {
		this.money = money;
	}




	@Override
	public String toString() {
		return "GoosItem [name=" + name + ", id=" + id + ", price=" + price + ", number=" + number + ", unit=" + unit
				+ ", money=" + money + "]";
	}

	
}
