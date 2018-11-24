package com.lattice.sigleton;
/**
 * @author lattice
 * @use 测试简单单例模式
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
	
	//声明并创建一个静态的实例
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
	 * @use 获取单例模式类中的静态对象
	 * @return 
	 */
	public static A getInstance(){
		return instance;
	}

}
