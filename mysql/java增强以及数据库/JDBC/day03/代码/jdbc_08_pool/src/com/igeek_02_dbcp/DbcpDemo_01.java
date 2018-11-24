package com.igeek_02_dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

/**  
* @ClassName: DbcpDemo_01  
* @Description: TODO(������һ�仰��������������)
* @date 2018��1��31�� ����4:29:36    
* Company www.igeekhome.com
*    
*/
public class DbcpDemo_01 {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param args    
	 * @throws SQLException 
	*/
	public static void main(String[] args) throws SQLException {
		// 1.�������ӳض�������Դ����
		BasicDataSource dataSource = new BasicDataSource();
		
		// 1.1 ����������
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/igeek_01");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		// 1.2 ����������
		dataSource.setInitialSize(5);
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(30);
		
		// 2.��ȡ���Ӷ���
		Connection conn = dataSource.getConnection();
		System.out.println(conn);

	}

}
