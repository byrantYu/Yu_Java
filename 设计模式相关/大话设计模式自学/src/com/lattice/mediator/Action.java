package com.lattice.mediator;
/**
 * @use �����н���ģʽ
 * @author lattice
 * @date 2017-01-09
 */
public class Action {

	public static void main(String[] args) {
		ConcreteMediator mediator=new ConcreteMediator();
		ConcreteColleage1 colleage1=new ConcreteColleage1(mediator);
		ConcreteColleage2 colleage2=new ConcreteColleage2(mediator);
		mediator.setColleage1(colleage1);
		mediator.setColleage2(colleage2);
		colleage1.send("��ð���");
		System.out.println("*****************");
		colleage2.send("��ã��ܸ�����ʶ�㣡");
		
		/**
		 * ��������
		 * 
			��ð���
			ͬ��2�õ���Ϣ����ð���
			*****************
			��ã��ܸ�����ʶ�㣡
			ͬ��1�õ���Ϣ����ã��ܸ�����ʶ�㣡
		 */
	}

}
