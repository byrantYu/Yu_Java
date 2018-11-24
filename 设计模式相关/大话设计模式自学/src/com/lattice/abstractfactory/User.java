package com.lattice.abstractfactory;
/**
 * 用户类
 * @author lattice
 *
 */
public class User{
	private String id;
	private String name;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
/**
 * 用户操作接口
 * @author lattice
 *
 */
interface DaoUser{
	public void insert(User user);
	public void getUser(String name);
}

/**
 * sqlserver操作user
 * @author lattice
 *
 */
class SqlServerUser implements DaoUser{
	public void insert(User user){
		System.out.println("sql server 新增 user:name="+user.getName());
	}
	public void getUser(String name){
		System.out.println("sql server 通过name="+name+"查询user");
	}
}
/**
 * access操作user
 * @author lattice
 *
 */
class AccessUser implements DaoUser{
	public void insert(User user){
		System.out.println("access 新增 user:name="+user.getName());
	}
	public void getUser(String name){
		System.out.println("access server 通过name="+name+"查询user");
	}
}
