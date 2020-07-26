package com.alibaba.String.java2;

import org.junit.Test;

/*
 * 课后题
 */
public class StringAPI2 {

	
	/**
	 * 将字符串 反转
	 * “abcdefg”
	 */
	@Test
	public void test(){
		String s = "abcdefg";
		
		String reverseString = "";
		
		//从后向前遍历
		for (int i = s.length() - 1; i >= 0; i--) {
			//获取指定位置上的元素
			char c = s.charAt(i);
			//字符串拼接
			reverseString += c;
		}
		
		System.out.println(reverseString);
	}
	
	/**
	 * 将字符串"aABcDefG"中的小写字符变成大写
	 */
	@Test
	public void test2(){
		
		String s = "aABcDefG";
		
		String newString = "";
		
		for (int i = 0; i < s.length(); i++) {
			//获取每一个指定位置上的字符
			char c = s.charAt(i);
			//判断该字符是否是小写
			if(c >= 'a' && c <= 'z'){
				//转成大写
				c -= 32;
			}
			
			newString += c;
		}
		
		System.out.println(newString);
	}
	
	/**
	 * 将字符串"aABcDefG"中的大写字符变成小写
	 */
	
	/**
	 * 将字符串"aABcDefG"中的大小写互换
	 */
	
	/**
	 * 将字符串"abcccdefabdefab"中的"ab"的个数进行统计
	 */
	@Test
	public void test3(){
		
		//要查找的内容
		String findStr = "ab";
		//元数据 - "abcccdefabdefab"
		String  s = "abcccdefabdefabababab";
		//统计个数
		int count = 0;
		//要查找的索引位置
		int index = 0;
		
		/*
		//循环
		index = s.indexOf(findStr,0);
		
		while(index != -1){
			
			//个数累加
			count++;
			
			//重新计算index的位置
			index += findStr.length();
			
			//继续查找
			index = s.indexOf(findStr, index);
		}
		*/
		
		
		while((index = s.indexOf(findStr, index)) != -1){
			
			
			//个数累加
			count++;
			//重新计算index的位置
			index += findStr.length();
		}
		
		System.out.println("count=" + count);
		
	}
}














