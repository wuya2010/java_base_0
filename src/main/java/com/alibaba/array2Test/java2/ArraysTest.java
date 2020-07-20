package com.alibaba.array2Test.java2;

import java.util.Arrays;

/*
 	数组的工具类 ：Arrays
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		int[] numbers = {-2,-1,-9,6,8,-10};
		//sort(int[] numbers) : 对数组中的元素进行排序
		Arrays.sort(numbers);
		
		
		
		//toString(int[] numbers) 将数组中的元素拼接成字符串返回（一般用来调试程序的时候使用）
		String str = Arrays.toString(numbers);
		System.out.println(str);
		
		
		//binarySearch(int[] numbers,int findNumber) 
		//:从数组numbers中查找findNumber的索引位置，如果没有返回负数
		//注意 ： 使用二分法查找前必须先排序
		int index = Arrays.binarySearch(numbers, -10);
		System.out.println(index);
	}
}





