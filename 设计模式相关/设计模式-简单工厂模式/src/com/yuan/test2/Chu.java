package com.yuan.test2;

public class Chu extends Operation1{

	@Override
	public  double getResult(int numA,int numB){
		
		if(numB==0){
			return -1;
		}
		return numA/numB;
	}
}
