package com.igeek.tcp2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws Exception {
		
		//
		ServerSocket ss = new ServerSocket(998);
		Socket socket = ss.accept();
		InputStream in = socket.getInputStream();
		byte [] b = new byte[1024];
		int length = 0;
		while((length=in.read(b))!=-1){
			String data = new String(b, 0, length);
			System.out.println(data);
		}
		
		//
		OutputStream out = socket.getOutputStream();
		String content = "bye!bye!...SB";
		out.write(content.getBytes());
	}

}
