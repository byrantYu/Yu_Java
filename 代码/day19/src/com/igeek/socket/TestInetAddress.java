package com.igeek.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//InetAddress�� ��ʾIP
		//InetAddress localHost = InetAddress.getLocalHost();
		//ֱ�Ӵ�ӡ���� �� �������ǰ��Ҫ��ȡ�������� ����  �Լ� IP��ַ��
		//System.out.println(localHost);
		//PC-20120726COGB
		//String hostName = localHost.getHostName();
		//String hostAddress = localHost.getHostAddress();
		
		//DNS   Hosts...   //http://www.baidu.com   
		
		
		//��ȡ����������IP���� ��
		InetAddress inetAddress = InetAddress.getByName("STUDENT018");
		System.out.println(inetAddress);
		
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress2);
	}

}
