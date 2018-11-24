package com.igeek.hello;

//命名规范  包名称 ，所有单词小写  。多个包之间使用.来分割。 包名其实就是文件夹 。
//类的命名规范   所有单词的首字母 都是大写 。
//被java赋予了特殊意义单词,所有单词都是小写 。  严格区分大小写。  
public class GuanJianZi {
	/**
	 * 
	 * java 数据类型 。
	 * 		两大类    一：基本数据类型 。
	 * 					(4类8种)
	 * 					1.整数型:   
	 * 							byte   1    -128~127   (-2^7  2^7-1)
	 * 							short  2    -32768~32767 (-2^15 2^15-1)
	 * 							int    4    ....          (-2^31 2^31-1)
	 * 							long   8    ....          (-2^63 2^63-1)    L或者l
	 * 							注意：java中整数默认的数据类型是int;
	 * 				    2.浮点型:
	 * 							float  4    F或者f
	 * 							double 8
	 * 							注意：java中小数默认的数据类型是double;
	 * 					3.字符型:
	 * 							char  1|2     ('') 
	 * 					4.布尔类型：
	 * 							boolean     true  false;
	 * 			      二:引用数据类型。
	 * 					在java中只要不是基本数据类型，就是引用数据类型。
	 * 					class 
	 * 					String 
	 * 					[]
	 * 					interface
	 * 					...
	 * 					
	 */		
	public static void main(String[] args) {
		
		//System.out.println("哈哈哈");
		System.out.println(12);
		System.out.println('中');
		
		//常量。
		
		//变量 。
		// 定义变量的格式    数据类型    变量名称  =  具体的值;
		byte b1 = 120;//声明一个变量 b1 并且赋值 。  (声明   创建的意思 。)
		//byte b2 = "哈哈";
		
		//注意：错误写法  变量名称不允许重复。
		//对变量的重新赋值。
		b1 = 'A';//char    注意：关于所有的字符，都有其对应的数字 。  = 赋值的时候  实际是将字符所对应的数字赋值给变量。
		//unicode (万国码)编码 ，ascii对他的延伸。  支持中文编码 。  GBK,GB2312,UTF-8
		
		{
			byte b2 = 12;
		}
		
		//System.out.println(b2);
	}

}
