package com.lattice.memento;

/**
 * @use 测试备忘录模式
 * @author lattice
 * @date 2017-01-03
 */
public class MememtoTest {

	public static void main(String[] args) {
		Originator origin=new Originator();
		origin.setState("on");
		origin.showState();
		
		CareTaker care=new CareTaker();
		care.setMem(origin.createMemento());
		
		origin.setState("off");
		origin.showState();
		
		origin.setMemento(care.getMem());
		origin.showState();
		/**
		 * 运行结果：current state:	on
		 */
	}

}
class Originator{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Memento createMemento(){
		return new Memento(this.state);
	}
	public void setMemento(Memento mem){
		this.state=mem.getState();
	}
	public void showState(){
		System.out.println("current state:\t"+this.state);
	}
}
/**
 * 状态保存类
 * @author lattice
 *
 */
class Memento{
	private String state;
	public Memento(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
/**
 * 捕获状态类
 * @author lattice
 *
 */
class CareTaker{
	private Memento mem;

	public Memento getMem() {
		return mem;
	}

	public void setMem(Memento mem) {
		this.mem = mem;
	}
	
}


