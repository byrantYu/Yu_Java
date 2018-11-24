package com.igeek_01_c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**  
* @ClassName: C3p0Demo_02  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018年1月31日 下午4:01:57    
* Company www.igeekhome.com
*    
*/
public class C3p0Demo_02 {

	/**  
	* @Title: main  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param args    
	 * @throws SQLException 
	*/
	public static void main(String[] args) throws SQLException {
		/*
		 * 1.创建连接池对象（数据源）
		 * 会自动地加载 src下的c3p0-config.xml文件，进行具体的配置
		 */
		// 1.1 会查询配置文件中的default-config
		//ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 1.2 会根据配置文件中的named-config进行配置
		ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
		
		//2.获得连接对象
		Connection conn = dataSource.getConnection();

		System.out.println(conn);
	}

}
