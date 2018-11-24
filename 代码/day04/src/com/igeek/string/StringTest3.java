package com.igeek.string;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "123";
		
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入账号:");
			String inputUserName = sc.nextLine();//表示用来接受字符串。
			System.out.println("请输入密码:");
			String inputPassword = sc.nextLine();
			if(inputUserName.equals(username)&&inputPassword.equals(password)){
				System.out.println("登陆成功!");
				break;
			}else{
				if(i==2){
					System.out.println("你的账号密码被锁定。");
					
				}else{
					System.out.println("你还有:"+(2-i));
				}
			}
		}
		
	}

}
