package com.alibaba.String.java;

import org.junit.Test;

/*
 	String:
 	
 	说明：
 		1.String被final修饰，不能被其它类继承。
 		2.实现了Serializable接口 ： 该类可以被序列化（可以将内存中的数据保存到磁盘上，不同进程间可以实现数据的传输）。
 		3.实现了Comparable接口 ：可以比较内容
 		4.实现了CharSequence接口 ：可以获取字符串长度，可以获取指定的字符等。
 		5.字符串的底层是一个char[]且该数组被final所修饰。
 		6.字符串是一个不可变的字符序列。
 		
 	[面试题] String s = new String("xyz") 在内存中开辟了几块内存（创建了几个对象）？
 	
 	
 	
 */
public class StringTest {
	
	/*
	 * 总结 ： 只要有变量参与连接运算，底层会调用StringBuilder中的toString方法,会new一个字符串。
	 * 			只要有变量参与运算就会在堆中开辟空间。
	 */
	@Test
	public void test5(){
		String s = "hellojava";
		String s2 = "hello";
		String s3 = "java";
		String s4 = "hello" + "java";
		String s5 = s2 + "java";
		String s6 = "hello" + s3;
		String s7 = s2 + s3;
		/*
		 * intern() : 会先去常量池中查找结果，如果存在则直接将常量池中的该对象的结果进行赋值。
		 * 					如果没有则创建新的对象。
		 */
		String s8 = (s2 + s3).intern();
		
		System.out.println(s == s4);//true
		System.out.println(s == s5);//false
		System.out.println(s == s6);//false
		System.out.println(s == s7);//false
		System.out.println(s5 == s6);//false
		
		System.out.println(s == s8);//true
	}
	
	@Test
	public void test4(){
		Person p = new Person("xiaogege", 18);
		Person p2 = new Person("xiaogege", 18);
		System.out.println(p == p2);//false
		System.out.println(p.name == p2.name);//true
	}
	
	/*
	 * 6.字符串是一个不可变的字符序列。
	 * 
	 * 就算String的变量被重新赋值，做连接运算，使用方法替换某个字符都会发生改变
	 * 		（都会创建一个新的字符串原来的字符串不会改变）。
	 */
	@Test
	public void test3(){
		String s = "aaa";
		String s2 = "aaa";
		System.out.println(s == s2);//true
		
//		s2 = "ccc";
//		System.out.println(s == s2);//false
		
//		s2 += "ccc";
//		System.out.println(s == s2);//false
		
		
		s2 = s2.replace('a', 'b');
		System.out.println(s2);
		System.out.println(s == s2);//false
	}
	
	/*
	 * String两种初始化方式的区别
	 * 
	 * 注意 ：“”引起来的字符串都理解成String的实例。
	 */
	@Test
	public void test2(){
		//直接从常量池中引用
		//如果常量池中没有则创建"aaa",如果已经存在则直接引用
		String s = "aaa";
		String s2 = "aaa";
		
		//在堆中开辟一块空间，堆中的该对象再指向常量池中的“bbb”
		String s3 = new String("bbb");
		String s4 = new String("bbb");
		
		System.out.println(s == s2); //true
		System.out.println(s3 == s4);//false
	}

	/*
	 	String初始化方式：
	 */
	@Test
	public void test(){
		//方式一 ：
		String s = "aaa";
		//方式二：
		String s2 = new String("ccc");
		
		System.out.println(s.length());
	}
}
