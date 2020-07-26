package com.alibaba.classClazz.java;

import org.junit.Test;

/*
 	Math.round()
 */
public class RoundTest {
	
	/*
	 * 向下取整
	 */
	@Test
	public void test2(){  //结果都是12
		System.out.println(Math.floor(12.3));
		System.out.println(Math.floor(12.8));
		System.out.println(Math.floor(12.5));
	}

	@Test
	public void test(){
		
		System.out.println(Math.round(12.5));
		System.out.println(Math.round(12.3));
		
		System.out.println("------------------------");
		
		/*
		 * Math.round()底层实现
		 * 		Math.floor(number + 0.5)，，注意负数的向下取整
		 */
		System.out.println(Math.round(-12.5));
		System.out.println(Math.round(-12.8));
		System.out.println(Math.round(-12.3));
		
//		13
//		12
//		------------------------
//		-12
//		-13
//		-12
		
	}
}
