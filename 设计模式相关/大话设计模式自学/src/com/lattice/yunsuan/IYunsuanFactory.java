package com.lattice.yunsuan;
/**
 * ���㹤����
 * @use �Ӽ��˳��ӿڣ����Ӽ��˳�����ʵ��
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