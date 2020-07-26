package com.alibaba.mapTest.java;

import java.util.ArrayList;

import org.junit.Test;

/**
 
 
 	List接口的实现类
 	
 	|----List : 存储的元素是有序的且可重复的
 		|----ArrayList:
 		|----LinkedList:
 		|----Vector :
 		
 	一 [面试题]ArrayList,LinkedList,Vector的区别是什么？
 		1.相同点 ：都实现了List接口，存储的元素都是有序的且可重复的。
 		2.不同点 ：
 			 ArrayList: ArrayList是List的主要实现类，底层是一个数组，查找快，增删慢，是线程不安全的。
 			 LinkedList: 底层是一个链表（双向链表），增删快，查找慢。
 			 Vector:古老的实现类（一般都不使用了），底层是一个数组，是线程安全的。
 	
 	 二 ArrayList的构造器 
 		底层创建了一个长度为10的数组
		new ArrayList();
		底层创建了一个长度为30的数组
		new ArrayList<>(30);
		将传入的实参变成数组，然后赋值给当前集合底层的使用的数组（了解就行）。
		new ArrayList(list);
		
           三 ArrayList底层实现原理（扩容）？
       	当我们通过空参的构造器创建对象时，底层会创建一个长度为10的数组。当我们向该集合中添加第11个元素时，底层会进行扩容。
       	扩容为原来的1.5倍。同时将原数组中的内容copy到新的数组中。
           
 */
public class ListTest {
	
	@Test
	public void test2(){
		ArrayList list = new ArrayList();
		System.out.println(list.size());//元素的个数
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		System.out.println(list);
		
	}

	@Test
	public void test(){
		//底层创建了一个长度为10的数组
		new ArrayList();
		//底层创建了一个长度为30的数组
		new ArrayList<>(30);
		
		ArrayList list = new ArrayList();
		list.add(111);
	//	System.out.println(list);
		//将传入的实参变成数组，然后赋值给当前集合底层的使用的数组（了解就行）。
		ArrayList list2 = new ArrayList(list);
		System.out.println(list2);
	}
}


















