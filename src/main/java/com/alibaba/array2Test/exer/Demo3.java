package com.alibaba.array2Test.exer;

/*
 
 	输入10个元素（10——99范围），保存到数组中，查找里面是否有>80，如果有，显示有，否则提示没有

 */
public class Demo3 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			//随机产生10 - 99的整数
			int number = (int)(Math.random() * 90) + 10;
			numbers[i] = number;
		}
		
		//遍历数组中的内容
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
