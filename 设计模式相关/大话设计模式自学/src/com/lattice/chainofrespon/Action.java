package com.lattice.chainofrespon;
/**
 * Ö°ÔðÁ´Ä£²âÊÔ
 * @author lattice
 *
 */
public class Action {
	public static void main(String[] args) {
		Handler h1=new ConcreteHandler1();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		
		h1.setSuccoessor(h2);
		h2.setSuccoessor(h3);
		
		int [] requests={1,4,7,11,15,22,28,29};
		for(int sb:requests){
			h1.handleRequest(sb);
		}

	}

}
