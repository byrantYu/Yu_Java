package com.lattice.abstractfactory;
/**
 * 简单工厂模式以及抽象工厂模式
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {

		{//演示抽象工厂模式sqlserver操作user
			System.out.println("演示抽象工厂模式sqlserver操作user");
			User user=new User();
			user.setId("user1");
			user.setName("lattice");
			DaoFactory daoFactory=new SqlserverFactory();
			DaoUser daoUser=daoFactory.createUser();
			daoUser.insert(user);
			daoUser.getUser("lattice");
		}

		{//简单工厂模式演示access操作部门
			System.out.println("简单工厂模式演示access操作部门");
			Department department=new Department();
			department.setId("department1");
			department.setName("development");
			DaoDepartment daoDepartment=DataAccess.createDepartment();
			daoDepartment.insert(department);
			daoDepartment.getDepartment("development");
		}

	}
	/**
	 * 输出结果：
	 	 演示抽象工厂模式sqlserver操作user
			sql server 新增 user:name=lattice
			sql server 通过name=lattice查询user
		简单工厂模式演示access操作部门
			access 新增 Department:name=development
			access 通过name=development查询Department
	 */
}
