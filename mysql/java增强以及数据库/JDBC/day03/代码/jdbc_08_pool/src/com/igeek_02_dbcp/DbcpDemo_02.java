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
* @Description: ʹ�������ļ�
* @date 2018��1��31�� ����4:29:36    
* Company www.igeekhome.com
*    
*/
public class DbcpDemo_02 {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param args    
	 * @throws Exception 
	*/
	public static void main(String[] args) throws Exception {
		// 1.������ӳ�
		// 1.1 ����properties�ļ������Properties����
		InputStream in = DbcpDemo_02.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
		Properties props = new Properties();
		props.load(in);
		// 1.2 ������ӳض���
		DataSource dataSource = BasicDataSourceFactory.createDataSource(props);
		
		// 2.������Ӷ���
		Connection conn = dataSource.getConnection();
		System.out.println(conn);

	}

}
