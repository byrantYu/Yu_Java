package com.igeek.checkqq;

import java.util.Random;

public class Task05 {
	/*������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
	2.����main��������������ɣ�
		(1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
		(2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ*/

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
