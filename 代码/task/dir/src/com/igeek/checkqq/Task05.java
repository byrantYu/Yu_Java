package com.igeek.checkqq;

import java.util.Random;

public class Task05 {
	/*功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
	2.定义main方法，方法内完成：
		(1)定义长度为26，元素值为26个大写英文字母的数组chs
		(2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
				'P','Q','R','S','T','W','V','U','X','Y','Z'};
		String str =getStr(chs);
		System.out.println(str);
	}
	public static String getStr(char[] chs){
		Random r = new Random();
		int[] arr = new int[4];
		for(int i=0;i<4;i++){
			arr[i]=r.nextInt(26);
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j])
					i--;
			}
		}
		int num = r.nextInt(10);
		int index = r.nextInt(5);
		boolean flag = true;
		String numstr =String.valueOf(num);
		StringBuilder newstr = new StringBuilder("");
		for(int i=0;i<4;i++){
			if(index==i&&flag){
				newstr.append(numstr);
				flag = false;
				i--;
				continue;
			}
			newstr.append(chs[arr[i]]);
		}
		if(index==4)
			newstr.append(numstr);
		String str = newstr.toString();
		return str;
	}
}
