package com.alibaba.Enum.java2;

/*
 	接口冲突 ： 实现类如果实现了多个类，那么多个接口中有相同的默认方法，那么该实现类必须重写该默认方法
 	如何调用接口中被重写的方法 ： 接口名.super.方法名()
 */
public class NewInterfaceTest2 implements A,B {

	public static void main(String[] args) {
		NewInterfaceTest2 test = new NewInterfaceTest2();
		test.show();
	}

	@Override
	public void show() {
		A.super.show();
		B.super.show();
		System.out.println("show");
	}
}

interface A{
	
	default void show(){
		System.out.println("A show");
	}
}

interface B{
	
	default void show(){
		System.out.println("B show");
	}
}