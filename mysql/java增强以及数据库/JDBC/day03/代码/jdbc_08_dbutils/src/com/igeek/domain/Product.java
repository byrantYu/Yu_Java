package com.igeek.domain;

import java.io.Serializable;

/**  
* @ClassName: Product  
* @Description: Productʵ����(javaBean)
* @date 2018��2��1�� ����3:17:33    
* Company www.igeekhome.com
*    
*/
/*
 * JavaBean�Ĺ淶��
 * 1���ṩ˽�е����ԣ���Ա������
 * 2��Ϊ˽�еĳ�Ա�����ṩ������getter/setter����
 * 3���ṩΪ�չ��캯��
 * 4��ʵ�ֿ����л��ӿ�
 */
public class Product implements Serializable{
	/**  
	* @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)  
	*/  
	private static final long serialVersionUID = -6856881698526781818L;
	/**
	 * ˽�еĳ�Ա����
	 */
	private int pid;		// ��Ʒ���
	private String pname;	// ��Ʒ����
	private double price;	// ��Ʒ�۸�
	private String category_id; // ���ID
	
	/**
	 * ������setter/getter����
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
