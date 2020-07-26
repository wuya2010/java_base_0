package com.alibaba.collection.java3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/**
 * 
 * 
 * Iterator : 迭代器接口
 * 
 * 作用 ：用来遍历集合中所有的元素
 */
public class IteratorTest {

	/**
	 * 大家常犯的错误二
	 */
	@Test
	public void test3() {
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");

		//每调用一次iterator()会创建一个新的Iterator实现类的对象（就像每创建一个对象就创建一根新的指针）
		while(c.iterator().hasNext()){
			System.out.println(c.iterator().next());
		}
	}

	/**
	 * 大家常犯的错误 一
	 */
	@Test
	public void test2() {
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");

		Iterator iterator = c.iterator();

		// 每next()一次指针就会下移一次。
		while (iterator.next() != null) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * iterator() : 返回Iterator接口的实现类的对象，用来遍历集合中的元素 
	 * next() : 作用 ①指针下移 ②返回指针指向的元素
	 * hasNext() : 如果还有下一个元素就返回true,否则就返回false
	 */
	@Test
	public void test() {
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");

		// iterator() : 返回Iterator接口的实现类的对象，用来遍历集合中的元素
		Iterator iterator = c.iterator();

		// next() : 作用 ①指针下移 ②返回指针指向的元素
		// Object obj = iterator.next();
		// System.out.println(obj);
		// System.out.println(iterator.next());
		// System.out.println(iterator.next());

		// 会抛异常 - 因为没有更多的元素了
		// System.out.println(iterator.next());

		/*
		 * 正确的遍历集合的姿势
		 */
		// hasNext() : 如果还有下一个元素就返回true,否则就返回false
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
