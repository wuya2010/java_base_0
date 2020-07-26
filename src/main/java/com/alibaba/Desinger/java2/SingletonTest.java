package com.alibaba.Desinger.java2;
/*
 	设计模式 ： 设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式
 	
 	单例设计模式 ：
 	
 	1.作用 ： 在整个项目中某一个类只能创建一个对象。
 	
 	2.单例设计模式的实现 ：懒汉式 vs 饿汉式
 	
 	3.懒汉式 和饿汉式的区别？
 		饿汉式 ： 线程安全的
 		懒汉式 ： 线程不安全的，延迟了对象的加载时机一定程序上节约了内存
 */
public class SingletonTest {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 100; i++) {
			new Thread(){
				public void run() {
					System.out.println(Bank2.getInstance());
				}
			}.start();
		}
	}
}

/**
 * 懒汉式
 */
class Bank2{
	//1.私有化构造器
	private Bank2(){}
	//2.声明一个该类的实例
	private static Bank2 bank2 = null;
	//3.创建一个公共的对象，并返回该类的对象
	public static Bank2 getInstance(){
		//4.创建对象
		if(bank2 == null){
			bank2 = new Bank2();
		}
		return bank2;
	}
	
}
/**
 * 饿汉式
 */
class Bank{
	//1.私有化构造器
	private Bank(){
		
	}
	//2.创建一个该类的对象,并且使用private和static修饰
	private static Bank bank = new Bank();
	
	//3.提供一个公共的方法用来返回该类的实例，该方法使用static修饰（为的是可以通过类名来调用该方法）。
	public static Bank getInstance(){
		return bank;
	}
}

















