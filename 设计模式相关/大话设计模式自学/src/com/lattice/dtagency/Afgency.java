package com.lattice.dtagency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Afgency {
	public static void doWork(Person person){
		person.doSomeThing();
		System.out.println("******************");
		person.doSomeThingElse("---------------------");
	}
	public static void main(String [] args){
		//doWork(new Lucy(new Peter()));
		
		Person person=(Person)Proxy.newProxyInstance(Person.class.getClassLoader()
				, new Class[]{Person.class}, new Maria(new Peter()));
		doWork(person);
	}
}

interface Person{
	void doSomeThing();
	void doSomeThingElse(String arg);
}

class Peter implements Person{

	@Override
	public void doSomeThing() {
		System.out.println("Peter likes fishing!");
		
	}

	@Override
	public void doSomeThingElse(String arg) {
		System.out.println("Peter else likes swimming!"+arg);
		
	}
	
}

class Merry implements Person{

	@Override
	public void doSomeThing() {
		System.out.println("Merry likes dancing!");
		
	}

	@Override
	public void doSomeThingElse(String arg) {
		System.out.println("Merry else likes watching movies!"+arg);
		
	}
}
class Lucy implements Person{
	private Person person;
	public Lucy(Person person){
		this.person=person;
	}
	public void getPerson(Person person){
		this.person=person;
	}
	@Override
	public void doSomeThing() {
		this.person.doSomeThing();
		
	}
	@Override
	public void doSomeThingElse(String arg) {
		this.person.doSomeThingElse(arg);
		
	}
	
}

/*
 * ��̬������
 */
class Maria implements InvocationHandler{
	private Object person;
	public Maria(Object person){
		this.person=person;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("\n_____person\t:"+person.getClass()+
				"\nmethod:"+method+"\targs"+args);
		if(args!=null){
			for(Object arg:args){
				System.out.println("+++++++"+arg);
			}
		}
		return method.invoke(person, args);
	}

	
}














