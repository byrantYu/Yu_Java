package com.igeek.liucheng;

public class ForDemo1 {

	public static void main(String[] args) {
		
		//ѭ���ṹ �� �������ض��������£�ȥ����ִ��ĳ�δ��롣
		//i=i+5;
		/*for(int i=0;i<10;i+=5){
			
			System.out.println("����");
			if(i==5){
				break;//ǿ��������ǰѭ����
				//System.out.println("������");
			}
			System.out.println("ABC");
		}*/
		// 1 2 3 4 2 3 4 2 3 4 ...ֱ��2������������ѭ��Ҫ�����ˡ�
		
		//����1��100���������ĺ͡�  ���������ĺ� ������ż���ĺ͡�
		
		//����һ������  �������ܽ����
		int even = 0; //ż�� 
		int odd = 0; //����
		for(int i=1;i<101;i++){
			//sum+=i;//�ȼ��� sum = sum + i ;
			if(i%2==0){
				even+=i;
			}else{
				odd+=i;
			}
		}
		System.out.println("���е�������:"+odd+"���е�ż����:"+even);
		//System.out.println(i); ����ʹ�á�
	}

}
