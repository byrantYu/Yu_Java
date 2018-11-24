package com.igeek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class BaseDao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String driver = "com.mysql.jdbc.Driver";//���ݿ�
		String url = "jdbc:mysql://localhost:3306/girls?characterEncoding=utf-8";
		String user = "root";
		String password = "root123";
		//JDBC  java�������ݿ� ��
		//��Զ�ĵ�һ�� ���������ݿ�������
		Class.forName(driver);
		//��Զ�ĵڶ������������ݿ����Ӷ���connection
		Connection connection = DriverManager.getConnection(url, user, password);
		//���������������ݿ�ִ�ж��� ��ִ�ж��󡣸�ִֵ�о����SQL��䡣statement ���ݿ�ִ�ж��� ����������ִ�� SQL��䡣 
		Statement statement = connection.createStatement();
		//��дsql ��� ��
		String sql = "select * from boys";
		//statement.executeUpdate(sql);//ר������ִ��  insert into  ,  update  ,delete 
		//���岽�� ͨ��ִ��sql ��� �õ���������� �� �����������  �Ͱ����װ�� ��ѯ��� ��
		ResultSet result  = statement.executeQuery(sql);
		//��������������������� 
		//int count = 0;
		while(result.next()) {
			String id = result.getString("id");//�ֶ����� ���ֶ����Ƹ����ݿ��е��ֶ����� һһƥ�䡣
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
		//Ԫ���� ��meta 
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
