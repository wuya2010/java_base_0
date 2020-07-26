package com.alibaba.LambadaTest.java3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/*
   		终止操作 ： 在执行Stream流的过程中必须有终止操作，否则中间操作不生效。
 */
public class StreamAPI04 {
	static List<Person> list = new ArrayList<>();

	static{
		list.add(new Person(1, "aa", 16, 5000));
		list.add(new Person(2, "cccc", 26, 11000));
		list.add(new Person(3, "bb", 36, 15000));
		list.add(new Person(4, "马云", 56, 19000));
		list.add(new Person(5, "马化腾", 56, 19000));
		list.add(new Person(6, "马冬梅", 56, 19000));
	}
	/*
	 * collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
	 */
	@Test
	public void test5(){
		List<Integer> collect = Stream.of(1,2,3,4,5,6)
			.collect(Collectors.toList());
		
		System.out.println(collect);
	}
	
	/*
	 * reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T  
		reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
		练习1：计算公司所有员工工资的总和
		练习2：员工姓名中包含“马”的员工个数

	 */
	@Test
	public void test4(){
		//练习2：员工姓名中包含“马”的员工个数
		long count = list.stream()
			.map(x -> x.name)
			.filter(x -> x.contains("马"))
			.count();
			
		System.out.println(count);
			
	}
	@Test
	public void test3(){
		Optional<Integer> reduce = list.stream()
			.map(x -> x.id)
			.reduce((x,y) -> x + y);
		
		System.out.println(reduce.get());
		
		System.out.println("------------------------------------");
		
		Integer number = list.stream()
				.map(x -> x.id)
				.reduce(5,(x,y) -> x + y);
		System.out.println(number);
	}
	
	/*
	 *  allMatch(Predicate p)——检查是否匹配所有元素
		anyMatch(Predicate p)——检查是否至少匹配一个元素
		noneMatch(Predicate p)——检查是否没有匹配的元素
		findFirst——返回第一个元素
		findAny——返回当前流中的任意元素
		count——返回流中元素的总个数
		max(Comparator c)——返回流中最大值
		练习：返回最高的工资：
		min(Comparator c)——返回流中最小值
		练习：返回最低工资的员工
		forEach(Consumer c)——内部迭代

	 */
	@Test
	public void test2(){
		Optional<Person> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());
		
		Optional<Person> findAny = list.stream().findAny();
		System.out.println(findAny.get());
		
		long count = list.stream().count();
		System.out.println(count);
		
		Optional<Person> max = list.stream().max((o1,o2) -> o1.age - o2.age);
		System.out.println(max.get());
		
		//返回最高工资
		list.stream().map(x -> x.salary)
				.sorted((o1,o2) -> -(int)(o1 - o2))
				.limit(1).forEach(System.out::println);
	}
	@Test
	public void test(){
		boolean allMatch = list.stream().allMatch(x ->  x.age == 56);
		System.out.println(allMatch);
		
		boolean anyMatch = list.stream().anyMatch(x -> x.age == 56);
		System.out.println(anyMatch);
		
		boolean noneMatch = list.stream().noneMatch(x -> x.age == 100);
		System.out.println(noneMatch);
	}
}
