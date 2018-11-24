package com.lattice.abstractfactory;
/**
 * �û���
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
 * �û������ӿ�
 * @author lattice
 *
 */
interface DaoUser{
	public void insert(User user);
	public void getUser(String name);
}

/**
 * sqlserver����user
 * @author lattice
 *
 */
class SqlServerUser implements DaoUser{
	public void insert(User user){
		System.out.println("sql server ���� user:name="+user.getName());
	}
	public void getUser(String name){
		System.out.println("sql server ͨ��name="+name+"��ѯuser");
	}
}
/**
 * access����user
 * @author lattice
 *
 */
class AccessUser implements DaoUser{
	public void insert(User user){
		System.out.println("access ���� user:name="+user.getName());
	}
	public void getUser(String name){
		System.out.println("access server ͨ��name="+name+"��ѯuser");
	}
}
