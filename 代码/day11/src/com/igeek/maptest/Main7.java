package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main7 {

	public static void main(String[] args) {
		
		/*1. 组装54张扑克牌
		2. 将54张牌顺序打乱
		3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
		4. 查看三人各自手中的牌（按照牌的大小排序）、底牌
		手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
	
		10♥   8♦
	     10		   8
	♣♦♠♥ 大☺小☺
*/
		//用来控制映射关系 。。。
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//poker用来存所有的key  .  0 - 53
		ArrayList<Integer> poker= new ArrayList<Integer>();
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("♦");
		color.add("♣");
		color.add("♥");
		color.add("♠");
		
		ArrayList<String> number = new ArrayList<String>();
		
		for (int i = 3; i < 11; i++) {
			number.add(i+"");
		}
		
		Collections.addAll(number, "J","Q","K","A","2");
		
		//0 - 53   3   12 13  10  50 10.
		
		//0-3♦  1-3♣  .....
		int i = 0;
		for (String string : number) {
			for (String col : color) {
				poker.add(i);
				map.put(i, string+col);
				i++;
			}
		}
		//  52 53
		map.put(52,"小王");
		map.put(53,"大王");
		poker.add(52);
		poker.add(53);
		
		//Collections.shuffle(poker);
		
		//添加玩家 。
		ArrayList<Integer> player1 =new ArrayList<Integer>();
		ArrayList<Integer> player2 =new ArrayList<Integer>();
		ArrayList<Integer> player3 =new ArrayList<Integer>();
		ArrayList<Integer> diPai =new ArrayList<Integer>();
		
		//在发牌之前先洗下标 。
		Collections.shuffle(poker);
		
		//设计一种映射关系 ，根据相应的数字，有对应的牌。Map  ...  
		// 51 52 53  给底牌
		for (int j = 0; j < poker.size()-3; j++) {
			//
			Integer it = poker.get(j);
			//0   1  2 
			if(j%3==1){
				player1.add(it);
			}else if(j%3==2){
				player2.add(it);
			}else{
				player3.add(it);
			}
		}
		
		
		
		for (int j = poker.size()-3; j < poker.size(); j++) {
			diPai.add(poker.get(j));
		}
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(diPai);
		Collections.reverse(player1);
		Collections.reverse(player2);
		Collections.reverse(player3);
		Collections.reverse(diPai);
		
		System.out.println("=============");
		for (Integer sb : player1) {
			System.out.print(map.get(sb)+"   ");
		}
		System.out.println();
		System.out.println("=============");
		for (Integer sb : player2) {
			System.out.print(map.get(sb)+"   ");
		}
		System.out.println();
		System.out.println("=============");
		for (Integer sb : player3) {
			System.out.print(map.get(sb)+"   ");
		}
		System.out.println();
		System.out.println("=============");
		for (Integer sb : diPai) {
			System.out.print(map.get(sb)+"   ");
		}
		
	}

}
