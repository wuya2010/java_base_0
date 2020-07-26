package com.alibaba.String.java;

import org.junit.Test;

/**
 * 课后题
 * @author Administrator
 *
 */
public class Demo {

	@Test
	public void test(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); //false

		/*
		 * -128  ~  127 这个范围内的数值都是直接从数组中获取（多次获取同一个位置的对象都是相同的）
		 */
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true，m中存放的是Integer的数组
		//数组长度256，

		/*
		 * -128 ~ 127 超过此范围的数值，都会直接创建一个新的Integer对象，调用多少次创建多少个
		 */
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false

	}
}
