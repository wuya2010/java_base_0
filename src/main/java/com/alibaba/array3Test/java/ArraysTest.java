package com.alibaba.array3Test.java;

/*
 * 用来测试自定义的Arrays工具类
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		int[] numbers = {1,20,3,40,5};
		Arrays arrays = new Arrays();
//		arrays.reverse(numbers);
		
		
		arrays.sort(numbers,false);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
