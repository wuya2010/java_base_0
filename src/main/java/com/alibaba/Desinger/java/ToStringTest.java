package com.alibaba.Desinger.java;

/*
 	Object中的toString方法：
 	
 	一  Object中的toString方法的实现
 		public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
    	
          二 像Java核心类库中提供的，String，Integer,Date等类都重写了String方法用来输出内容
          
          三 如果我们需要自定义类，往往我们都会在这些自定义类中重写toString方法，用来输出对象的内容。
           	如果不重写toString方法那么默认调用的是Object中的toString方法。输出的是地址值。
 */
public class ToStringTest {

	public static void main(String[] args) {
		
		Person person = new Person("小刚",30);
		//com.atguigu.java.Person@659e0bfd
		System.out.println(person.toString());
		//com.atguigu.java.Person@659e0bfd
		System.out.println(person);//默认调用的就是toString方法
		
		System.out.println("--------------------------------------");
		
		String s = new String("aaa");
		System.out.println(s.toString());
		Integer integer = new Integer(111);
		System.out.println(integer.toString());
	
	}
}
















