package com.lattice.abstractfactory;
/**
 * 使用简单工厂方法改进抽象工厂
 * @author lattice
 *
 */
public class DataAccess {
	private static final String db = "access";
	//private static final String db = "sqlserver";
	public static DaoUser createUser() {
		DaoUser result = null;
		switch (db) {
			case "access": {
				result = new AccessUser();
			}
				break;
			case "sqlserver": {
				result = new SqlServerUser();
			}
				break;
		}
		return result;
	}

	public static DaoDepartment createDepartment() {
		DaoDepartment result = null;
		switch (db) {
			case "access": {
				result = new AccessDepartment();
			}
				break;
			case "sqlserver": {
				result = new SqlServerDepartment();
			}
				break;
		}
		return result;
	}
}
