package com.igeek.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**  
* @ClassName: C3p0Utils  
* @Description: 工具类，与 JdbcUtils相同
* @date 2018年1月31日 下午4:14:56    
* Company www.igeekhome.com
*    
*/
public class C3p0Utils {
	
	// 创建连接池
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
	
	/**
	 * 
	* @Title: getConnection  
	* @Description: 获得连接对象
	* @return
	* @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**
	 * 获得数据源对象
	* @Title: getDataSource  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
}
