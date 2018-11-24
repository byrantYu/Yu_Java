package com.igeek.supermarket;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//收据类。
public class Receipt {
	/**  
	* @Fields data : 成员位置定义集合,存储所有的商品项对象 
	*/  
	static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
	
	public static void main(String[] args) {
		//为集合准备数据
		initData();
		//写完之后 考虑做一个IO版本的。
		while(true) {
			//使用switch给出操作选择：1输入购买数量2打印小票3退出
			//提示信息
			System.out.println("请输入您要进行的操作:1输入购买数量   2打印小票   3退出");
			
			//通过键盘录入得到数据
			Scanner sc = new Scanner(System.in);
			int optNumber = sc.nextInt();
			//完成switch中三个case的逻辑
			switch (optNumber) {
			case 1:
				//System.out.println("给所有数据量赋值");
				//输入数量 。  
				enterNum();
				break;
			case 2:
				//调用打印购物小票的方法
				//System.out.println("打印购物小票");
				printReceipt();
				break;
			case 3:
				System.out.println("欢迎下次光临");
				//退出程序
				System.exit(0);
			default:
				System.out.println("请输入正确的数字!");
				break;
			}
		}

	}

	/**  
	* @Title: initData  
	* @Description: 定义方法,向成员位置的集合赋值      
	*/
	public static void initData() {
		//创建多个商品项对象                                           名称，id，单价，{{数量}}}，计价单位, {{金额}}
		GoodsItem sls = new GoodsItem("少林寺核桃", "090115", 15.5, 0, "个", 0);
		GoodsItem shk = new GoodsItem("尚康饼干", "090027", 14.5, 0, "个", 0);
		//将多个商品项对象放入集合中
		data.add(sls);
		data.add(shk);
	}

	public static void enterNum(){
		//
		for (int i = 0; i < data.size(); i++) {
			//取出每一个商品对象 。  //  byte b1 = 10.3
			GoodsItem goods =  data.get(i);//此时 第一次循环 goods对象中就封装以下信息  "少林寺核桃", "090115", 15.5, 0, "个", 0
			System.out.println("请输入您购买的"+goods.getName()+"的数量:");
			Scanner sc = new Scanner(System.in);
			int input  = sc.nextInt();
			goods.setNumber(input);
			goods.setMoney(input*goods.getPrice());
			
			//"少林寺核桃", "090115", 15.5, 2, "个", 31.0
		}
	}
	
	/**
	 * 打印小票
	 */
	public static void printReceipt(){
		System.out.println("    欢迎光临");
		System.out.println("品名\t售价\t数量\t单位\t金额");
		System.out.println("-------------------------------------------");
		//
		//定义局部变量 。
		int totalNumber = 0;//总的件数
		double totalMoney = 0.0;
		for (int i = 0; i < data.size(); i++) {
			GoodsItem goods = data.get(i);
			//每次循环  goods对象就代表了一个商品 。
			totalNumber+=goods.getNumber();
			totalMoney+=goods.getMoney();
			System.out.println(goods.getName()+"\t"+goods.getPrice()+"\t"+goods.getNumber()+"\t"+goods.getUnit()+"\t"+goods.getMoney());
		}
		System.out.println("-------------------------------------------");
		System.out.println("\t"+data.size()+"项商品"+"\t"+"共计"+totalNumber);
		System.out.println("总计:"+totalMoney);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH-mm-ss");
		String dateNow = sdf.format(date);
		System.out.println(dateNow);
		//String
	}
	
	protected void test(){
		
	}
	
	private void test1(){
		
	}
}
