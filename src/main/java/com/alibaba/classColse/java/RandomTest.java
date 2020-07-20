package com.alibaba.classColse.java;

/*
 	获取随机数(10 - 99)
 	
 	
 	random() : 获取随机值，范围[0.0, 1.0)
 	
 */
public class RandomTest {

	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 90) + 10;
	}
}
