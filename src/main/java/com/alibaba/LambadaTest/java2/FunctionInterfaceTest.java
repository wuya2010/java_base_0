package com.alibaba.LambadaTest.java2;

/*
 * 函数式接口 ： 只包含一个抽象方法的接口，称为函数式接口。
 * 
        作用 ：那么就可以通过 Lambda 表达式来创建该接口的对象
 */
public class FunctionInterfaceTest {

	public static void main(String[] args) {
		
		/*
		 * 创建了一个MyInterface接口的实现类的对象 - 匿名内部类
		 */
//		MyInterface<String> myInterface = new MyInterface<String>() {
//
//			@Override
//			public void setT(String t) {
//				System.out.println(t);
//			}
//		};
		
		System.out.println("------------------lambda表达式-----------");
		
		//创建了一个MyInterface接口的实现类的对象  - lambda表达式
		MyInterface<String> myInterface2 = t -> System.out.println(t);
		
		
	}
}

/*
 * 只有一个抽象方法的接口才能被写成lambda表达式
 */
@FunctionalInterface  //表明当前接口是一个函数式接口（只有一个抽象方法的接口叫做函数式接口）
interface MyInterface<T>{
	
	void setT(T t);
	
	public static void say(){
		
	}
}
