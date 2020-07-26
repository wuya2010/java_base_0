package com.alibaba.LambadaTest.java;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

/*
 *	lambda表达式的演示
 */
public class LambdaTest {
	
	/*
	 * 使用lambda之后
	 */
	@Test
	public void test2(){
		
		TreeSet<Person> set = new TreeSet<>((o1,o2)->o1.name.compareTo(o2.name));
		//TreeSet<Person> set = new TreeSet<>((o1,o2) -> o1.name.compareTo(o2.name));
		set.add(new Person("aaa", 18));
		set.add(new Person("ccc", 28));
		set.add(new Person("bbb", 38));
		set.add(new Person("ddd", 8));

		System.out.println(set);
	}

	/*
	 * 没有使用lambda之前
	 */
	@Test
	public void test(){

		
		Comparator<Person> comparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		TreeSet<Person> set = new TreeSet<>(comparator);
		set.add(new Person("aaa", 18));
		set.add(new Person("ccc", 28));
		set.add(new Person("bbb", 38));
		set.add(new Person("ddd", 8));

		System.out.println(set);
	}
}
