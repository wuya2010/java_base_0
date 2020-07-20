package com.alibaba.array2Test.java;

/*
 	
 	冒泡排序 
 	
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = {10,5,7,6,9};
		
		//外层循环控制轮
		for (int i = 0; i < numbers.length - 1; i++) {
			
			//内层循环  ： 1.控制次数    2.索引值
			for (int j = 0; j < numbers.length - i - 1; j++) {
				
				//比较两个值，如果前面的值比后面的值大，那么进行交换
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					//注意 ： j当索引值表示的范围(因为下面有j + 1所以一定要注意索引值范围)
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
				
			}
		}
		
		//输出数组中的内容
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
