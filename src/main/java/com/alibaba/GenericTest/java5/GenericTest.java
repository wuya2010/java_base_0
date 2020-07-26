package com.alibaba.GenericTest.java5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 	通配符 ： ？
 	
 	理解 ： ？ 是所有泛型类型的父类
 */
public class GenericTest {
	
	/*
	 	通配符的限制条件：
	 	<? extends Number>     (无穷小 , Number]
		只允许泛型为Number及Number子类的引用调用

		<? super Number>      [Number , 无穷大)
		只允许泛型为Number及Number父类的引用调用

		<? extends Comparable>
		只允许泛型为实现Comparable接口的实现类的引用调用
	 */
	@Test
	public void demo3(){
		ArrayList<Number> al= new ArrayList<Number>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Object> al3 = new ArrayList<Object>();
		
		test2(al);
		test2(al2);
//		test2(al3);
		
		System.out.println("------------------");
		
		test3(al);
//		test3(al2);
		test3(al3);
		
	}
	
	//只允许泛型为Number及Number父类的引用调用
	public void test3(List<? super Number> list) {

	}
	//只允许泛型为Number及Number子类的引用调用
	public void test2(List<? extends Number> list) {

	}
	
	/*
	 	使用通配符需要注意的问题
	 	1.使用了通配符的集合只能添加null
	 	2.使用了通配符的集合可以遍历所有的元素，但是元素的类型都是Object
	 */
	@Test
	public void demo2(){
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		for (String str : al) {
			System.out.println(str);
		}
		
		
		
		System.out.println("----------------------------------");
	
		List<?> list= al;
		//使用了通配符的集合只能添加null
		list.add(null);
		//遍历使用了通配符的集合
		for (Object obj : list) {
			System.out.println(obj);//aaa,		bbb,		null,
		}
	}
	
	/*
	 	使用通配符
	 */
	@Test
	public void demo(){
		
		ArrayList<?> list = new ArrayList<Integer>();
		
		list = new ArrayList<Object>();
		
		list = new ArrayList<Number>();

		
		System.out.println("-----------------------------");
		
		ArrayList<Number> al= new ArrayList<Number>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		test(al);
		test(al2);
	}

	public void test(List<?> list) {

	}
}
