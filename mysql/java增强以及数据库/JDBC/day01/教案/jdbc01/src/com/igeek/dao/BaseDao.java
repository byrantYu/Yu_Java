package com.igeek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class BaseDao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String driver = "com.mysql.jdbc.Driver";//数据库
		String url = "jdbc:mysql://localhost:3306/girls?characterEncoding=utf-8";
		String user = "root";
		String password = "root123";
		//JDBC  java连接数据库 。
		//永远的第一步 。加载数据库驱动。
		Class.forName(driver);
		//永远的第二步。创建数据库连接对象。connection
		Connection connection = DriverManager.getConnection(url, user, password);
		//第三步。创建数据库执行对象 。执行对象。赋值执行具体的SQL语句。statement 数据库执行对象 。可以用来执行 SQL语句。 
		Statement statement = connection.createStatement();
		//书写sql 语句 。
		String sql = "select * from boys";
		//statement.executeUpdate(sql);//专门用来执行  insert into  ,  update  ,delete 
		//第五步。 通过执行sql 语句 拿到结果集对象 。 结果集对象中  就帮你封装了 查询结果 。
		ResultSet result  = statement.executeQuery(sql);
		//后面来遍历操作结果集。 
		//int count = 0;
		while(result.next()) {
			String id = result.getString("id");//字段名称 。字段名称跟数据库中的字段名称 一一匹配。
			String boyName = result.getString("boyName");
			String userCP = result.getString("userCP");
			System.out.println(id+" "+boyName+" "+userCP);
			//count++;
		}
		//System.out.println(count);
		//
		result.last();
		int i = result.getRow();
		System.out.println(i);
		//元数据 。meta 
		ResultSetMetaData metaData = result.getMetaData();
		int columnCount = metaData.getColumnCount();
		System.out.println(columnCount);
		String columnName = metaData.getColumnName(3);
		System.out.println(columnName);
		result.close();
		statement.close();
		connection.close();
		
	}

}
