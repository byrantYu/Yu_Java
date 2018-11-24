package com.lattice.abstractfactory;
/**
 * ���ű�department
 * @author lattice
 *
 */
public class Department{
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
 * ���Ų����ӿ�
 * @author lattice
 *
 */
interface DaoDepartment{
	public void insert(Department department);
	public void getDepartment(String name);
}

/**
 * sqlserver����department
 * @author lattice
 *
 */
class SqlServerDepartment implements DaoDepartment{
	public void insert(Department department){
		System.out.println("sql server ���� Department:name="+department.getName());
	}
	public void getDepartment(String name){
		System.out.println("sql server ͨ��name="+name+"��ѯDepartment");
	}
}
/**
 * access����department
 * @author lattice
 *
 */
class AccessDepartment implements DaoDepartment{
	public void insert(Department department){
		System.out.println("access ���� Department:name="+department.getName());
	}
	public void getDepartment(String name){
		System.out.println("access ͨ��name="+name+"��ѯDepartment");
	}
}
