package com.alibaba.array2Test.exer;

import java.util.Scanner;

/*
 * 练习三
 保存五个通过键盘或命令行输入的数字
 */
public class SaveNumber {

	public static void main(String[] args) {
		//快捷键 ： ctrl + 1
		Scanner scanner = new Scanner(System.in);
		
		//创建数组用来保存数据
		int[] numbers = new int[5];
		
		//让用户输入五次数据
		for (int i = 0; i < numbers.length; i++) {
			//读取键盘数据
			System.out.println("请输入您要保存的数据");;
			int number = scanner.nextInt();
			//将读取到的数据保存到数组中
			numbers[i] = number;
			//下面的方式也可以
//			numbers[i] = scanner.nextInt();
		}
		
		//遍历数组中的数据
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
