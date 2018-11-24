package com.lattice.baoshu;

import java.util.ArrayList;
import java.util.List;

public class BaoShu {
 
    public static void main(String[] args) {
        boolean people[] = new boolean[10];
        for(int i = 0; i<10; i++){
            people[i] = true;
        }

        for(int i = 0; i<10; i++){
            if(people[i] == true){
            	System.out.println(i+1);
            }
        }
    }
	
}
class BaoShuUtil{
	private int n=0;
	private int result=0;
	List<Boolean> list=new ArrayList<Boolean>();
	private int begin=0;

	public void setN(int n) {
		this.n = n;
		list.clear();
		for(int i=0;i<n+1;i++){
			list.add(true);
		}
	}
	
	public int getResult(){
		getLast();
		for(int i = 1; i<list.size(); i++){
            if(list.get(i) == true){
            	return i+1;
            }
        }
		return 0;
	}
	private void getLast(){
		int i=1;
		int n=list.size();
		int m=n;
		
	}
	
}
