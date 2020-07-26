package com.alibaba.mapTest.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;


/**
 	
 	Collection子接口之：Set
 	
 	Set : 存储的元素是无序的不可重复的
 	
 	|-----Set:
 		|-----HashSet: HashSet是Set的主要实现类
 			|----LinkedHashSet:
 		|-----TreeSet:
 	
 	说明：
 		无序性 ：无序性不是指的随机性,指的是根据hashCode方法算出的哈希值来决定数据存放的位置（不是顺序存放的）。
 		不可重复 ：指的是调用equals方法进行内容的比较。如果结果为true则说明相同（重复）不能再放入到该集合中。
 	
 	
 	[面试题]HashSet的底层实现原理？
 		当我们向集合中添加数据K时，首行会根据K的hashCode方法算出的哈希值来决定存放的位置。
 		如果该位置上没有其它元素则直接存入。如果该位置上已经存在其它元素。那么调用K的equals方法
 		进行内容比较。如果比较的结果为true则认为重复不能存放。如果比较的结果为false以认为不重复，
 		以链表的形式将该元素进行存放。（jdk1.8进行修改）当链表上的元素的个数达到8时将链表改成红黑树。
 */
public class SetTest {
	
	
	/**
	 * LinkedHashSet : LinkedHashSet是HashSet的子类，底层实现和HashSet一样。
	 * 		LinkedHashSet可以安照元素添加的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
	 */
	@Test
	public void test2(){
		LinkedHashSet set = new LinkedHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		
		System.out.println(set);
	}

	/**
	 * HashSet
	 */
	@Test
	public void test(){
		Set set = new HashSet();
//		set.add("aaa");
//		set.add("bbb");
//		set.add("ccc");
//		set.add("ddd");
		
		set.add(new Person("aa", 18));
		set.add(new Person("bb", 18));
		set.add(new Person("cc", 18));
		
		System.out.println(set);
	}
}













