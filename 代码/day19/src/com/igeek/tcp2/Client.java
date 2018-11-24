package com.igeek.tcp2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	//需求 客户端 跟服务端  循环发送和接受消息 。使用TCP ，直到客户端输入return 结束，服务端返回bye bye!...
	public static void main(String[] args) throws Exception {
		
		//
		Socket socket = new Socket("192.168.18.2", 998);
		//创建输出对象 。
		OutputStream out = socket.getOutputStream();
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入要发送给服务器的数据:");
			String str = sc.nextLine();
			if(!str.equals("return")){
				out.write(str.getBytes());
				continue;
			}
			socket.shutdownOutput();//告诉服务器 不再发送数据了。
			//out.close(); 不要这样去关闭  ， 这样的话  客户端无法接受到服务器的返回数据。
			break;
		}
		
		//创建InputStream 对象，  用来接受服务器返回的数据。
		InputStream in = socket.getInputStream();
		int read = 0;
		while((read=in.read())!=-1){
			System.out.print((char)read);
		}
		
		//Connection Reset ...
		socket.close();
	}

}
