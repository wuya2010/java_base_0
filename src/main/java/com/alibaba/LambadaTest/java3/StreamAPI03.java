package com.alibaba.LambadaTest.java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

/*
 	Stream中间操作s
 */
public class StreamAPI03 {
	
	static List<Person> list = new ArrayList<>();

	static{
		list.add(new Person(1, "aa", 16, 5000));
		list.add(new Person(2, "cccc", 26, 11000));
		list.add(new Person(3, "bb", 36, 15000));
		list.add(new Person(4, "dddddd", 56, 19000));
		list.add(new Person(4, "dd", 56, 19000));
		list.add(new Person(4, "fff", 56, 19000));
	}
	

	
	/*
	 *  sorted()——自然排序
		sorted(Comparator com)——定制排序

	 */
	@Test
	public void test3(){
		list.stream()
			.sorted((o1,o2) -> o1.age - o2.age) //安年纪排序
			.forEach(System.out::println);
	}
	
	
	/*
	 *  map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，
	 *  	该函数会被应用到每个元素上，并将其映射成一个新的元素。
	 *  
		练习：获取员工姓名长度大于2的员工的姓名。
		
		flatMap(Function f)——接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。

	 */
	@Test
	public void demo2(){
		//练习：获取员工姓名长度大于2的员工的姓名。
		list.stream()
			.map(x -> x.name)
			.filter(x -> x.length() > 2)
			.forEach(System.out::println);
	}
	@Test
	public void demo(){
		String[] split = "hello".split("");
		for (String string : split) {
			System.out.println(string);
		}
	}
	@Test
	public void test2(){
		
		//输出所有员工的年纪
//		list.stream()
//			.map(x -> x.age) //传进来的是Person但是返回的是age
//			.forEach(System.out::println);
		
		System.out.println("---------------flatmap------------------");
		//需求
		String[] names = {"hello","java","world"};
		//去重 - 字母去重
		Arrays.stream(names)
		.flatMap(x -> Arrays.stream(x.split("")))
		//.distinct() //去重
		.forEach(System.out::println);
	}
	
	/*
	 *  filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
		limit(n)——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素


			list.stream()
			.filter(new Predicate<Person>() {

				@Override
				public boolean test(Person t) {
					
					return t.age > 18;
				}
			})
	 */
	@Test
	public void test(){
		
		//获取集合中大于18岁的人
		list.stream()
			.filter(t -> t.age > 18) // 从流中排除某些元素。
//			.limit(2) //截断流，使其元素不超过给定数量。
//			.skip(1) //跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
			.distinct()
			.forEach(System.out::println);
	}
}




