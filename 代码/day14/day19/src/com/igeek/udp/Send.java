package com.igeek.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���ͷ���
		
		//DatagramSocket ����   ��Ҫ��java��ͨ��UDPЭ��ȥ�շ����ݡ����봴��DatagramSocket ��Ķ���
		//����ʵ��UDPЭ��Ķ��� ��   0-65535   888888888888
		DatagramSocket ds = new DatagramSocket();
		
		//Ҫ���͵����� ��
		String data = "i love you ! baby!...";
		
		//����ת���ɶ����� ��
		byte [] b = data.getBytes();
		
		InetAddress address = InetAddress.getByName("192.168.18.2");
		
		int port = 12345;
		
		//�������ݰ� �� DatagramPacket ��������ʾ���ݰ� ��  DatagramPacket ������ʾ���ݰ� ��
		// ���� 1. ��Ҫ���ݵ�����  2.���ݵ����ݳ���  3.���ݸ�˭ �����ܷ���IP��InetAddress����  4.ָ���Ǹ��˿ں� ��
		DatagramPacket dp = new DatagramPacket(b, b.length, address, port);
		
		ds.send(dp);
		
		ds.close();
		
		
	}

}
