package com.alibaba.String.java3;

import java.util.Arrays;

import org.junit.Test;

/*
 	StringBuffer和StringBuilder
 	
 	一  [面试题]String,StringBuffer,StringBuilder的区别?
 	
	 	String : 不可变的字符序列，底层是一个char[]被final修饰，
	 	StringBuffer : 可变的字符序列，底层是一个char[],线程安全的，效率低一些
	 	StringBuilder ：可变的字符序列，底层是一个char[],线程不安全的，效率高一些
 	
 	二  StringBuffer的构造器
	    new StringBuffer() : 底层创建了一个长度为16的数组
	    new StringBuffer(int capacity) : 底层创建了一个长度为capacity的数组
	    new StringBuffer(String str)  : 底层创建了一个长度为str.length() + 16的数组，同时将该内容append到数组中
	    
	 三  扩容 : 当我们通过空参的构造器创建对象时底层会创建一个长度为16的数组。
	  		 当我们向该对象中添加第17个元素时，底层会进行扩容，扩容（创建一个新的数组）为原来的2倍+2。同时将原来数组中的
	  		内容添加到新的数组中
 */
public class StringBufferTest {
	
	/**
	 * Arrays.copyOf()
	 */
	@Test
	public void test4(){
		
		String[] s = {"a","b","c"};
		
		String[] newArray = Arrays.copyOf(s, 20);
		//输出数组中的内容
		System.out.println(Arrays.toString(newArray));
		//输出数组的长度
		System.out.println(newArray.length);
	}
	
	/*
	  扩容 : 当我们通过空参的构造器创建对象时底层会创建一个长度为16的数组。
	  		 当我们向该对象中添加第17个元素时，底层会进行扩容，扩容（创建一个新的数组）为原来数组的长度的2倍+2。同时将原来数组中的
	  		内容添加到新的数组中
	 */
	@Test
	public void test3(){
		StringBuffer sb = new StringBuffer();//创建了一个长度为16的数组
		sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(sb);
	}
	
	/*
	  StringBuffer的构造器
	  new StringBuffer() : 底层创建了一个长度为16的数组
	  new StringBuffer(int capacity) : 底层创建了一个长度为capacity的数组
	  new StringBuffer(String str)  : 底层创建了一个长度为str.length() + 16的数组，同时将该内容append到数组中
	 */
	@Test
	public void test2(){
		new StringBuffer();
		new StringBuffer(30);
		new StringBuffer("aaaaaa"); //创建一个长度为 （实参的长度 +　16）,同时将实参append到数组中
	}

	/*
	 * StringBuffer的API
	 * 
	 * 	//添加内容
	  	StringBuffer append(String s),   StringBuffer append(int n) ,  
		StringBuffer append(Object o) ,  StringBuffer append(char n),
		StringBuffer append(long n),  StringBuffer append(boolean n),
		//在当前字符串的index位置插入str
		StringBuffer insert(int index, String str) 
		//字符串反转
		public StringBuffer reverse() 
		//删除当前字符串startIndex索引位置到endIndex索引位置的所有元素 （左闭右开）
		StringBuffer delete(int startIndex, int endIndex) 
		//获取指定位置上的字符
		public char charAt(int n )
		//将当前字符串n索引位置上的元素替换成ch
		public void setCharAt(int n ,char ch)
		//将当前字符串索引值startIndex到endIndex位置上的所有元素删掉换成str (左闭右开)
		StringBuffer replace( int startIndex ,int endIndex, String str) 
		//str在当前字符串中的首个索引位置。（从前向后）
		public int indexOf(String str)
		//截取子串 - 从当前字符串的start索引位置截取到end索引位置（左闭右开）
		public String substring(int start,int end)
		//字符串内容的长度
		public int length()

	 */
	@Test
	public void test(){
		//创建StringBuffer的对象
		StringBuffer sb = new StringBuffer();
		//调用方法
		sb.append("abcdefg");
//		sb.append("ccc");
//		sb.append(true);
//		String s = null;
//		sb.append(s);
		
//		sb.insert(1, "AAA");
		
//		sb.reverse();
		
//		sb.delete(1, 4);
		
//		sb.setCharAt(0, 'A');
		
		sb.replace(0, 4, "A");
		
		System.out.println(sb);
		System.out.println(sb.length());//字符串长度
	}
}















