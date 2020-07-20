package com.alibaba.array3Test.java;

import java.util.Arrays;

/*
 	调用方法时传递是数组的类型
 */
public class VTArray {

	
	public static void main(String[] args) {
		
		VTArray vt = new VTArray();
		
		int[] numbers = {5,3,2,1,7};
		
		vt.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}
	
	/*
	 * 对数组进行排序 ： 
	 * 值传递（引用数据类型） ： 赋值过来的是数组的地址值
	 */
	public void sort(int[] num){
//		Arrays.sort(numbers);
		
		//将数组中所有的数据都变成0
		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
	}
}
