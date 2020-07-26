package com.alibaba.collection.java;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class Other {
	
	/*
	 	一般的Float类和Double类可以用来做科学计算或工程计算，但在商业计算中，
	 	要求数字精度比较高，故用到java.math.BigDecimal类。
	 */
	@Test
	public void test3(){
		System.out.println( 1 - 0.41);
		System.out.println("---------------------------------");
		
		BigDecimal num1 = new BigDecimal(String.valueOf(1));
		BigDecimal num2 = new BigDecimal(String.valueOf(0.41));
		System.out.println(num1.subtract(num2));
	}
	
	/*
	 * BigInteger ：Integer的升级版
	 	Integer类作为int的包装类，能存储的最大整型值为2^31−1，BigInteger类的数值范围较Integer类、
	 	Long类的数值范围要大得多，可以支持任意精度的整数。

	 */
	@Test
	public void test2(){
		//2147483647
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
		
		int a = maxValue + 1;
		System.out.println(a);
		
		BigInteger num1 = new BigInteger(String.valueOf(maxValue));
		BigInteger num2 = new BigInteger(String.valueOf(1));
		BigInteger sum = num1.add(num2);
		System.out.println(sum);
		
	}

	
	/*
	 	java.lang.Math提供了一系列静态方法用于科学计算；
	 	其方法的参数和返回值类型一般为double型。

	 */
	@Test
	public void test(){
		int abs = Math.abs(-5);//abs是啥？
		System.out.println(abs);
		
		double max = Math.max(10.5, 12.3);
		System.out.println(max);
	}
}
