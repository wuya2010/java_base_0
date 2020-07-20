package com.alibaba.array3Test.java;

/*
 	值传递（引用数据类型）
 */
public class ValueTransfer2 {

	public static void main(String[] args) {
		
		
		ValueTransfer2 vt = new ValueTransfer2();
		//创建Number类型的对象
		Number number = new Number();
		number.m = 10;
		number.n = 5;
		System.out.println("交换前m=" + number.m + " n=" + number.n);
		//调用方法交换属性的值
		vt.swapData(number);
		System.out.println("交换后m=" + number.m + " n=" + number.n);
	}
	
	/*
	 * 交换Number对象中属性的值
	 */
	public void swapData(Number number){
		int temp = number.m;
		number.m = number.n;
		number.n = temp;
	}
	
}

class Dog{
	
}

class Number{
	int m;
	int n;
}
