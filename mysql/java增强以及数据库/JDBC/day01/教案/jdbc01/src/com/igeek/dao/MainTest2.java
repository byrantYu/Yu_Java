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
		System.out.println("�������û���:");
		String username = sc.nextLine();
		System.out.println("����������:");
		String password = sc.nextLine();
		String sql = "select * from user where username = ? and password = ?";
		//��ͨ��ִ�ж��� �ᱻsqlע�� ��(�ַ���ƴ�� ���ﵽ�Ƿ���Ŀ�ġ�)
		//�õ�Ԥ���� ִ�ж���Ԥ���������Է�ֹSQLע�� ��  
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1, username);
		prepareStatement.setString(2, password);
		ResultSet resultSet = prepareStatement.executeQuery();
		
		if(resultSet.next()) 
			System.out.println("��½�ɹ�!");
		else
			System.out.println("��½ʧ��!");
		
		//Ԥ��������ʹ�� ��
		//  1. connection.preparedStatement(sql);  ͨ�����Ӷ�����Ԥ������� �� sql ������Ҫ��ѯ�Ĳ��� ��
		//  2. sql Ӧ�Ѱ���Ҫƴ�ӵĲ���  ʹ��ռλ��? ����ʾ ��
		//  3. prepareStatement.setString(1,"haha")  ��ʾ����һ���ʺ����ó�haha 
		//	   prepareStatement.setInt(2,3); ��ʾ���ڶ����ʺ����ó�int���� 3
		//  4. prepareStatement.executeQuery(); ���õ����������
		//  5. ������ȥ��������� ���ɡ�
	}

}
