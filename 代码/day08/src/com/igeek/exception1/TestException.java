package com.igeek.exception1;
/**
 * �쳣��������ַ�ʽ 
 * 1.�� 
 * 2.���� 
 * 
 * 
 * @author ����Ӫ
 * @Version 1.0 2018��8��29��
 * Company wh.igeekhome.com
 */
public class TestException {

	//.class     
	public static void main(String[] args) {
		//����ʱ�쳣��
		//����ʱ�쳣��java.lang.ArithmeticException
		//try�����쳣  catch �����쳣 ��  
		//��try�зŵ��ǿ��ܳ����쳣�Ĵ��롣
		//һ��������catch֮�󣬵�try�еĴ�������쳣���ͻ�ִ��catch�еĴ��롣
		try {
			int a=0;
			System.out.println(100/a);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("��������Ϊ0,SB!!!");
			e.printStackTrace();
			//e.getMessage();
		} finally{
			System.out.println("�����Ƿ�����쳣������ִ��finally�еĴ��롣");
		}
		
		//final �� finally ������
	}

}
