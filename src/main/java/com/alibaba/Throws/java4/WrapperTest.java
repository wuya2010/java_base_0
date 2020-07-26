package com.alibaba.Throws.java4;

import org.junit.Test;
/*
 	包装类 ：针对八种基本数据类型定义了相应的类（包装类）
 */
public class WrapperTest {

	@Test
	public void test2(){
		int a = 10;
		Integer integer = new Integer(a);
		System.out.println(integer);

		boolean boo = true;
		Boolean boolean1 = new Boolean(boo);
		System.out.println(boolean1);

	}

	/*
	 * 包装类 转 基本数据类型 : xxxValue()
	 */
	@Test
	public void test3(){

		Integer integer = new Integer(111);
		int num = integer.intValue();
		System.out.println(num);

		Boolean boolean1 = new Boolean(true);
		boolean booleanValue = boolean1.booleanValue();
		System.out.println(booleanValue);
	}

	/*
	 * 自动拆箱 : 将包装类的对象直接赋值给基本数据类型
	 * 自动装箱 ： 将基本数据类型直接赋值给包装类
	 */
	@Test
	public void test4(){
		//自动拆箱
		int num = new Integer(111);
		//自动装箱：
		int a = 10;
		Integer num2 = a;

		System.out.println(num);
		System.out.println(num2);

		System.out.println("----------自动拆箱，装箱的使用场景");

		add(10); //自动装箱 ：先将int类型的值 装箱成 Integer,再赋值给Object
	}
	public void add(Object obj){
		System.out.println(obj instanceof Integer);//true
	}


	/*
	 * 基本数据类型，包装类 -> String
	 * 
	 * 基本数据类型转String：
	  	第一种方式 ： 字符串拼接
	   	第二种方式 ：调用String中的valueOf方法
	   	
	       包装类转String
	        调用包装类的toString方法
	 */
	@Test
	public void test5(){
		int num = 111;
		//基本数据类型转String
		//第一种方式 ： 字符串拼接
		String s = num + "";
		//第二种方式 ：调用String中的valueOf方法
		String s2 = String.valueOf(num);

		System.out.println(s);
		System.out.println(s2);


		System.out.println("------------包装类转String--------------------");

		//调用包装类的toString方法
		Integer integer = new Integer(10);
		String s3 = integer.toString();
		System.out.println(s3);
	}

	/*
	 * String -> 基本数据类型，包装类
	 *
	 * String转基本数据类型 : Xxx(包装类).parseXxx(要转换类型)()
	 * String转包装类 : 通过包装类的构造器
	 */
	@Test
	public void test6(){
		//String转基本数据类型
		String s = "111";
		int num = Integer.parseInt(s);

		boolean boo = Boolean.parseBoolean("true");

		System.out.println(num);
		System.out.println(boo);

		System.out.println("--------------String转包装类--------------");

		Integer integer = new Integer("111");
		Boolean boolean1 = new Boolean("true");

		System.out.println("----------------注意-------------------");

//		int num2 = Integer.parseInt("aaa"); //要注意字符串的内容和我们需要的类型是否匹配

		boolean parseBoolean = Boolean.parseBoolean("aaaa");
		System.out.println(parseBoolean);
	}

	/*
	 * 基本数据类型  ，包装类，String 三者之间的转换
	 */
	@Test
	public void test(){

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		int number = Integer.parseInt("111");
	}
}
