package com.lattice.facade;

/**
 * @use �������ģʽ facade
 * @author lattice
 * @date 2016-12-26
 */
public class FacadeTest {

	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.methodA();
		facade.methodB();

	}

}
/**
 * @use d���������
 * @author lattice
 *
 */
class Facade{
	SubSystemOne subOne;
	SubSystemTwo subTwo;
	SubSystemThree subThree;
	SubSystemFour subFour;
	
	public Facade(){
		subOne=new SubSystemOne();
		subTwo=new SubSystemTwo();
		subThree=new SubSystemThree();
		subFour=new SubSystemFour();
	}
	public void methodA(){
		subOne.method1();
		subTwo.method1();
	}
	
	public void methodB(){
		subThree.method1();
		subFour.method1();
	}
	
}

/**
 * @use ����4����ϵͳ��
 * @author lattice
 *
 */
class SubSystemOne{
	public void method1(){
		System.out.println("method one");
	}
}
class SubSystemTwo{
	public void method1(){
		System.out.println("method two");
	}
}
class SubSystemThree{
	public void method1(){
		System.out.println("method three");
	}
}
class SubSystemFour{
	public void method1(){
		System.out.println("method fourx");
	}
}