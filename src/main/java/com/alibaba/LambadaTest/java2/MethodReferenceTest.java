package com.alibaba.LambadaTest.java2;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.junit.Test;

/*
 	方法的引用：
 	
 	说明：
 		1.方法的引用就是lambda表达式 （对lambda表达示的进一步的简化）
 		
 	格式 ：   
 		 ：：
 		 
 	要求 ：实现抽象方法的参数列表和返回值类型，必须与方法引用的方法的参数列表和返回值类型保持一致！

 	
 	三种使用情况：
 		对象::实例方法名
		类::静态方法名
		类::实例方法名

 		
 */
public class MethodReferenceTest {
	
	/*
	 * 类::实例方法名(不太好理解)
	 */
	@Test
	public void test3(){
		
		BiPredicate<String, String> bp = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				
				/*
				 * public boolean equals(Object anObject) {
				 * }
				 */
				return t.equals(u);
			}
		};
		
		System.out.println("----------------------lambda----------");
		
		bp = (t,u)-> t.equals(u);
		
		System.out.println("------------------方法的引用---------------");
		
		bp = String :: equals;
		
	}
	
	/*
	 * 类::静态方法名
	 */
	@Test
	public void test2(){
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				/*
				 	 public static int compare(int x, int y) {
        					return (x < y) ? -1 : ((x == y) ? 0 : 1);
    				 }
				 */
//				return Integer.compare(o1, o2);
				
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("--------------lambda-----------");
		
		comparator = (o1,o2) -> Integer.compare(o1, o2);
		
		System.out.println("------------方法的引用-----------------");
		
		//第二种方式 ： 类 ：：静态方法名
//		Comparator<Integer> comparator2 = Integer::compare;
		
		//第三种方式  类名 ：：实例方法名
		Comparator<Integer> comparator2 = Integer::compareTo;
		
	}

	/*
	 * 对象::实例方法名
	 */
	@Test
	public void test(){
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				/*
				 	  public void println(String x) {
	        	
        			  }
    }
				 */
			}
		};
		
		System.out.println("----------------lambda---------");
		
		consumer = t -> System.out.println(t);
		
		System.out.println("--------------方法的引用----------");
		//创建了一个Consumer接口的实现类的对象 - 方法的引用的方式
		Consumer<String> consumer2 = System.out :: println;
		consumer2.accept("cccc");
		
		
	}
}









