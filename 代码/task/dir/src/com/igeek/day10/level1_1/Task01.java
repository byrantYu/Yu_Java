package com.igeek.day10.level1_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task01 {

	/**
	 * ��Ŀ�������û��ӿ���̨������Ϣ��������Ϣ�洢���ļ�Info.txt�С�
	 * �������������Ϣ��ÿ����Ϣ�洢һ�С����û����룺��886��ʱ�����������
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);	
		BufferedWriter bw = new BufferedWriter(new FileWriter("Info.txt"));
		System.out.println("����������:");
		while(true){
			String result = sc.nextLine();
			if(result.equals("886")){
				break;
			}
			bw.write(result);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
}
