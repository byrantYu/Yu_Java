package com.lattice.yunsuan;
/**
 * 运算工厂类
 * @use 加减乘除接口，及加减乘除工厂实现
 * @author lattice
 *
 */
interface IYunsuanFactory {
	Operation createOperation();
}

class AddFactory implements IYunsuanFactory{
	public Operation createOperation(){
		return new OprationAdd();
	}
}
class SubFactory implements IYunsuanFactory{
	public Operation createOperation(){
		return new OprationSub();
	}
}
class MulFactory implements IYunsuanFactory{
	public Operation createOperation(){
		return new OprationMul();
	}
}
class DivFactory implements IYunsuanFactory{
	public Operation createOperation(){
		return new OprationDiv();
	}
}