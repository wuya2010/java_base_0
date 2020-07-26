package com.alibaba.classOther.java;

/*
 	类的成员之：代码块
 	
 	作用：对Java类或对象进行初始化

	格式 ：{}
	
	注意 ： 代码块只能被static修饰
	
	代码块 ：静态代码块  vs 非静态代码块
	
	说明：
		静态代码块：
			1.静态代码块是随着类的加载而加载(执行)的。只执行一次。类的加载优先于对象的创建
			2.可以有多个静态代码块，执行的顺序是从上向下依次执行
			3.静态代码块中不能调用实例变量，不能调用非静态方法。
			4.静态代码块用来对类进行实初始化
		
		非静态代码块 ：
			1.随着对象的创建而加载（执行）的。非静态代码块的执行优先于构造器。
			2.可以有多个非静态代码块，执行的顺序是从上向下依次执行
			3.非静态代码块中可以调用类变量和静态方法
			4.非静态代码块用来对对象进行实初始化
			
	
	使用场景（静态代码块） ： 需要在某个类进行类加载时就执行的代码且只能执行一次。那么就可以放在静态代码块中。
	构造器 ：每个对象创建的时候只执行一次。
	
 */
public class BlockTest {

	public static void main(String[] args) {
		
		System.out.println(Animal.age);
		new Animal();
		new Animal();
		
	
	}
}

class Animal{
	
	static int age = 20;
	String name;
	
	/**
	 * 非静态代码块中可以调用类变量和静态方法
	 */
	{
		//非静态代码块
		System.out.println("非静态代码块" + age);
		name = "aaa";
	}
//	{
//		//非静态代码块
//		System.out.println("非静态代码块1");
//	}
//	{
//		//非静态代码块
//		System.out.println("非静态代码块2");
//	}
	
	
	/**
	 * 1.静态代码块中不能调用实例变量，不能调用非静态方法。
	 * 2.静态代码块中只能调用类变量和静态方法。
	 */
	static{
		//静态代码块
		System.out.println("静态代码块" + age + " ");
//		show();不能调用非静态方法
		age = 30;
	}
//	static{
//		//静态代码块
//		System.out.println("静态代码块1");
//	}
//	static{
//		//静态代码块
//		System.out.println("静态代码块2");
//	}
	
	
	//代码块的执行优先于构造器
	public Animal(){
		System.out.println("构造器");
	}
	
	public void show(){
		System.out.println("show");
	}
}



















