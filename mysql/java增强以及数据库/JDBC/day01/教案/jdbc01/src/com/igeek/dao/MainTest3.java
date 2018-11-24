package com.igeek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class MainTest3 {

	
		// TODO Auto-generated method stub
		
		/* 成员变量 */
	public Connection con=null;
	@Before
	public void a() {
		//获得数据库连接对象。
		con= JdbcUtils.getConnection();
	}
	@Test
	public void insert() throws Exception {
		String sql = "insert into user values(?,?,?,?)";
		PreparedStatement prepareStatement = con.prepareStatement(sql);
		prepareStatement.setString(1, "4");
		prepareStatement.setString(2, "jackson");
		prepareStatement.setString(3, "568");
		prepareStatement.setInt(4, 138888);
		int i = prepareStatement.executeUpdate();//会影响多少条数据。
		System.out.println(i);
	}
	
	@Test
	public void delete() throws Exception {
		String sql = "delete from user where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "1");
		int i = ps.executeUpdate();
		System.out.println(i);
	}
	
	@Test
	public void update() throws Exception {
		String sql = "update user set username = ? where id = ?";  
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "sbsb");
		ps.setString(2, "2");
		int i = ps.executeUpdate();
		System.out.println(i);
	}
}
