package com.alibaba.String.java2;

import java.util.Arrays;

import org.junit.Test;

public class StringAPI {
	
	/*
	 toCharArray() ： 将字符串转成char[]
	 getBytes() : 将字符串转成byte[]
	 */
	@Test
	public void test6(){
		//将字符串转成char[]
		String str = "abcdefg";
		//toCharArray() ： 将字符串转成char[]
		char[] charArray = str.toCharArray();
		
		//将char[]转成字符串 
		String str2 = new String(charArray);
		//将char[]转成字符串 - 将数组中索引为0开始长度为3的所有元素转成字符串
		str2 = new String(charArray, 0, 3);
		System.out.println(str2);
		
		System.out.println("------------------------------");
		
		String s = "aaabcdef";
		//将String转成byte[]
		byte[] bytes = s.getBytes();
		//将byte[]转成String
		s = new String(bytes);
	}
	
	/*
	 * toUpperCase(); 将字符串中的内容全部转成大写
	 * toLowerCase() ; 将字符串中的内容全部转成小写
	 * equalsIgnoreCase(String s) : 将当前字符串和s进行内容比较忽略大小写
	 */
	@Test
	public void test5(){
		System.out.println("abcdefg".toUpperCase());
		System.out.println("ABcDefg".toLowerCase());
		System.out.println("Abc".equalsIgnoreCase("abc"));
	}
	/*
	public boolean regionMatches
			(int firstStart,String other,int otherStart ,int length)
			
		功能 ：两个字符串的匹配 -  other的子串（otherStart开始长度为length）
					是否是当前字符串的子串（firstStart位置开始）的开头。
	*/
	@Test
	public void test4(){
		System.out.println("abcdefg".regionMatches(1, "bcdddd", 0, 3));
	}
	
	/*
	 *
//截取子串 ：从索引值为startpoint的位置到最后一个元素
public String substring(int startpoint)
//截取子串 ：从索引值为start的位置到end的位置(包头不包尾，左闭右开 [start,end))
public String substring(int start,int end)
//将当前字符串中的oldChar替换成newChar
pubic String replace(char oldChar,char newChar)
//将当字符串中的old替换成new
public String replaceAll(String old,String new)
//去除字符串两端的空格
public String trim()
//字符串拼接
public String concat(String str)
//当前字符串中是否包含s
public boolean contains(CharSequence s)
//字符串按照某个规则(regex - 字符串)进行切割
public String[] split(String regex)

	 */
	@Test
	public void test3(){
		String[] split = "a-bc-d-e".split("-");
		System.out.println(Arrays.toString(split));
	}
	@Test
	public void test2(){
		System.out.println("abcdefg".substring(2));
		
		System.out.println("abcdefg".substring(1, 5));
		
		System.out.println("aabdef".replace('a', 'A'));
		
		System.out.println("abcdefg".replaceAll("abc", "ABCDEFG"));
		
		System.out.println("    c   d      ".trim());
		
		System.out.println("abc".concat("11"));
		
		System.out.println("abcdefg".contains("abcc"));
	}

	/*
//字符串内容的长度
public int length()
//获取指定位置上的字符
public char charAt(int index)
//比较字符串内容 - 严格区分大小写
public boolean equals(Object anObject)
//理解就可以 - 比较字符串内容
public int compareTo(String anotherString)
//s在当前字符串中的首个位置（从前向后）
public int indexOf(String s)
//从当前字符串中的startpoint的位置（从前向后）开始查找s在当前字符串的位置
public int indexOf(String s ,int startpoint)
////s在当前字符串中的首个位置（从后向前）
public int lastIndexOf(String s)
//从当前字符串中的startpoint的位置（从后向前）开始查找s在当前字符串的位置
public int lastIndexOf(String s ,int startpoint)
//当前字符串是否以prefix开头
public boolean startsWith(String prefix)
//当前字符串是否是以suffix结尾
public boolean endsWith(String suffix)
	 */
	@Test
	public void test(){
		//字符串内容的长度
		System.out.println("abc".length());
		//获取指定位置上的字符
		System.out.println("abc".charAt(0));
		////理解就可以 - 比较字符串内容
		System.out.println("a".compareTo("b"));
		////s在当前字符串中的首个位置（从前向后）
		System.out.println("abcdbcefbc".indexOf("bc"));
		//从当前字符串中的startpoint的位置（从前向后）开始查找s在当前字符串的位置
		System.out.println("abcdbcefbc".indexOf("bc",2));
		//s在当前字符串中的首个位置（从后向前）
		System.out.println("abcdbcefbc".lastIndexOf("bc"));
		////从当前字符串中的startpoint的位置（从后向前）开始查找s在当前字符串的位置
		System.out.println("abcdbcefbc".lastIndexOf("bc",7));
		////当前字符串是否以prefix开头
		System.out.println("prefixaaaa".startsWith("pr"));
		//当前字符串是否是以suffix结尾
		System.out.println("aaaaaaaasuffix".endsWith("suffix"));
	}
}
















