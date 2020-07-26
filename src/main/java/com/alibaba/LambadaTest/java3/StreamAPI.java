package com.alibaba.LambadaTest.java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class StreamAPI {

	/*
	 * 演示  : 将大于等于3的数挑选出来，同时在原来的基础上+2
	 */
	@Test
	public void test(){
		
		int[] numbers = {1,2,3,4,4,5,6,7,8};
		
		
		Arrays.stream(numbers)
		.filter(x -> x >= 3)
		.map(x -> x + 2)
		.forEach(System.out::println);
	}
}
