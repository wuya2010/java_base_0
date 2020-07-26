package com.alibaba.LambadaTest.java2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/*
 	演示java8中提供的一些函数式接口
 	
 	
 	注意 ： 我们不关心接口的名字只关心接口中的方法。
 */
public class FunctionInterfaceTest2 {
	
	/*
	 * Predicate : 有参有返回值（布尔类型）
	 */
	@Test
	public void test4(){
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		System.out.println("-------------------------");
		
		predicate = t -> "aaa".equals(t);
	}
	
	/*
	 * Function : 有参有返回值
	 */
	@Test
	public void test3(){
		Function<String, Integer> function = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		System.out.println("-------------");
		
		Function<String, Integer> function2 = t -> new Integer(t);
	}
	
	/*
	 * Supplier : 无参有返回值
	 */
	@Test
	public void test2(){
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				
				return null;
			}
		};
		System.out.println("-----------");
		
		supplier = () -> "aaa";
		
	}

	/*
	 * Consumer : 有参没有返回值
	 */
	@Test
	public void test(){
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				
			}
		};
		
		System.out.println("------------------------------");
		
		consumer = t -> System.out.println(t);
		
		consumer.accept("aaa");
	}
}
















