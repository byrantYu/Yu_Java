package com.igeek.tcp3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Socket socket = new Socket("192.168.18.2", 28888);
		
		//创建输出流对象 。 向服务器写入数据 。
		OutputStream outputStream = socket.getOutputStream();
		
		//传什么文件进来 。
		FileInputStream fis = new FileInputStream("ASCII码表完整版.doc");
		
		//读取数据。
		int read = 0;
		while((read=fis.read())!=-1){
			outputStream.write(read);
		}
		
		socket.shutdownOutput();//不再传送数据。
		
		//可以接受服务器的返回值。
		InputStream in = socket.getInputStream();
		byte [] b = new byte[1024];
		int len = 0;
		while((len=in.read(b))!=-1){
			String returnValue = new String(b, 0, len);
			System.out.println(returnValue);
		}
		
		socket.close();
	}

}
