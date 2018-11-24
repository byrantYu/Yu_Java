package com.lattice.abstractfactory;
/**
 * ʹ�ü򵥹��������Ľ����󹤳�
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
