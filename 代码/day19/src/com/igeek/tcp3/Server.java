package com.igeek.tcp3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���������ܿͻ��˷��͹������ļ� �����洢��
		ServerSocket ss = new ServerSocket(28888);
		//�������� ��Ȼ��洢���� ��
		Socket socket = ss.accept();
		InputStream inputStream = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream("ASCII���������(Copy).doc");
		int read = 0;
		while((read=inputStream.read())!=-1){
			fos.write(read);
		}
		
		//�������� ������ �Ƿ�ɹ���
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("�ϴ��ɹ�!".getBytes());
		
		ss.close();
	}

}
