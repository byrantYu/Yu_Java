package com.igeek.guanlian;

//java 语言中  类，    关联(组合) ，继承
public class Test {

	public static void main(String[] args) {
		Pet yingWu = new Pet("汤姆","五彩缤纷","鸟类");
		
		Person jack = new Person("杰克",20,yingWu);
		
		jack.getPet();//类的关联关系 。 在A类中的成员变量，是B类的一个对象。
	}

}
