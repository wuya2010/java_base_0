package com.alibaba.array2Test.exer;

/*
练习二
创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,   后10个元素放置'0'-'9‘。
使用for循环访问所有元素并打印出来。
 */
public class Demo2 {

	public static void main(String[] args) {
		
		char[] c = new char[36];
		
		char ch = 'A';
		
		char ch2 = '0'; //记住存放的是字符'0'不是unicode值的0对应的字符
		
		//给数组赋值
		for (int i = 0; i < c.length; i++) {
			
			if(i < 26){ //赋值'A'-'Z‘
				c[i] = ch;
				ch++;
			}else{//赋值'0'-'9‘
				c[i] = ch2;
				ch2++;
			}
		}
		
		//遍历
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
