package com.alibaba.Enum.java2;

/*
 * 接口(jdk1.8) 中可以有 ： 1.常量   2.抽象方法  3.静态方法  4.默认方法
 */
public interface MyNewInterface {

	/*
	 * 静态方法
	 */
	public static void test(){
		System.out.println("static test aaa");
	}
	
	/*
	 * 默认方法
	 */
	default void show(){
		System.out.println("void show ccc");
	}
}
