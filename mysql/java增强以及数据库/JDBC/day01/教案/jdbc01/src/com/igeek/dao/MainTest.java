package com.igeek.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ʹ�÷�װ�Ĺ����� ������� ���ݿ���� ��
		Connection connection = JdbcUtils.getConnection();
		Statement createStatement = connection.createStatement();
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = sc.nextLine();
		System.out.println("����������:");
		String password = sc.nextLine();*/
		//select * from user where username='' or '1=1' and password='' or '1=1'
		//String sql = "select * from user where username='"+username+"' and password='"+password+"'";
		//SQLע�� �� ����̨������  �˺�  ��  ����  ���ƥ�� ������  �����½�ɹ� ����½ʧ�ܡ�
		
		//SQLע��  ��
		String sql = "select * from user where username='' or '1=1' and password='' or '1=1'";
		ResultSet resultSet = createStatement.executeQuery(sql);
		
		/*if(resultSet.next()) 
			System.out.println("��½�ɹ�!");
		else
			System.out.println("��½ʧ��!");
		*/
		int i = JdbcUtils.getRowCount(resultSet);
		System.out.println(i);
	}

}
