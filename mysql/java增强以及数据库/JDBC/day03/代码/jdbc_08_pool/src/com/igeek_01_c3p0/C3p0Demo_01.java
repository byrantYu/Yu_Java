package com.igeek_01_c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**  
* @ClassName: C3p0Demo_01  
* @Description: TODO(������һ�仰��������������)
* @date 2018��1��31�� ����3:20:25    
* Company www.igeekhome.com
*    
*/
public class C3p0Demo_01 {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param args    
	 * @throws SQLException 
	*/
	public static void main(String[] args) throws Exception {
		//1.�������ӳأ�����Դ��
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		//1.1 ��������
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/igeek_02");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		
		//1.2 ����������
		// 1.2.1 ���ó�ʼʱ������������
		dataSource.setInitialPoolSize(5);
		// 1.2.2 �������ӳ�����С�������������
		dataSource.setMinPoolSize(3);
		dataSource.setMaxPoolSize(10);
		// 1.2.3 ����ÿ��������������
		dataSource.setAcquireIncrement(2);
		// 1.2.4 �������ӵ�������ʱ��(����Ϊ��λ)
		dataSource.setMaxIdleTime(30);
		
		//2.�����ӳ��л�ȡ���Ӷ���
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);
	}

}
