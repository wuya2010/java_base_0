package com.alibaba.array2Test.java2;

/*
 	
 	数组中常见的异常：
 	
 	1.下角标越界 : 只要索引值没在范围（0~长度-1）之内就一定会报下角标越界
 	2.空指针异常 : 当变量为null时去调用属性和方法就一定会报NullPointerException
 */
public class ArrayException {

	public static void main(String[] args) {
		
		/*
		 * 下角标越界
		 */
		int[] numbers = new int[2];
		//下角标越界 ：ArrayIndexOutOfBoundsException
		//只要索引值没在范围（0~长度-1）之内就一定会报下角标越界
		System.out.println(numbers[2]);
		System.out.println(numbers[-1]);
		
		/*
		 * 空指针异常 :NullPointerException
		 * 注意 ： 当变量为null时去调用属性和方法就一定会报NullPointerException
		 */
		String str = null;
		System.out.println(str.equals("aaa"));
		
		String[][] strs = new String[2][];
		System.out.println(strs[0].length);
		
		String[] names = new String[2];
		String s = names[0];//默认值为null
		System.out.println(s.equals("aaa"));
	}
}









