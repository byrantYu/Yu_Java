package com.igeek_02_dbcp;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

/**  
* @ClassName: DbcpDemo_01  
* @Description: 使用配置文件
* @date 2018年1月31日 下午4:29:36    
* Company www.igeekhome.com
*    
*/
public class DbcpDemo_02 {

	/**  
	* @Title: main  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param args    
	 * @throws Exception 
	*/
	public static void main(String[] args) throws Exception {
		// 1.获得连接池
		// 1.1 加载properties文件，获得Properties对象
		InputStream in = DbcpDemo_02.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
		Properties props = new Properties();
		props.load(in);
		// 1.2 获得连接池对象
		DataSource dataSource = BasicDataSourceFactory.createDataSource(props);
		
		// 2.获得连接对象
		Connection conn = dataSource.getConnection();
		System.out.println(conn);

	}

}
