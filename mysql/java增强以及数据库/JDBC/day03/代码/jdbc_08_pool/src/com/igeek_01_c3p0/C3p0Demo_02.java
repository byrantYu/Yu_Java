package com.igeek_01_c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**  
* @ClassName: C3p0Demo_02  
* @Description: TODO(������һ�仰��������������)
* @date 2018��1��31�� ����4:01:57    
* Company www.igeekhome.com
*    
*/
public class C3p0Demo_02 {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param args    
	 * @throws SQLException 
	*/
	public static void main(String[] args) throws SQLException {
		/*
		 * 1.�������ӳض�������Դ��
		 * ���Զ��ؼ��� src�µ�c3p0-config.xml�ļ������о��������
		 */
		// 1.1 ���ѯ�����ļ��е�default-config
		//ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 1.2 ����������ļ��е�named-config��������
		ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
		
		//2.������Ӷ���
		Connection conn = dataSource.getConnection();

		System.out.println(conn);
	}

}
