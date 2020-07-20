package com.alibaba.array3Test.java;

/*
 	值传递：
 	
 	思考的问题 ： 当我们调用方法时，给方法传递参数的问题（传基本数据类型和引用数据类型出现的问题）？
 	
 	形参：方法声明时的参数
	实参：方法调用时实际传给形参的参数值

 	总结：
 		当我们调用方法时如果传递给形参的是基本数据类型，那么就是将变量的具体的值赋值给了形参的那个变量
 					（不会对原来的变量产生影响）
 		当我们调用方法时如果传递给形参的是引用数据类型，那么就是将对象的地址值传递给了形参的那个变量
 					（会对原来的变量产生影响）
 		
 */
public class ValueTransfer {

	public static void main(String[] args) {
		
		ValueTransfer vt = new ValueTransfer();
		//需求 ： 交换两个变量的数据
		int m = 5,n = 10;
		//调用方法交换数据
		vt.swapData(m, n); //实参
		System.out.println("main交换后m=" + m + " n=" + n);
	}
	
	/*
	 * 交换两个变量的数据（基本数据类型）
	 */
	public void swapData(int m,int n){//形参
		System.out.println("swap交换前m=" + m + " n=" + n);
		int temp = m;
		m = n;
		n = temp;
		System.out.println("swap交换后m=" + m + " n=" + n);
	}
}











