package com.igeek.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ��ˡ�
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//�ͻ���  ����� ��  
		
		//TCPЭ��  ��  UDPЭ����Ҫ����DatagramSocket ���� ��
		//TCP Э��ֱ��ʹ�� Scket ����
		Socket s = new Socket("192.168.18.2", 5555);
		//ConnectException �����쳣��
		//����IO ���������� ��
		//ʹ��IO�����ֽ������� ��
		OutputStream outputStream = s.getOutputStream();
		outputStream.write(97);//Unicode ���� ��  //�ȴ� ������
		//��������������  �������ܷ�����������������������ݡ�
		InputStream clientStream = s.getInputStream();
		int read = clientStream.read();
		System.out.println(read);
		System.out.println((char)read);
		s.close();
	}

}
