package com.alibaba.Throws.java;

/*
 	演示发生的error问题
 */
public class ErrorTest {

	public static void main(String[] args) {
		
		//StackOverflowError，栈溢出（栈针是有大小的）
//		main(args);
		
		//OutOfMemoryError，超出内存（堆内存）
//		int[] number  =  new int[1024 * 1024 * 1024];
	}
}
