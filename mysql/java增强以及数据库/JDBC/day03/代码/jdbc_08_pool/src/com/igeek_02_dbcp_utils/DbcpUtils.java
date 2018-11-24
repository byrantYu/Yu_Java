package com.igeek_02_dbcp_utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**  
* @ClassName: DbcpUtils  
* @Description: Dbcp������
* @date 2018��1��31�� ����4:48:39    
* Company www.igeekhome.com
*    
*/
public class DbcpUtils {
	// 1.�������ӳ�
	private static DataSource dataSource;
	
	// ʹ�þ�̬������ȡ�����ļ�
	static{
		try {
			//1)����properties�ļ� �����properties����
			InputStream in = DbcpUtils.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
			Properties props = new Properties();
			props.load(in);
			//2)ͨ�������࣬�������ӳض���
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * ������Ӷ���
	* @Title: getConnection  
	* @Description: TODO(������һ�仰�����������������)  
	* @return
	* @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**
	 * ������ӳ�
	* @Title: getDataSource  
	* @Description: TODO(������һ�仰�����������������)  
	* @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	
}
