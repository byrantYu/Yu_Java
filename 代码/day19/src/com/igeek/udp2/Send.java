package com.igeek.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//循环发送数据 。
		DatagramSocket ds = new DatagramSocket();
		//循环写数据 。
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入要发送的数据:");
			String dataStr = sc.nextLine();
			byte [] data = dataStr.getBytes();
			int port = 12346;
			InetAddress address = InetAddress.getByName("192.168.18.2");
			DatagramPacket dp = new DatagramPacket(data, data.length, address, port);
			ds.send(dp);
		}
		
	}

}
