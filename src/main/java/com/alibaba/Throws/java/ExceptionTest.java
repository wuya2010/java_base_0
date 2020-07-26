package com.alibaba.Throws.java;

import java.io.FileInputStream;

/*
 	异常处理：
 	
 	一  异常体系结构：
 	
 	 |-----Throwable 
 	 	|-----Error : 没有针对性的代码可以进行处理
 	 	
 	 	|-----Exception ：可以有针对性的代码进行处理
 	 	
 	 		|----编译时异常 ：代码在编译时发生的异常(javac 源文件名.java)
 	 			 FileNotFoundException ： 文件找不到异常
 	 		|----运行时异常（RunTimeException及所有子类）： 代码在运行时发生的异常(java 字节码文件名)
 	 			ArithmeticException : 算术运算异常
 	 			NullPointerException : 空指针异常
 	 			ArrayIndexOutOfBoundsException : 数组下角标越界
 	 		
 */
public class ExceptionTest {
	
	/**
	 * 编译时异常 : 必须处理否则不能运行。
	 */
	public void test2(){
		//FileNotFoundException
//		new FileInputStream("aaa.txt");
	}
	
	/**
	 * 运行时异常
	 */
	public void test(){
		//ArithmeticException
//		System.out.println(1 / 0);
		
		//NullPointerException
		String s = null;
//		System.out.println(s.toUpperCase());
		
		//ArrayIndexOutOfBoundsException
		int[] numbers = new int[2];
//		System.out.println(numbers[2]);
	}

	public static void main(String[] args) {
		
	}
}

















