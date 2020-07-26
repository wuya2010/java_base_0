package com.alibaba.LambadaTest.java4;

import org.junit.Test;

/*
 	前++  和  后++
 */
public class Demo {
	
	
	@Test
	public void test4(){
		
		int a = 1;
		int b = a++ + ++a + a++;
		System.out.println("b=" + b + " a=" + a);
	}
	
	@Test
	public void test3() {
		
		int a = 10;
		a = ++a;
		System.out.println("a=" + a);// a = 11
	}
	
	@Test
	public void test2() {
		
		int a = 10;
		a = a++;
		System.out.println("a=" + a);// a = 10
	}

	@Test
	public void test() {
		
		int a = 10;

		int b = a++;

		System.out.println("b=" + b + " a=" + a);// b=10 a=11
	}
}
