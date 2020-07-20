package com.alibaba.array3Test.java;

/*
 	使用字符串时的小细节
 */
public class StringTest {

	public static void main(String[] args) {
		
		String str = "abc";
		str =  null;
		//1.严格区分大小写
		//2.下面的写法可以避免空指针的问题。
		System.out.println("abc".equals(str));
		
		System.out.println("-----------------------------------");
		
		/*
		 * 后边再解释
		 */
		String s = "abc";
		
		StringTest st = new StringTest();
		st.test(s);
		
		System.out.println(s);
	}
	
	
	public void test(String str){
		str = "ccc";
	}
}
