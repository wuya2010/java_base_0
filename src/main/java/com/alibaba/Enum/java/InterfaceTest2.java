package com.alibaba.Enum.java;

interface AA{
	void aa();
}

interface BB extends AA{
	void bb();
}

class MyTest implements BB{

	@Override
	public void aa() {
		System.out.println("myTest aa");
	}

	@Override
	public void bb() {
		System.out.println("myTest bb");
	}
	
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		
//		BB bb = new MyTest();
		
		//编译看左边，运行看右边
		AA aa = new MyTest();
		aa.aa();
		
		BB bb2 = (BB) aa;
		bb2.bb();
		
		
		
		System.out.println("--------------------类和类之间的多态------------------------------");
		
		Creature c = new Man();
		Person2 p = (Person2) c;
		p.say(); //对象是谁调用的就是谁的
		
	}
}

class Creature{
	public void say(){
		System.out.println("creature");
	}
}

class Person2 extends Creature{
	public void say(){
		System.out.println("Person2");
	}
}


class Man extends Person2{
	public void say(){
		System.out.println("Man");
	}
}

