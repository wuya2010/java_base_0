package com.alibaba.Throws.java3;

import java.io.FileNotFoundException;

/*
 * 	throw : 手动抛异常

 	抛异常的方式 二：手动抛异常

 	格式 ： throw 异常类的对象


 	throw和throws的区别？
 	throws是用来处理异常的
 	throw是制造异常的


 */
public class ThrowTest {

	public static void main(String[] args) {

//		System.out.println(1 / 0);

		ThrowTest tt = new ThrowTest();
//		抛运行时异常 （可以不处理，但也没有提醒功能）： 只要输入的内容有误则直接终断程序的运行。
		tt.setAge(-10);

		System.out.println("--------------抛编译时异常----------------");


		//抛编译时的异常能起到一个提醒的功能 ： 在调用该方法时可能抛出异常所以需要做一些处理。
		try {
			tt.setAge2(10);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 抛编译时异常 ：必须处理，但是往往我们都throws
	 * @param age
	 * @throws FileNotFoundException
	 */
	public void setAge2(int age) throws FileNotFoundException{
		if(age < 0){
			//1.抛异常
			throw new FileNotFoundException(); //抛出的是一个编译时异常
		}else{
			System.out.println(age);
		}
	}

	/**
	 * 抛运行异常 ： 运行时异常可以不处理
	 * @param age
	 */
	public void setAge(int age){
		if(age < 0){
			//1.抛异常
			throw new NullPointerException(); //抛出的是一个运行异常的对象
		}else{
			System.out.println(age);
		}
	}
}
