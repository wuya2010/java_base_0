package com.alibaba.mapTest.java;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArraysAPI {

	/**
	 * 将数组转为集合 ： asList(T ... a)
	 */
	@Test
	public void test(){
		String[] names = {"aa","cc"};
		
		List asList = Arrays.asList(names);
		
		for (Object object : asList) {
			System.out.println(object);
		}
	}
}
