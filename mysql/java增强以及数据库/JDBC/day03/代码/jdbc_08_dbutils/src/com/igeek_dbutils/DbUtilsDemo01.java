package com.igeek_dbutils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.igeek.utils.C3p0Utils;

/**  
* @ClassName: DbUtilsDemo01  
* @Description: 使用DBUtils进行DML操作
* @date 2018年2月1日 下午2:44:26    
* Company www.igeekhome.com
*    
*/
public class DbUtilsDemo01 {

	/**  
	* @Title: main  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param args    
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 商品添加
	 * @throws SQLException 
	* @Title: insert  
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	@Test
	public void insert() throws SQLException{
		//1.创建核心类对象
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		
		//2.进行添加操作
		String sql = "insert into product(pid,pname,price,category_id) values(?,?,?,?)";
		Object[] params = {101,"测试",100,"c101"};
		int n = qr.update(sql, params);
		
		System.out.println(n);
	}

	@Test
	/**
	 * 
	* @Title: update  
	* @Description: 更新数据 
	* @throws SQLException
	 */
	public void update() throws SQLException{
		//1.核心类
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		
		//2.进行更新操作
		String sql = "update product set pname=?,price=?,category_id=? where pid=?";
		Object[] params = {"方便面",5,"c007",101};
		int n = qr.update(sql,params);
		
		System.out.println(n);
	}
	
	@Test
	/**
	 * 删除操作
	* @Title: delete  
	* @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	public void delete() throws SQLException{
		//1.核心类
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		
		//2.进行删除操作
		String sql = "delete from product where pid=?";
		Object[] params = {101};
		int n = qr.update(sql,params);
		
		System.out.println(n);
	}
}
