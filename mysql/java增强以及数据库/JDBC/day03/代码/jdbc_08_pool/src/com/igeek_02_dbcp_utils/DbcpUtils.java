package com.igeek_02_dbcp_utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**  
* @ClassName: DbcpUtils  
* @Description: Dbcp工具类
* @date 2018年1月31日 下午4:48:39    
* Company www.igeekhome.com
*    
*/
public class DbcpUtils {
	// 1.创建连接池
	private static DataSource dataSource;
	
	// 使用静态代码块获取属性文件
	static{
		try {
			//1)加载properties文件 ，获得properties对象
			InputStream in = DbcpUtils.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
			Properties props = new Properties();
			props.load(in);
			//2)通过工厂类，创建连接池对象
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 获得连接对象
	* @Title: getConnection  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @return
	* @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**
	 * 获得连接池
	* @Title: getDataSource  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	
}
