package com.alibaba.array2Test.java;

/*
 	一维数组 ： 内存解析
 */
public class ArrayTest {
	

	public static void main(String[] args) {
		
		
		String[] str = new String[3];
		str[0] = "小泽老师";
		str[1] = "小泷老师";
		str[2] = "小饭老师";
		
		
		str = new String[2];
		str[0] = "小刚姐";
		
		
		String[] str2 = str;
		str2[1] = "小刚炮";
		str2[0] = "刚刚婶";
		
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}
}
