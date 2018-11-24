package com.igeek.obj;

public class Test2 {

	public static void main(String[] args) {
		//System.out.println("a"+'\u0000'+"b");
		Test2 test2 = new Test2();
		test2.displayPerson(null);
		//NullPointerException 只要对象的值为空  在运行的时候 就会产生空指针异常。
	}
	public void displayPerson(Person person){
		person.display();
	}
	
	public void a(){
		b();//方法之间的调用。
	}
	public void b(){
		//注意：方法不能互相调用。
		/*public void c(){
			错误  写法  方法之间不能嵌套 。
		}*/
	}
}
