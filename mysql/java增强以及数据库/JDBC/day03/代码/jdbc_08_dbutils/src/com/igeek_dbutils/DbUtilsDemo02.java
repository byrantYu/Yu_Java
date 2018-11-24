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
 * @Description: 实现dbutils的查询操作
 * @date 2018年2月1日 下午3:29:47 Company www.igeekhome.com
 * 
 * 其中：demo01,demo02,demo03一定要掌握
 */
public class DbUtilsDemo02 {

	/**
	 * 查询数据表结果集处理其中一种方式: BeanHandler处理方式 将数据表的结果集第一行数据,封装成JavaBean类的对象 构造方法:
	 * BeanHandler(Class<T> type) 传递一个Class类型对象,将结果封装到指定的JavaBean对象中
	 * 
	 */
	@Test
	public void demo01() throws SQLException {
		// 1.获得核心类对象
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

		// 2.进行查询操作
		String sql = "select * from product where pid=?";
		Object[] params = { 1 };
		// 注意：数据库表中的字段名与javaBean中的属性名称必须保持一致
		Product p = qr.query(sql, new BeanHandler<Product>(Product.class), params);

		System.out.println(p);
	}

	/**
	 * 查询数据表结果集处理其中一种方式: BeanListHandler处理方式 将数据表的每一行数据,封装成JavaBean类对象
	 * 多行数据了,多个JavaBean对象,存储List集合
	 * 
	 * @throws SQLException
	 */
	@Test
	public void demo02() throws SQLException {
		// 1.获得核心类对象
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

		// 2.进行查询操作
		String sql = "select * from product";
		List<Product> list = qr.query(sql, new BeanListHandler<Product>(Product.class));

		System.out.println(list);
	}

	/**
	 * 查询数据表结果集处理其中一种方式: ScalarHandler处理方式 处理单值查询结果,执行的select语句后,结果集只有1个
	 * 
	 * @throws SQLException
	 */
	@Test
	public void demo03() throws SQLException {
		// 查询商品的数量
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

		String sql = "select count(*) from product";
		Long obj = qr.query(sql, new ScalarHandler<Long>());

		System.out.println(obj);

	}

	/**
	 * 查询数据表结果集处理其中一种方式: MapHandler处理方式 将数据表结果集的第一行数据,封装成Map集合 键: 数据表中的列 值:
	 * 这个列中的数据
	 * 
	 * 处理方式的Map集合,是LinkedHashMap的子类
	 * @throws SQLException 
	 */
	@Test
	public void demo04() throws SQLException {
		// MapHandler ： 将查询到的一条记录，封装到Map中，map.key=字段名，map.value=值
		// * 主要用途：多表操作、将数据转换json 等
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "select * from product where pid=?";
		Object[] params = {1};
		Map<String,Object> map = qr.query(sql, new MapHandler(), params);
		
		System.out.println(map);
	}
	
	/**
	 * 查询数据表结果集其中一种处理方式:
	 *   MapListHandler处理方式
	 *     将数据表的结果集的每一行封装成Map集合
	 *     数据表多行数据,出现多个Map集合,存储List集合
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
	 *  查询数据表结果集处理其中一种方式:
	 *  ArrayHandler处理方式
	 *    将数据表中的第一行数据,存储到对象数组Object[]中
	 *  
	 *  注意: 获取查询后的第一行数据,如果查询不到结果集,返回的对象数组的length=0
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
	 * 查询数据表结果集处理其中一种方式:
	 * ArrayListHandler处理方式
	 *  将数据表中的每一行数据,存储到一个对象数组Object[]中
	 *  而数据表中会有多行数据,产生多个对象数组, 存储到List集合中
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
		 * KeyedHandler:new KeyedHandler("字段名")，将查询结果封装到map中
		 * map.key : 字段名对应的值
		 * map.value : 查询出来的整个数据的结果，返回结果是map类型 Map<String,Object>
		 */
		Map<String, Map<String, Object>> map = qr.query(sql, new KeyedHandler<String>("pname"));
		
		// 遍历map集合
		for(Map.Entry<String, Map<String,Object>> entry:map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	/**
	 * 查询数据表结果集处理其中一种方式:
	 *   ColumnListHandler处理方式
	 *     将查询数据表结果集中的某一列数据,存储到List集合
	 *     哪个列不清楚,数据类型也不清楚, List<Object>
	 *  ColumnListHandler构造方法
	 *    空参数: 获取就是数据表的第一列
	 *    int参数: 传递列的顺序编号
	 *    String参数: 传递列名
	 *    
	 *  创建对象,可以加入泛型,但是加入的数据类型,要和查询的列类型一致
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
