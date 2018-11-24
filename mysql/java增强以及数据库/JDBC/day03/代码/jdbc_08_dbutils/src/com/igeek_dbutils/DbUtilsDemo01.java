package com.igeek_dbutils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.igeek.utils.C3p0Utils;

/**  
* @ClassName: DbUtilsDemo01  
* @Description: ʹ��DBUtils����DML����
* @date 2018��2��1�� ����2:44:26    
* Company www.igeekhome.com
*    
*/
public class DbUtilsDemo01 {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param args    
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * ��Ʒ���
	 * @throws SQLException 
	* @Title: insert  
	* @Description: TODO(������һ�仰�����������������)
	 */
	@Test
	public void insert() throws SQLException{
		//1.�������������
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		
		//2.������Ӳ���
		String sql = "insert into product(pid,pname,price,category_id) values(?,?,?,?)";
		Object[] params = {101,"����",100,"c101"};
		int n = qr.update(sql, params);
		
		System.out.println(n);
	}

	@Test
	/**
	 * 
	* @Title: update  
	* @Description: �������� 
	* @throws SQLException
	 */
	public void update() throws SQLException{
		//1.������
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		
		//2.���и��²���
		String sql = "update product set pname=?,price=?,category_id=? where pid=?";
		Object[] params = {"������",5,"c007",101};
		int n = qr.update(sql,params);
		
		System.out.println(n);
	}
	
	@Test
	/**
	 * ɾ������
	* @Title: delete  
	* @Description: TODO(������һ�仰�����������������)
	 */
	public void delete() throws SQLException{
		//1.������
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		
		//2.����ɾ������
		String sql = "delete from product where pid=?";
		Object[] params = {101};
		int n = qr.update(sql,params);
		
		System.out.println(n);
	}
}
