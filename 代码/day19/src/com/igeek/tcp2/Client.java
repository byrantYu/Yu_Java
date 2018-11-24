package com.igeek.tcp2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	//���� �ͻ��� �������  ѭ�����ͺͽ�����Ϣ ��ʹ��TCP ��ֱ���ͻ�������return ����������˷���bye bye!...
	public static void main(String[] args) throws Exception {
		
		//
		Socket socket = new Socket("192.168.18.2", 998);
		//����������� ��
		OutputStream out = socket.getOutputStream();
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ҫ���͸�������������:");
			String str = sc.nextLine();
			if(!str.equals("return")){
				out.write(str.getBytes());
				continue;
			}
			socket.shutdownOutput();//���߷����� ���ٷ��������ˡ�
			//out.close(); ��Ҫ����ȥ�ر�  �� �����Ļ�  �ͻ����޷����ܵ��������ķ������ݡ�
			break;
		}
		
		//����InputStream ����  �������ܷ��������ص����ݡ�
		InputStream in = socket.getInputStream();
		int read = 0;
		while((read=in.read())!=-1){
			System.out.print((char)read);
		}
		
		//Connection Reset ...
		socket.close();
	}

}
