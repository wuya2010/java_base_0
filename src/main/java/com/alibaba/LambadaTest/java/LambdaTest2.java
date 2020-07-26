package com.alibaba.LambadaTest.java;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

/*
 	lambda表达式：
 	
 	一 格式 ：
 		-> : lambda操作符（箭头操作符）
 		箭头左边 ： 方法的形参列表
 		箭头的右边 ： 方法体
 */
public class LambdaTest2 {

	/*
	 * 使用接口最原始的方式
	class A implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	*/
	
	@Test
	public void test2(){
		/*
		 * 接口
		 * public interface Comparator<T> {
		 * 
		 * 		 int compare(T o1, T o2);
		 * }
		 */
		
		
		/*
		 * 匿名内部类
		 */
		Comparator<Person> comparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		System.out.println("----------------------lambda表达式-----------------------------");
		
		//接口中只能有一个方法才能使用lambda表达式
		Comparator<Person> comparator2 = (Person o1,Person o2) -> {
			return o1.name.compareTo(o2.name);
		};
		
		System.out.println("---------------------------------------------------");
		
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("aaa", 18));
		set.add(new Person("ccc", 28));
		set.add(new Person("bbb", 38));
		set.add(new Person("ddd", 8));

		System.out.println(set);
	}
}
