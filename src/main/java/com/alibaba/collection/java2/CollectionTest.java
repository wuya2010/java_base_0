package com.alibaba.collection.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/*
 	集合（容器） ： Java中用来存储多个对象的容器 - 数组，集合
 	
 	一  数组的特点和缺点：
 	   	特点：
 	   		1.声明数组时的类型就决定了数组存储的元素的类型。
 	   		2.数组一旦创建成功，长度不可变
 	   		
 	   	缺点：
 	   		1.数组的长度不可变。
 	   		2.数组没有增删改查等实用方法。也缺少一些有的属性（比如：数组内容的个数）。
 	   		3.数组中只能存储有序可重复的数据，对于无序不可重复的数据无能为力
 	   		
 	 二 Collection接口（单例集合）
 	   	|----List : 存储的元素是有序的可重复的
 	   	|----Set : 存储的元素是无序的不可重复的
 	   		
 	 
 	 三 Collection的API
 	   		
 */
public class CollectionTest {
	
	/**
	 	toArray() ：返回包含此Collection中所有元素的数组
	 */
	@Test
	public void test7(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		
		Object[] array = c.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 	removeAll(Collection c) : 将当前集合和c集合中相同的元素（交集的部分）从当前集合中删除
	 	
	 	retainAll(Collection c) : 将当前集合和c集合中相同的元素进行保留其它元素从当前集合中删除
	 */
	@Test
	public void test6(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("bbb");
		c2.add(111);
		c2.add(222);
		
		
		//removeAll(Collection c) : 将当前集合和c集合中相同的元素（交集的部分）从当前集合中删除
//		c.removeAll(c2);
		
		//retainAll(Collection c) : 将当前集合和c集合中相同的元素进行保留其它元素从当前集合中删除
		c.retainAll(c2);
		
		System.out.println("c2=" + c2);
		
		System.out.println(c);
		
		
	}
	
	/**
	 	remove(Object obj) : 从当前集合中删除obj这个元素。
	 		注意：如果有多个相同的元素，那么只删掉第一个。
	 */
	@Test
	public void test5(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("aaa");
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		c.add(new Person("aa",18));
		
		System.out.println("删除前" + c);
		c.remove("aaa");
//		c.remove(new Person("aa",18));
		System.out.println("删除后" + c);
	}
	
	/**
	 	equals(Object obj) : 比较当前对象和obj中所有的元素（个数，顺序，内容）都相同结果才为true
	 	
	 	hashCode(): 可以理解成对象的地址值（同一个对象无论调用多少次hashCode值都是相同的）
	 		不同的对象的hashCode值是不同的。
	 */
	@Test
	public void test4(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		
		Collection c2 = new ArrayList();
		
		c2.add("ccc");
		c2.add("ddd");
		c2.add("aaa");
		c2.add("bbb");
		
		/*
		 * hashCode() : 可以理解成对象的地址值（同一个对象无论调用多少次hashCode值都是相同的）
	 		不同的对象的hashCode值是不同的。
		 */
		System.out.println(c.hashCode());
		
		System.out.println(c2.hashCode());
		
		/*
		 * equals(Object obj) : 比较当前对象和obj中所有的元素（个数，顺序，内容）都相同结果才为true
		 */
		System.out.println(c.equals(c2));
	}
	
	/**
	 containsAll(Collection c) : 当前集合中是否包含c集合中所有的元素。（底层其实调用的是equals方法）
	 */
	@Test
	public void test3(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
		
		
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("bbb");
		c2.add("ddd");
		//当前集合中是否包含c集合中所有的元素。（底层其实调用的是equals方法）
		boolean containsAll = c.containsAll(c2);
		System.out.println(containsAll);
		
	}
	
	/**
	 	contains(Object obj) : 当前集合是否包含obj - 通过调用obj所在的类的equals和集合中的元素进行比较
	 				如果所有的元素返回结果为false则不包含。
	 				只要有一个返回结果为true则包含。
	 	注意 ： 我们向Collection集合中添加自定义类的对象。那么该对象所在的类必须重写equals方法。
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
//		c.add("aaa");
//		c.add("aaa");
//		c.add("bbb");
//		c.add("ccc");
		//contains(Object obj) : 当前集合是否包含obj
//		System.out.println(c.contains("aaa"));
		
		
		System.out.println("------------------------------------------------");
		
//		c.add(new String("aaa"));
//		System.out.println(c.contains(new String("aaa")));
		
		System.out.println("------------------------------------------------");
		
	
		c.add(new Person("aa", 18));
		System.out.println(c);
		System.out.println(c.contains(new Person("aa",18)));
		
		System.out.println("------------------------------------------------");
		
		
		
	}

	/**
	 	add(Object obj) :向集合中添加元素
	 	addAll(Collection c) : 将集合c中的元素分别放到当前集合中
	 	size() :当前集合中元素的个数
	 	clear() : 清空当前集合中所有的元素
	 	isEmpty() :当前集合是否为空
	 */
	@Test
	public void test(){
		
		Collection c = new ArrayList();
		//add(Object obj) :向集合中添加元素
		c.add("aa");
		c.add(11);//自动装箱
		c.add(22);
		
		
		
		Collection c2 = new ArrayList();
		c2.add("cc");
		c2.add("dd");
		
		//addAll(Collection c) : 将集合c中的元素分别放到当前集合中
		c.addAll(c2);
		
		//clear() : 清空当前集合中所有的元素
		c.clear();
		
		//isEmpty() :当前集合是否为空
		System.out.println(c.isEmpty());
		
		System.out.println(c);
		//size() :当前集合中元素的个数
		System.out.println(c.size());
	}
}























