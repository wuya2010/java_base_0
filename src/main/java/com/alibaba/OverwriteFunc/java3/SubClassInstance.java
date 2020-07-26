package com.alibaba.OverwriteFunc.java3;

/*
 	子类对象的实例化过程（了解）：
 	
 	结果上 ： 子类继承父类以后，子类就可以获取父类中的属性和方法
 	
 	过程上 ： 当创建子类的对象时，子类的构造器会调用父类的构造器，会调用父类的父类的构造器 ....Object的构造器。
 			当调用到父类的构造器时，JVM便会将这些类的信息加载到内存中。那么子类便可以调用父类中的属性和方法了。
 			
 	总结 ：自始之终我们只认为创建了子类一个对象。
 	
 */
public class SubClassInstance {

	public static void main(String[] args) {
		
		new C("ccc");
	}
}

class A {
	public A() {
		System.out.println("我是A类");
	}
}

class B extends A {
	public B() {
		System.out.println("我是B类的无参构造");
		C c = new C("hello");
	}

	public B(String name) {
		//会调用父类的空参构造器
		System.out.println(name + "我是B类的有参构造");
	}
}

class C extends B {
	public C() {
		this("hello");
		System.out.println("我是c类的无参构造");
	}

	public C(String name) {
		super(name);
		System.out.println("我是c类的有参参构造");
	}
}
