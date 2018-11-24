package com.lattice.abstractfactory;
/**
 * 使用抽象工厂模式测试模拟数据库操作接口
 * @author lattice
 *
 */
public interface DaoFactory {
	DaoUser createUser();
	DaoDepartment createDepartment();
}
/**
 * sqlserver操作工厂
 * @author lattice
 *
 */
class SqlserverFactory implements DaoFactory{

	public DaoUser createUser() {
		return new SqlServerUser();
	}

	public DaoDepartment createDepartment() {
		return new SqlServerDepartment();
	}
	
}
/**
 * access 操作工厂
 * @author lattice
 *
 */
class AccessFactory implements DaoFactory{

	public DaoUser createUser() {
		return new AccessUser();
	}

	public DaoDepartment createDepartment() {
		return new AccessDepartment();
	}
	
}