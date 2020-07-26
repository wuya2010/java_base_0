package com.alibaba.threadApi.java6;

/*
 	运行时类的对象 ： （反射的时候再说）
 */
public class MyClassTest {

	public static void main(String[] args) {
		
		//获取Person类的运行时类的对象（Person类信息 -  Class的对象）
		Class clazz = Person.class;
		Class clazz2 = Person.class;
		Class clazz3 = Person.class;
		Class clazz4 = Person.class;
		
		System.out.println(clazz == clazz2 && clazz3 == clazz4 && clazz == clazz4);
		
		
		Person p = new Person();
		Class clazz5  = p.getClass(); //获取的Person类的类信息 - Class的对象
		
		System.out.println(clazz4 == clazz5);
		
	}
}


class Person{
	
}
