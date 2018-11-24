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
		//服务器接受客户端发送过来的文件 。并存储。
		ServerSocket ss = new ServerSocket(28888);
		//接受数据 ，然后存储起来 。
		Socket socket = ss.accept();
		InputStream inputStream = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream("ASCII码表完整版(Copy).doc");
		int read = 0;
		while((read=inputStream.read())!=-1){
			fos.write(read);
		}
		
		//返回数据 告诉你 是否成功。
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("上传成功!".getBytes());
		
		ss.close();
	}

}
