package com.lattice.abstractfactory;
/**
 * 部门表department
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
 * 部门操作接口
 * @author lattice
 *
 */
interface DaoDepartment{
	public void insert(Department department);
	public void getDepartment(String name);
}

/**
 * sqlserver操作department
 * @author lattice
 *
 */
class SqlServerDepartment implements DaoDepartment{
	public void insert(Department department){
		System.out.println("sql server 新增 Department:name="+department.getName());
	}
	public void getDepartment(String name){
		System.out.println("sql server 通过name="+name+"查询Department");
	}
}
/**
 * access操作department
 * @author lattice
 *
 */
class AccessDepartment implements DaoDepartment{
	public void insert(Department department){
		System.out.println("access 新增 Department:name="+department.getName());
	}
	public void getDepartment(String name){
		System.out.println("access 通过name="+name+"查询Department");
	}
}
