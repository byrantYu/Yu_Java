package Test;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		//list.add("dadfadf");
		//list.add("dddaaa");
		list.add("你好啊");
		list.add("我来啦");
		list.add("别跑啊");
		//遍历集合，拿到每一个字符串
		for(int i = 0; i < list.size(); i++) {
			//拿到每一个字符串
			String str = list.get(i);
			//判断字符串长度是否大于5
			if(str.length() > 5) {
				//如果大于5，就删除
				list.remove(i);
				i--;
			}
		}
		
		//3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
		for (int i = 0; i < list.size(); i++) {
			//判断这个字符串  是否包含0-9之间的数 。   abv123 
			char [] chars = list.get(i).toCharArray();//
			//boolean类型的变量 来标注是否删除。
			boolean flag = false;
			for (int j = 0; j < chars.length; j++) { 
				if(chars[j]>=0&&chars[j]<=9){
					//证明包含数字 。
					flag = true;//表示是要删除的数组。
					break;
				}
			}
			if(flag){
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
	}

}
