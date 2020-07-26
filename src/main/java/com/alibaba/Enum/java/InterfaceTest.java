package com.alibaba.Enum.java;

/*
 	接口（interface）:
 	
 	说明：
 		1.接口和类是并列关系
 		2.格式 ： inteface 接口名{}
 		3.接口不能被实例化，接口中没有构造器
 		4.在jdk1.8之前接口中只能有：常量和抽象方法
 		5.调用接口中的常量 ： 接口名.常量名
 		6.接口和类的关系 : 类 implements 接口1,接口2...... (Java是单继承多实现)
 		7.接口和接口的关系 ：接口 extends 接口1，接口2......(接口和接口是继承关系而且可以多继承)
 		8.我们可以把接口当成一套规则或者规范。在一定程度上解决了单继承的局限性
 		9.接口和类之间的多态性
 */

interface A{
	
}

interface English{
	void test();
}

interface MyInterface extends English,A{
	//常量
	public static final int AGE = 10;
	int score = 100; //默认省略了public static final
	//抽象方法
	public abstract void say(); //权限修饰符只能是public
	void demo(); //默认省略了 public abstract
}

//一个非抽象子类实现接口必须重写接口中的所有(包括父接口)抽象方法
abstract class Person implements MyInterface{

}


public class InterfaceTest {

	public static void main(String[] args) {
		//接口不能被实例化，接口中没有构造器
//		new MyInterface();
		
		//调用接口中的常量
		System.out.println(MyInterface.AGE);
		System.out.println(MyInterface.score);
	}
}






















