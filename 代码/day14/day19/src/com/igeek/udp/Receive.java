package com.igeek.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//接受方。
		//需要接受传递过来的数据 。  指定开放哪一个端口号 用来接受数据。
		DatagramSocket ds = new DatagramSocket(12345);  //Port... 端口冲突。
		//创建空的数组  用来存储接受到的数据 。
		byte [] b = new byte [1024];
		//创建数据包对象 ，用来将接受到的数据 打包 。
		DatagramPacket dp = new DatagramPacket(b, b.length);
		//dp 对象用来接受  发送方 发送过来的数据包对象 。
		ds.receive(dp);
		//可以拿到发送方的IP(InetAddress)对象 。
		InetAddress address = dp.getAddress();
		//获得发送方的信息 ，发送方的IP，跟主机名 都能拿到。
		String hostName = address.getHostName();
		String hostAddress = address.getHostAddress();
		
		//真实发送过来的数据  都在dp对象中进行封装。
		byte[] data = dp.getData();//接受到发送过来的二进制数据。
		int length = dp.getLength();
		
		//作用 将字节数组  转换成字符串 。
		String str = new String(data, 0, length);
		System.out.println("接受到的数据是:"+str+"发送方的IP是:"+hostAddress+"主机名称是:"+hostName);
	}

}
