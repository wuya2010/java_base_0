package com.alibaba.array2Test.exer;

/*
 	
 	练习一
创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
使用for循环访问所有元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘

 */
public class Demo {

	public static void main(String[] args) {
		
		char[] c = new char[26]; //用来存放‘A’ - 'Z'
		
		char ch = 'A';
		
		//给数组中的元素赋值
		for(int i = 0; i < c.length; i++){
			c[i] = ch;
			ch++;
		}
		
		//遍历
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}
}



















