package com.lattice.yunsuan;

/**
 * @use 加减乘除类的具体实现
 * @author lattice
 *
 */
public class Operation {
	double numberA;
	double numberB;
	public double getResult(){
		return this.numberA+this.numberB;
	}
}
class OprationAdd extends Operation{
	public double getResult(){
		return this.numberA+this.numberB;
	}
}

class OprationSub extends Operation{
	public double getResult(){
		return this.numberA-this.numberB;
	}
}

class OprationMul extends Operation{
	public double getResult(){
		return this.numberA*this.numberB;
	}
}

class OprationDiv extends Operation{
	public double getResult(){
		return this.numberA/this.numberB;
	}
}

