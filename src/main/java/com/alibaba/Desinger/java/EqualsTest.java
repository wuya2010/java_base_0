package com.alibaba.Desinger.java;

/*
 	Object中的equals方法：
 	
 	一 Object中的equals方法的实现：
 	
 		 public boolean equals(Object obj) {
        	return (this == obj);
    	 }
    	 
           二 像Java核心类库中提供的，String，Integer,Date等类都重写了equlas方法用来比较内容
           
           三 如果我们需要自定义类，往往我们都会在这些自定义类中重写equals方法，用来进行对象内容的比较。
           	如果不重写equals方法那么默认调用的是Object中的equals方法。比较的是地址值。
           	
          注意 ：如果我们调用对象中的equals方法都是想比较内容的。
    
    [面试题] == 和 equals的区别是什么？
    	== ：如果是基本数据类型那么比较的是具体的数值。
    		 如果是引用数据类型那么比较的是地址值（两个引用是否指向同一块内存）
        equals : 如果重写了equals那么比较的是内容，如果没有重写equals比较的是地址值。
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		Person person = new Person("小刚",18);
		boolean equals = person.equals("aaaa");
		System.out.println(equals);
		System.out.println("--------------------- == ---------------------");
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = p1;
		System.out.println(p1 == p3);//true
		System.out.println(p1 == p2);//false
		
		System.out.println("-----------------------------------------------");
		
		String str = new String("aaa");
		String str2 = new String("aaa");
		System.out.println(str.equals(str2));//true
		
		Integer integer = new Integer(111);
		Integer integer2 = new Integer(111);
		System.out.println(integer.equals(integer2));
		
		System.out.println("---------------------------------------");
		
		Person per1 = new Person("aa", 18);
		Person per2 = new Person("aa", 18);
		System.out.println(per1.equals(per2));
		
		System.out.println("------------------------------------------");
		
		double num = 1.0;
		int num2 = 1;
		System.out.println(num == num2);//true
	}
}















