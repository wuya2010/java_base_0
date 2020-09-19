package com.alibaba.Jvm;

public class Car {
	
	// Object o1 在方法区 ，执行了堆里面一个Object()
	// 堆中有个Object() 被 Car.o1所引用
	private static Object o1=new Object();
	
	// 实例变量
	private Object o2=new Object();
	
	
	// 将没有引用的对象称为不可达对象，不可达对象会被垃圾收集器收集
	public void show() {
		
		// 局部变量（本地变量）
		Object o3=new Object();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Car 被回收了！");
	}

}
