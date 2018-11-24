package com.igeek.supermarket;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//�վ��ࡣ
public class Receipt {
	/**  
	* @Fields data : ��Աλ�ö��弯��,�洢���е���Ʒ����� 
	*/  
	static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
	
	public static void main(String[] args) {
		//Ϊ����׼������
		initData();
		//д��֮�� ������һ��IO�汾�ġ�
		while(true) {
			//ʹ��switch��������ѡ��1���빺������2��ӡСƱ3�˳�
			//��ʾ��Ϣ
			System.out.println("��������Ҫ���еĲ���:1���빺������   2��ӡСƱ   3�˳�");
			
			//ͨ������¼��õ�����
			Scanner sc = new Scanner(System.in);
			int optNumber = sc.nextInt();
			//���switch������case���߼�
			switch (optNumber) {
			case 1:
				//System.out.println("��������������ֵ");
				//�������� ��  
				enterNum();
				break;
			case 2:
				//���ô�ӡ����СƱ�ķ���
				//System.out.println("��ӡ����СƱ");
				printReceipt();
				break;
			case 3:
				System.out.println("��ӭ�´ι���");
				//�˳�����
				System.exit(0);
			default:
				System.out.println("��������ȷ������!");
				break;
			}
		}

	}

	/**  
	* @Title: initData  
	* @Description: ���巽��,���Աλ�õļ��ϸ�ֵ      
	*/
	public static void initData() {
		//���������Ʒ�����                                           ���ƣ�id�����ۣ�{{����}}}���Ƽ۵�λ, {{���}}
		GoodsItem sls = new GoodsItem("�����º���", "090115", 15.5, 0, "��", 0);
		GoodsItem shk = new GoodsItem("�п�����", "090027", 14.5, 0, "��", 0);
		//�������Ʒ�������뼯����
		data.add(sls);
		data.add(shk);
	}

	public static void enterNum(){
		//
		for (int i = 0; i < data.size(); i++) {
			//ȡ��ÿһ����Ʒ���� ��  //  byte b1 = 10.3
			GoodsItem goods =  data.get(i);//��ʱ ��һ��ѭ�� goods�����оͷ�װ������Ϣ  "�����º���", "090115", 15.5, 0, "��", 0
			System.out.println("�������������"+goods.getName()+"������:");
			Scanner sc = new Scanner(System.in);
			int input  = sc.nextInt();
			goods.setNumber(input);
			goods.setMoney(input*goods.getPrice());
			
			//"�����º���", "090115", 15.5, 2, "��", 31.0
		}
	}
	
	/**
	 * ��ӡСƱ
	 */
	public static void printReceipt(){
		System.out.println("    ��ӭ����");
		System.out.println("Ʒ��\t�ۼ�\t����\t��λ\t���");
		System.out.println("-------------------------------------------");
		//
		//����ֲ����� ��
		int totalNumber = 0;//�ܵļ���
		double totalMoney = 0.0;
		for (int i = 0; i < data.size(); i++) {
			GoodsItem goods = data.get(i);
			//ÿ��ѭ��  goods����ʹ�����һ����Ʒ ��
			totalNumber+=goods.getNumber();
			totalMoney+=goods.getMoney();
			System.out.println(goods.getName()+"\t"+goods.getPrice()+"\t"+goods.getNumber()+"\t"+goods.getUnit()+"\t"+goods.getMoney());
		}
		System.out.println("-------------------------------------------");
		System.out.println("\t"+data.size()+"����Ʒ"+"\t"+"����"+totalNumber);
		System.out.println("�ܼ�:"+totalMoney);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH-mm-ss");
		String dateNow = sdf.format(date);
		System.out.println(dateNow);
		//String
	}
	
	protected void test(){
		
	}
	
	private void test1(){
		
	}
}
