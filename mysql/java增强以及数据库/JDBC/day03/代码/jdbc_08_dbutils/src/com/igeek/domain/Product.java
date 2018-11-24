package com.igeek.domain;

import java.io.Serializable;

/**  
* @ClassName: Product  
* @Description: Product实体类(javaBean)
* @date 2018年2月1日 下午3:17:33    
* Company www.igeekhome.com
*    
*/
/*
 * JavaBean的规范：
 * 1、提供私有的属性（成员变量）
 * 2、为私有的成员变量提供公共的getter/setter方法
 * 3、提供为空构造函数
 * 4、实现可序列化接口
 */
public class Product implements Serializable{
	/**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = -6856881698526781818L;
	/**
	 * 私有的成员变量
	 */
	private int pid;		// 商品编号
	private String pname;	// 商品名称
	private double price;	// 商品价格
	private String category_id; // 类别ID
	
	/**
	 * 公共的setter/getter方法
	 */
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", category_id=" + category_id + "]";
	}
	
	
}
