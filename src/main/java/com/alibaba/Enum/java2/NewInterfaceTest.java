package com.alibaba.Enum.java2;

/*
 	接口在jdk1.8的新特性：
 	
 	说明：
 		1.在jdk1.8中接口中还可以有静态方法和默认方法
 		2.调用接口中的静态方法 ： 接口名.静态方法名()
 		3.调用接口中的默认方法 : 实现类的对象.默认方法名()
 		4.类优先原则 ：实现类继承的父类和实现的接口中如果有相同的方法，默认调用的是父类中的该方法
 		5.接口冲突 ： 实现类如果实现了多个类，那么多个接口中有相同的默认方法，那么该实现类必须重写该默认方法
 			5.1.如何调用接口中被重写的方法 ： 接口名.super.方法名()
 */
public class NewInterfaceTest extends SuperClass implements MyNewInterface {

	public static void main(String[] args) {
		//调用接口中的静态方法
		MyNewInterface.test();
		//调用接口中的默认方法
		//类优先原则 ：实现类继承的父类和实现的接口中如果有相同的方法，默认调用的是父类中的该方法
		NewInterfaceTest test = new NewInterfaceTest();
		test.show();
	}
}

class SuperClass{
	//类优先原则 ：实现类继承的父类和实现的接口中如果有相同的方法，默认调用的是父类中的该方法
	public void show(){
		System.out.println("superclass show");
	}
}
