package com.igeek.dubo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// 3个玩家   底牌  
		// 2-10 A J Q K   
		// 
		/**
		 *  colors.add("♥");
			colors.add("♠");
			colors.add("♦");
			colors.add("♣");
		 */
		
		//用来存所有的扑克牌
		ArrayList<String> poker=new ArrayList<String>();
		
		ArrayList<String> numbers=new ArrayList<String>();
		
		ArrayList<String> colors=new ArrayList<String>();
		
		for (int i = 2; i <= 10; i++) {
			numbers.add(i+"");
		}
		numbers.add("A");
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		colors.add("♠");
		colors.add("♥");
		colors.add("♣");
		colors.add("♦");
		
		
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < colors.size(); j++) {
				//拼接组合 。 然后放到 poker中。
				poker.add(numbers.get(i)+colors.get(j));
			}
		}
		
		poker.add("大☺");
		poker.add("小☺");
		
		//
		Collections.shuffle(poker);
		//jdk 1.5 迭代器 。
		/*for (String sb : poker) {
			System.out.println(sb);
		}*/
		
		//操作集合的工具类 。Collections  操作集合的工具类 。 
		//操作数组的工具类 。Arrays 
		
		//创建三个玩家 。     3    54  - 1   
		ArrayList<String> player1= new ArrayList<String>();
		ArrayList<String> player2= new ArrayList<String>();
		ArrayList<String> player3= new ArrayList<String>();
		
		ArrayList<String> diPai = new ArrayList<String>();
		for (int i = 0; i < poker.size()-3; i++) {
			if(i%3==0){
				player1.add(poker.get(i));
			}else if(i%3==1){
				player2.add(poker.get(i));
			}else{
				player3.add(poker.get(i));
			}
		}
		
		for (int i = poker.size()-3; i < poker.size(); i++) {
			diPai.add(poker.get(i));
		}
		
		Random r = new Random();
		int diZhu = r.nextInt(3);
		
		switch (diZhu) {
		case 0:
			player1.addAll(diPai);
			break;
		case 1:
			player2.addAll(diPai);
			break;
		case 2:
			player3.addAll(diPai);
			break;
		}
		
		//打印三个人的牌。
		for (int i = 0; i < player1.size(); i++) {
			if(player1.get(i).endsWith("♥")||player1.get(i).endsWith("♦"))
				System.err.print(player1.get(i)+" ");
			else
				System.out.print(player1.get(i)+" ");
		}
		
		for (int i = 0; i < player1.size(); i++) {
			if(player1.get(i).endsWith("♥")||player1.get(i).endsWith("♦"))
				System.err.print(player1.get(i)+" ");
			else
				System.out.print(player1.get(i)+" ");
		}
		
		
	}

}
