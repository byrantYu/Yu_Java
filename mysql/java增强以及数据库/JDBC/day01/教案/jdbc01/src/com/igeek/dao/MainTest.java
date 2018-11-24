package com.igeek.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//使用封装的工具类 。来完成 数据库操作 。
		Connection connection = JdbcUtils.getConnection();
		Statement createStatement = connection.createStatement();
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码:");
		String password = sc.nextLine();*/
		//select * from user where username='' or '1=1' and password='' or '1=1'
		//String sql = "select * from user where username='"+username+"' and password='"+password+"'";
		//SQL注入 。 控制台中输入  账号  跟  密码  如果匹配 有数据  输出登陆成功 。登陆失败。
		
		//SQL注入  。
		String sql = "select * from user where username='' or '1=1' and password='' or '1=1'";
		ResultSet resultSet = createStatement.executeQuery(sql);
		
		/*if(resultSet.next()) 
			System.out.println("登陆成功!");
		else
			System.out.println("登陆失败!");
		*/
		int i = JdbcUtils.getRowCount(resultSet);
		System.out.println(i);
	}

}
