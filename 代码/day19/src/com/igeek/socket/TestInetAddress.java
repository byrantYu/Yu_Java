package com.igeek.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//InetAddress类 表示IP
		//InetAddress localHost = InetAddress.getLocalHost();
		//直接打印对象 ， 会输出当前你要获取的主机的 名称  以及 IP地址。
		//System.out.println(localHost);
		//PC-20120726COGB
		//String hostName = localHost.getHostName();
		//String hostAddress = localHost.getHostAddress();
		
		//DNS   Hosts...   //http://www.baidu.com   
		
		
		//获取其他主机的IP对象 。
		InetAddress inetAddress = InetAddress.getByName("STUDENT018");
		System.out.println(inetAddress);
		
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress2);
	}

}
