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
		list.add("��ð�");
		list.add("������");
		list.add("���ܰ�");
		//�������ϣ��õ�ÿһ���ַ���
		for(int i = 0; i < list.size(); i++) {
			//�õ�ÿһ���ַ���
			String str = list.get(i);
			//�ж��ַ��������Ƿ����5
			if(str.length() > 5) {
				//�������5����ɾ��
				list.remove(i);
				i--;
			}
		}
		
		//3.������һ��,ɾ��������Ԫ�ذ���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
		for (int i = 0; i < list.size(); i++) {
			//�ж�����ַ���  �Ƿ����0-9֮����� ��   abv123 
			char [] chars = list.get(i).toCharArray();//
			//boolean���͵ı��� ����ע�Ƿ�ɾ����
			boolean flag = false;
			for (int j = 0; j < chars.length; j++) { 
				if(chars[j]>=0&&chars[j]<=9){
					//֤���������� ��
					flag = true;//��ʾ��Ҫɾ�������顣
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
