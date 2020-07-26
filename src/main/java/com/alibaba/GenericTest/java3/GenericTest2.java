package com.alibaba.GenericTest.java3;

/**
 
 	2.自定义泛型类，自定义泛型接口，自定义泛型方法
 */

//自定义泛型类
class Animal<K,T,V>{
	//泛型类型的属性不能使用static修饰
	K k;
	T t;
	V v;
	
	//注意：1.静态方法中不能使用泛型类型。
	public static void show(){
//		System.out.println(k);
	}
}

//自定义泛型类
class Person<T>{
	T  t;
	
	public void setT(T t){
		this.t = t;
	}
	
	public T getT(){
		return t;
	}
}

public class GenericTest2 {
	public static void main(String[] args) {
		Person<String> person = new Person<String>();
		person.setT("aaa");
		String name = person.getT();
		System.out.println(name);
		
		Person<Integer> p = new Person<Integer>();
		p.setT(111);
		Integer number = p.getT();
		System.out.println(number);
		
		System.out.println("----------------------------------------------");
		
	}
}
