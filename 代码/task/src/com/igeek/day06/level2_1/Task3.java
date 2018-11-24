package com.igeek.day06.level2_1;

public class Task3 {

	public static void main(String[] args) {
		/**
		 * �����������󣬲��ô���ʵ��
			1.����¼��6��int���͵����ݴ�������arr��
			2.��arr�����е����ݷ�ת
			3.����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
			4.����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
			5.��ӡ���յ�����(ʵ����1-4��֮�������)
			6.�磺�û������6��int����Ϊ[1,2,3,4,5,6],�������Ľ��Ϊ[6, 5, 4, 1, 2, 3]
		 */
		int [] arr = {2,5,22,1,3,8};
		
		reverse(arr);
		
		reverse2(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		reverse3(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}
	public static void print(int [] arr){
		System.out.print("[");//[1,2,3,4]
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	public static void reverse(int [] arr){
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		//return arr;
	}
	
	public static void reverse2(int [] arr){
		//���������ж��ٸ���Ҫ�����������±���ൽlength -2       
		/**
		 *  11   12   13   14   15   16
		 *                      l-2  l-1
		 */
		for (int i = 0; i < arr.length - 2; i++) {
			if(i%2!=0){
				int temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;
			}
		}
	}
	//{2,5,22,1,3,8}
	public static void reverse3(int [] arr){
		int left = 0;//���Ҫ�����ĵ�һ���±� 
		int right = 0;//�ұ�Ҫ�����ĵ�һ���±�
		boolean lf = false;//�Ƿ�����ߵ�һ��Ҫ������Ԫ��
		boolean rf = false;//�Ƿ����ұߵ�һ��Ҫ������Ԫ��
		for(int i = 0,j=arr.length-1;i<j;i++,j--){
			if(arr[i]%2!=0){
				left=i;// left = 1
				lf = true; // true 
			}
			if(arr[j]%2!=0){ 
				right=j;// right = 4
				rf = true;// true  �ҵ��ұߵĵ�һ�������ˡ�
			}
			if(lf&&rf){//����ͬʱ  ��ߵ����� ���ұߵ�����  ͬʱ���ҵ� ��
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				break;
			}
		}
	}
}
