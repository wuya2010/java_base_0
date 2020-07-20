package com.alibaba.array2Test.java;

/*
 * 数组的复制、反转
 */
public class ArrayAlgorithmTest2 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6};
		
		System.out.println("-------------------数组的复制----------------------");
		
		//这不叫复制 ，两个变量指向了同一块内存，任何一个变量对数据进行修改，另一个变量看到的就是修改后的内容
//		int[] numbers2 = numbers; 
		
		//1.创建一个数组
		int[] copyNumber = new int[numbers.length];
		//2.将numbers中的内容赋值给copyNumber
		for (int i = 0; i < numbers.length; i++) {
			copyNumber[i] = numbers[i];
		}
		//遍历数组
		for (int i = 0; i < copyNumber.length; i++) {
			System.out.print(copyNumber[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------------数组的反转----------------------");
		//第一种方式 ： 通过新建一个数组去实现数组的反转
		int[] nums = new int[numbers.length];
		//倒着读取数据
		for(int i = numbers.length - 1 ; i >= 0 ; i--){
			//向另一个数组正序存数据
			nums[numbers.length - 1 - i] = numbers[i];
		}
		//遍历nums数组
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------------数组的反转----------------------");
		//第二种方式  : 在原数组中进行数据的交换实现
		int[] ns = {1,2,3,4,5,6};
		
		/*
		 * i 表示的是第一个元素的位置（索引值）
		 * j 表示的是最后一个元素的位置（索引值）
		 * 
		 * 让第一个后最后一个元素实现交换
		 * 然后再让起始的位置i++,最后一个元素的位置j--
		 * 然后再实现交换
		 */
		for(int i = 0,j = ns.length - 1; i < numbers.length / 2 ;i++,j--){
			int temp = ns[i];
			ns[i] = ns[j];
			ns[j] = temp;
		}
		
		//遍历数据
		for (int i = 0; i < ns.length; i++) {
			System.out.print(ns[i] + " ");
		}
		
	}
}















