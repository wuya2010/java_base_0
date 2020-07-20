package com.alibaba.arrayTest.java2;

/*
 	
 	数组 ：数组是多个相同类型数据的组合
 	
 	说明：
 		1.数组是引用数据类型
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//1.数组的声明的初始化
		String[] names; //String类型的数组，存储的元素（数据）是String类型的
		int scores[];//暂不建议大家使用
		//数组的静态初始化 : 数组的初始化和赋值同时进行
		names = new String[]{"小苍姐","小泽姐","小刚哥","小刚姐"};
		int[] numbers = {1,2,3,4,5,6,7}; //当前的这种方式 - 数组的声明和初始化不能分开
		//数组的动态初始化 ：数组的初始化和赋值分开进行
		scores = new int[5]; //5指的是数组的长度（能放几个数据）
		
		//注意 ：无论静态初始化还是动态初始化数组一旦创建成功长度不可变。
		
		
		//2.获取数组的元素 - 通过索引值来获取
		//数组的索引值（下角标）是从0开始到(数组的长度 - 1)
		String name = names[0]; //0指的是索引值
		System.out.println(name);
		System.out.println(names[2]);
		
		
		//3.给数组的元素赋值 - 通过索引值
		scores[0] = 20;//0指的索引值
		System.out.println(scores[0]);
		
		
		//4.数组的属性 :length (指的是数组的长度)
		int len = names.length;
		System.out.println(len);
		System.out.println(numbers.length);
		
		//5.遍历数组中的元素
		for(int i = 0; i < names.length; i++){ //把 i的值当成索引值使用
			System.out.println(names[i]);
		}
		
		//6.数组元素的默认值
		/*
		 * 
		 基本数据类型
		  byte short int long -> 0
		  float double -> 0.0
		  char -> \u0000
		  boolean -> false
		 
		 引用数据类型 ：null
		 
		 */
		int[] a = new int[2];
		System.out.println(a[0]);
		boolean[] boo = new boolean[2];
		System.out.println(boo[0]);
		String[] str = new String[2];
		System.out.println(str[0]);
		char[] c = new char[2];
		System.out.println(c[0]);
	}
}











