package com.igeek.extends2;

public class Sun extends Fu {

	//super();  表示调用父类中空的无参的构造器。
	//super(10.0) 表示调用父类中的构造器 。
	public Sun(){
		//super(10);
		//super("哈哈哈");
		//当你指定调用自身构造器的时候，super()不再调用。
		this(10);
		//this("哈哈");
		System.out.println("子类的构造器。");
		
	}  
	
	public Sun(int a){
		//super();
		//super();
		//this();
		this("哈哈");
		System.out.println(a);//10 
	}
	
	public Sun(String str){
		//super();
		System.out.println(str);
	}
	
	//public String name="儿子";
	
	public void show(){
		System.out.println(this.name);
		System.out.println(super.name);
		this.eat();
		//对象声明的引用 。
		
		//注意：通过继承关系，子类可以直接调用父类中的非private方法。 
		dream();//super.dream()等价的写法 。super.可以省略。
		
		System.out.println(yy);
	}
	
	public void eat(){
		System.out.println("吃");
	}
	
	public void test(){
		//System.out.println(name);//默认当前输出打印语句中的name 就是形式参数name
		//System.out.println(name); 本行的name指向当前类的成员。
		System.out.println(name);//本行的name 指向父类类的成员。
		
	}
}
