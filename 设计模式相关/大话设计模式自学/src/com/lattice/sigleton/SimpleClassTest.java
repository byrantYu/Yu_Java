package com.lattice.sigleton;
/**
 * @author lattice
 * @use ���Լ򵥵���ģʽ
 * @date 2016-12-16
 */
public class SimpleClassTest {

	public static void main(String[] args) {
		A a=A.getInstance();
		A b=A.getInstance();
		System.out.println(a.equals(b));
	}
}
/**
 * @author lattice
 * 
 */
class A{
	private int i;
	
	//����������һ����̬��ʵ��
	public static A instance =new A();
	
	private A(int i){
		this.i=i;
		System.out.println(i);
		
	}
	private A(){
		this(1);
	}
	
	public int getI(){
		return this.i;
	}
	/**
	 * @use ��ȡ����ģʽ���еľ�̬����
	 * @return 
	 */
	public static A getInstance(){
		return instance;
	}

}
