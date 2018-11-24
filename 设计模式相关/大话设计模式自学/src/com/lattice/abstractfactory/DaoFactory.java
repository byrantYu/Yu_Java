package com.lattice.abstractfactory;
/**
 * ʹ�ó��󹤳�ģʽ����ģ�����ݿ�����ӿ�
 * @author lattice
 *
 */
public interface DaoFactory {
	DaoUser createUser();
	DaoDepartment createDepartment();
}
/**
 * sqlserver��������
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
 * access ��������
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