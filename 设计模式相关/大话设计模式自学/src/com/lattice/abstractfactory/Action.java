package com.lattice.abstractfactory;
/**
 * �򵥹���ģʽ�Լ����󹤳�ģʽ
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {

		{//��ʾ���󹤳�ģʽsqlserver����user
			System.out.println("��ʾ���󹤳�ģʽsqlserver����user");
			User user=new User();
			user.setId("user1");
			user.setName("lattice");
			DaoFactory daoFactory=new SqlserverFactory();
			DaoUser daoUser=daoFactory.createUser();
			daoUser.insert(user);
			daoUser.getUser("lattice");
		}

		{//�򵥹���ģʽ��ʾaccess��������
			System.out.println("�򵥹���ģʽ��ʾaccess��������");
			Department department=new Department();
			department.setId("department1");
			department.setName("development");
			DaoDepartment daoDepartment=DataAccess.createDepartment();
			daoDepartment.insert(department);
			daoDepartment.getDepartment("development");
		}

	}
	/**
	 * ��������
	 	 ��ʾ���󹤳�ģʽsqlserver����user
			sql server ���� user:name=lattice
			sql server ͨ��name=lattice��ѯuser
		�򵥹���ģʽ��ʾaccess��������
			access ���� Department:name=development
			access ͨ��name=development��ѯDepartment
	 */
}
