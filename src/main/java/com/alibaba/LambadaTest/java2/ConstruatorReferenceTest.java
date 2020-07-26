package com.alibaba.LambadaTest.java2;

import java.util.function.Function;

import org.junit.Test;

/*
 	构造器引用 ：
 	
 */
public class ConstruatorReferenceTest {
	/*
	 * 数组引用
	 */
	@Test
	public void test2(){
		
		Function<Integer, int[]> function = new Function<Integer,int[]>() {

			@Override
			public int[] apply(Integer t) {
				// TODO Auto-generated method stub
				return new int[t];
			}
		};
		
		System.out.println("-------------lambda表达式----------------");
		
		function = t -> new int[t];
		
		System.out.println("--------------构造器引用--------------");
		
		function = int[] :: new;
		
		System.out.println(function.apply(10).length);
	}
	/*
	 * 构造器引用
	 */
	@Test
	public void test(){
		
		Function<Integer, Person> function = new Function<Integer,Person>() {

			@Override
			public Person apply(Integer t) {
				// TODO Auto-generated method stub
				return new Person(t);
			}
		};
		
		System.out.println("-------------lambda表达式----------------");
		
		function = t -> new Person(t);
		
		System.out.println("--------------构造器引用--------------");
		
		function = Person :: new;
		
		Person p = function.apply(30);
		System.out.println(p.number);
	}
}













