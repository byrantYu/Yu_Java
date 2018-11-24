package com.igeek.hello;

//  抑制 编译警告。unused 没有使用的不警告。

public class BiaoShiFu {
	
	//格式话代码。c+s +F
	//Alt + / 
	//Ctrl + /  快速注释单行代码 。 再次点击取消注释。
	//Ctrl + Shift + /  快速多行注释 。
	//Ctrl + Shift + \  回车上面的反斜杠 ，取消多行注释 。
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 标示符 。 凡是可以自己取名字的地方 。
		// 类名称 ，包名称 ，方法名称 ，变量名称。
		// 0-9 a-z A-Z _ $ 还可以使用中文 ，但是不推荐 。 要求不能已数字开头，不能包含java关键字或者保留字。
		// 保留字，当前版本还不是java关键字，在以后的版本更新中可能会成为关键字 。
		// goto ...
		// 包 com cn ... igeek ...yang
		// 类 所有单词的首字母都是大写 。
		// 方法跟变量名称类似 ，第一个单词的首字母小写，以后每个单词的首字母大写 。
		// int maxAge = 100;
		// show()
		/*int public2 = 123;
		*/
		
		//  int  ...
		System.out.println(123);
		//  double  ...
		System.out.println(3.14159);
		
		//手动去指定常量 。final 最终的  。被final修饰的变量  我们称为常量。 常量的命名规范。
		final int MAX_AGE = 120;
		
		//MAX_AGE=130;   注意常量不能够被更改值。
		
		int age = 130;//声明变量  (创建变量。)   
		
		//去除编译警告 。@SuppressWarnings  都被称为注解。
		
		int aaa,bbb,ccc;
		aaa=123;
		bbb=123;
		ccc=123;  //不推荐这么写 。
		int aaa2 = 123;//...推荐这种形式。
		
		long l1 = 121231231231231232l;  //必须加上l 或者 L
		
		float f1 = 3.1f;  // 需要加上F 或者f .
		
		int dd = 0;// 变量必须初始化 才能够使用 。 就是随便给变量赋予一个初始值。
		System.out.println(dd);
		
		//变量数据类型      变量 ;   这种写法叫做只声明不赋值 。
		//变量数据类型      变量  = 初始化值 ;  这种写法叫声明并赋值 。
		
	}
	
	
	

}
