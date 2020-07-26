package com.alibaba.classOther.java;

/*
 	关键字：final
 	
 	[面试题] 请简述final关键字？
 	
 	final修饰类：final修饰的类不能被继承。比如 ：String,StringBuffer......
 	
 	final修饰方法：final修饰的方法不能被重写
 	
 	final修饰属性 ：变量一旦被赋值不能被修改(只能赋值一次)，往往作为常量。
 	
 	final修饰的属性可以赋值的方式有 ： 显示赋值，构造器赋值，代码块赋值
 */
public class FinalTest {

	public static void main(String[] args) {
		
		new A();
		new A();
		new A();
	}
}

class A{
	final int age;
	
	//代码块赋值
	{
		System.out.println("代码块");
		age = 20;
	}
	public A(){
//		age = 20;
	}
	
	//必须保证可能给final修饰的属性赋值
	public A(int a){
//		this();
	}
	
	public void show(){
//		age = 20;
	}
}

class B extends A{
	int sex = 1;
	int id;
	public void show(){
		sex = 2;
	}
}














