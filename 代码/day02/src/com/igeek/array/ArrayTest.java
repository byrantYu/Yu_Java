package com.igeek.array;

public class ArrayTest {
	/**
	 * 
	 * 1.�����������͡�
	 * 
	 * 2.�����������͡� (����)
	 * 	[ ]
	 */
	public static void main(String[] args) {
		//�����������ʽ �� 
		//��ʽ1  �����е���������   []  �������� ��(�Ƽ���ʽ��) 
		//��ʽ2 �����е���������  ��������  [];(���Ƽ���)
		
		//int [] arrays1;
		//arrays1[0]=1;
		//����ĸ�ֵ��ʽ ��1.
		//��������Ķ�̬��ʽ ��
		int [] arrays = new int[5];  //5 ��ʾ����ĳ��ȡ� ������Ԫ�صĸ�����
		/*arrays[0]=10;
		arrays[1]=11;
		arrays[2]=12;
		arrays[3]=13;
		arrays[4]=14;*/
		//arrays[5]=15;  ArrayIndexOutOfBoundsException  ����������±� ������쳣��
		
		//��̬������ʽ ����̬��ʼ����ʽ ��
		String [] strs = {"ABC","DEF","GHI","123"}; 
		
		String [] strs2 = new String[3];
		strs2[0]="123";
		strs2[1]="456";
		strs2[2]="789";
		
		//��ȡ�����еĵ�һ����  ��ͨ��     ��������[�±�ֵ]    ������ָ��Ԫ�ء�
		System.out.println(strs2[2]);
		
		//��λ������ĳ���    ��������.length    ��λ���ַ������� ��    �ַ�������.length();   ��С���ŵľ��Ƿ�����
		System.out.println(strs.length);
		
		
		
		/*int i=0;   ע�⣺����������һ���������ȳ�ʼ������ʹ�á�
		System.out.println(i);*/
		
		for(int i = 0;i < strs.length;i++){
			//print ֻ��ӡ������   println  ��ӡ�����С�
			System.out.print(strs[i]+"\t");
		}
		
		{
			int x = 10;
		}
		
	}

}
