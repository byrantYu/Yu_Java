package com.igeek.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**  
* @ClassName: C3p0Utils  
* @Description: �����࣬�� JdbcUtils��ͬ
* @date 2018��1��31�� ����4:14:56    
* Company www.igeekhome.com
*    
*/
public class C3p0Utils {
	
	// �������ӳ�
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
	
	/**
	 * 
	* @Title: getConnection  
	* @Description: ������Ӷ���
	* @return
	* @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**
	 * �������Դ����
	* @Title: getDataSource  
	* @Description: TODO(������һ�仰�����������������)  
	* @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
}
