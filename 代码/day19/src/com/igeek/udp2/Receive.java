package com.igeek.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(12346); // Port... �˿ڳ�ͻ��
		// �����յ����� �����洢���ܵ������� ��
		while (true) {
			byte[] b = new byte[1024];
			// �������ݰ����� �����������ܵ������� ��� ��
			DatagramPacket dp = new DatagramPacket(b, b.length);
			// dp ������������ ���ͷ� ���͹��������ݰ����� ��
			ds.receive(dp);
			// �����õ����ͷ���IP(InetAddress)���� ��
			InetAddress address = dp.getAddress();
			// ��÷��ͷ�����Ϣ �����ͷ���IP���������� �����õ���
			String hostName = address.getHostName();
			String hostAddress = address.getHostAddress();

			// ��ʵ���͹��������� ����dp�����н��з�װ��
			byte[] data = dp.getData();// ���ܵ����͹����Ķ��������ݡ�
			int length = dp.getLength();

			// ���� ���ֽ����� ת�����ַ��� ��
			String str = new String(data, 0, length);
			System.out.println("���ܵ���������:" + str + "���ͷ���IP��:" + hostAddress
					+ "����������:" + hostName);
		}
	}

}
