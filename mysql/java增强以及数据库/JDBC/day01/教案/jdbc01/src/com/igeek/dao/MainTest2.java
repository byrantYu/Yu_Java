package com.igeek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = JdbcUtils.getConnection();
		
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码:");
		String password = sc.nextLine();
		String sql = "select * from user where username = ? and password = ?";
		//普通的执行对象 会被sql注入 。(字符串拼接 ，达到非法的目的。)
		//拿到预处理 执行对象。预处理对象可以防止SQL注入 。  
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1, username);
		prepareStatement.setString(2, password);
		ResultSet resultSet = prepareStatement.executeQuery();
		
		if(resultSet.next()) 
			System.out.println("登陆成功!");
		else
			System.out.println("登陆失败!");
		
		//预处理对象的使用 。
		//  1. connection.preparedStatement(sql);  通过连接对象获得预处理对象 。 sql 就是你要查询的参数 。
		//  2. sql 应把把需要拼接的参数  使用占位符? 来表示 。
		//  3. prepareStatement.setString(1,"haha")  表示给第一个问好设置成haha 
		//	   prepareStatement.setInt(2,3); 表示给第二个问好设置成int类型 3
		//  4. prepareStatement.executeQuery(); 来拿到结果集对象。
		//  5. 正常的去操作结果集 即可。
	}

}
