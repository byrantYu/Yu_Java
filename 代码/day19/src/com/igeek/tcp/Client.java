package com.igeek.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端。
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//客户端  服务端 。  
		
		//TCP协议  。  UDP协议需要创建DatagramSocket 对象 。
		//TCP 协议直接使用 Scket 对象。
		Socket s = new Socket("192.168.18.2", 5555);
		//ConnectException 连接异常。
		//利用IO 来发送数据 。
		//使用IO流是字节流对象 。
		OutputStream outputStream = s.getOutputStream();
		outputStream.write(97);//Unicode 编码 。  //等待 。。。
		//创建输入流对象  用来接受服务端输出流对象所输出的数据。
		InputStream clientStream = s.getInputStream();
		int read = clientStream.read();
		System.out.println(read);
		System.out.println((char)read);
		s.close();
	}

}
