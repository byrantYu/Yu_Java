package com.igeek.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端.
public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//端口号 应该由服务端来指定。
		//服务端 需要创建一个ServerSocket 对象。
		ServerSocket ss = new ServerSocket(5555);
		//接受客户端发送过来的数据 。 还是要拿到一个Socket对象。
		Socket s  = ss.accept();//调用服务端的接受方法，拿到一个Socket 对象 。
		InputStream inputStream = s.getInputStream();
		int read = inputStream.read();
		System.out.println(read);
		System.out.println((char)read);
		
		//服务端 还可以回写数据 。
		OutputStream serverOutput = s.getOutputStream();
		serverOutput.write(98);
		
		
	}

}
