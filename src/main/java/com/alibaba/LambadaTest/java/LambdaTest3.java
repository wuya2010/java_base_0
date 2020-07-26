package com.alibaba.LambadaTest.java;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest3 {
	/*
	 * 语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
	 */
	@Test
	public void test7(){
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("-------------------------------------");
		
		//方法体中只有一条执行语句时，大括号和return都可以省略。
		comparator = (o1,o2) -> o1.compareTo(o2);
	}
	
	/*
	 * 语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
	 */
	@Test
	public void test6(){
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("aaa");
				System.out.println("aaa");
				System.out.println("aaa");
				return 0;
			}
		};
		
		System.out.println("-------------------------------------");
		
		comparator = (o1,o2) -> {
			System.out.println("aaa");
			System.out.println("aaa");
			System.out.println("aaa");
			return 0;
		};
	}
	
	@Test
	public void test5(){
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("aaa");
			}
		};
		System.out.println("-------------------------------------");
		//注意 ： 如果没有形参小括号必须写
		runnable = () -> {
			System.out.println("aaa");
		};
	}
	
	/*
	 * 语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
	 */
	@Test
	public void test4(){
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				
			}
		};
		System.out.println("-------------------------------------");
		
		Consumer<String> consumer2 = consumer = t-> {
			System.out.println(t);
		};
	}
	
	/*
	 * 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
	 */
	@Test
	public void test3(){
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				
			}
		};
		System.out.println("-------------------------------------");
		
		Consumer<String> consumer2 = consumer = (t)-> {
			System.out.println(t);
		};
		
	}
	
	/*
	 * 语法格式二：Lambda 需要一个参数，但是没有返回值
	 */
	@Test
	public void test2(){
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				
			}
		};
		System.out.println("-------------------------------------");
		
		consumer = (String t)-> {
			System.out.println(t);
		};
		
	}

	/*
	 * 语法格式一：无参，无返回值
	 */
	@Test
	public void test(){
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("----------------------------------------");
		
		comparator = (String o1,String o2)->{
			return o1.compareTo(o2);
		};
		
		//使用
		comparator.compare("aaa", "bbb");
		
	}
}
