package com.alibaba.classMutilTai.exer;

import java.util.Arrays;

/*
 * 值传递的一个案例
 */
public class ValueTransferDemo {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		ValueTransferDemo vt = new ValueTransferDemo();
		
		vt.test(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
	}
	
	
	public void test(int[] n){
		
		int[] ns = {0,0,1,0};
		
		n = ns;
	}
}














