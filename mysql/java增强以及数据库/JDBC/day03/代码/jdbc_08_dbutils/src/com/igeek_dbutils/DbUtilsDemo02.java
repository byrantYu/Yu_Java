package com.igeek_dbutils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.QualifiedNameable;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.igeek.domain.Product;
import com.igeek.utils.C3p0Utils;

/**
 * @ClassName: DbUtilsDemo02
 * @Description: ʵ��dbutils�Ĳ�ѯ����
 * @date 2018��2��1�� ����3:29:47 Company www.igeekhome.com
 * 
 * ���У�demo01,demo02,demo03һ��Ҫ����
 */
public class DbUtilsDemo02 {

	/**
	 * ��ѯ���ݱ�������������һ�ַ�ʽ: BeanHandler����ʽ �����ݱ�Ľ������һ������,��װ��JavaBean��Ķ��� ���췽��:
	 * BeanHandler(Class<T> type) ����һ��Class���Ͷ���,�������װ��ָ����JavaBean������
	 * 
	 */
	@Test
	public void demo01() throws SQLException {
		// 1.��ú��������
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

		// 2.���в�ѯ����
		String sql = "select * from product where pid=?";
		Object[] params = { 1 };
		// ע�⣺���ݿ���е��ֶ�����javaBean�е��������Ʊ��뱣��һ��
		Product p = qr.query(sql, new BeanHandler<Product>(Product.class), params);

		System.out.println(p);
	}

	/**
	 * ��ѯ���ݱ�������������һ�ַ�ʽ: BeanListHandler����ʽ �����ݱ��ÿһ������,��װ��JavaBean�����
	 * ����������,���JavaBean����,�洢List����
	 * 
	 * @throws SQLException
	 */
	@Test
	public void demo02() throws SQLException {
		// 1.��ú��������
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

		// 2.���в�ѯ����
		String sql = "select * from product";
		List<Product> list = qr.query(sql, new BeanListHandler<Product>(Product.class));

		System.out.println(list);
	}

	/**
	 * ��ѯ���ݱ�������������һ�ַ�ʽ: ScalarHandler����ʽ ����ֵ��ѯ���,ִ�е�select����,�����ֻ��1��
	 * 
	 * @throws SQLException
	 */
	@Test
	public void demo03() throws SQLException {
		// ��ѯ��Ʒ������
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

		String sql = "select count(*) from product";
		Long obj = qr.query(sql, new ScalarHandler<Long>());

		System.out.println(obj);

	}

	/**
	 * ��ѯ���ݱ�������������һ�ַ�ʽ: MapHandler����ʽ �����ݱ������ĵ�һ������,��װ��Map���� ��: ���ݱ��е��� ֵ:
	 * ������е�����
	 * 
	 * ����ʽ��Map����,��LinkedHashMap������
	 * @throws SQLException 
	 */
	@Test
	public void demo04() throws SQLException {
		// MapHandler �� ����ѯ����һ����¼����װ��Map�У�map.key=�ֶ�����map.value=ֵ
		// * ��Ҫ��;����������������ת��json ��
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product where pid=?";
		Object[] params = {1};
		Map<String,Object> map = qr.query(sql, new MapHandler(), params);
		
		System.out.println(map);
	}
	
	/**
	 * ��ѯ���ݱ���������һ�ִ���ʽ:
	 *   MapListHandler����ʽ
	 *     �����ݱ�Ľ������ÿһ�з�װ��Map����
	 *     ���ݱ��������,���ֶ��Map����,�洢List����
	 * @throws SQLException 
	 */
	@Test
	public void demo05() throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product";
		List<Map<String, Object>> list = qr.query(sql, new MapListHandler());
		
		System.out.println(list);
	}
	
	/**
	 *  ��ѯ���ݱ�������������һ�ַ�ʽ:
	 *  ArrayHandler����ʽ
	 *    �����ݱ��еĵ�һ������,�洢����������Object[]��
	 *  
	 *  ע��: ��ȡ��ѯ��ĵ�һ������,�����ѯ���������,���صĶ��������length=0
	 * @throws SQLException 
	 */
	@Test
	public void demo06() throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product where pid=?";
		Object[] params = {2};
		Object[] query = qr.query(sql, new ArrayHandler(), params);
		
		System.out.println(query[1]);
	}
	
	/**
	 * ��ѯ���ݱ�������������һ�ַ�ʽ:
	 * ArrayListHandler����ʽ
	 *  �����ݱ��е�ÿһ������,�洢��һ����������Object[]��
	 *  �����ݱ��л��ж�������,���������������, �洢��List������
	 * @throws SQLException 
	 */
	@Test
	public void demo07() throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product";	
		List<Object[]> query = qr.query(sql, new ArrayListHandler());
		
		System.out.println(query);
	}
	
	@Test
	public void demo08() throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product";	
		
		/*
		 * KeyedHandler:new KeyedHandler("�ֶ���")������ѯ�����װ��map��
		 * map.key : �ֶ�����Ӧ��ֵ
		 * map.value : ��ѯ�������������ݵĽ�������ؽ����map���� Map<String,Object>
		 */
		Map<String, Map<String, Object>> map = qr.query(sql, new KeyedHandler<String>("pname"));
		
		// ����map����
		for(Map.Entry<String, Map<String,Object>> entry:map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	/**
	 * ��ѯ���ݱ�������������һ�ַ�ʽ:
	 *   ColumnListHandler����ʽ
	 *     ����ѯ���ݱ������е�ĳһ������,�洢��List����
	 *     �ĸ��в����,��������Ҳ�����, List<Object>
	 *  ColumnListHandler���췽��
	 *    �ղ���: ��ȡ�������ݱ�ĵ�һ��
	 *    int����: �����е�˳����
	 *    String����: ��������
	 *    
	 *  ��������,���Լ��뷺��,���Ǽ������������,Ҫ�Ͳ�ѯ��������һ��
	 * @throws SQLException 
	 */
	@Test
	public void demo09() throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product";	
		
		List<String> list = qr.query(sql, new ColumnListHandler<String>("pname"));
		
		System.out.println(list);
	}
}
