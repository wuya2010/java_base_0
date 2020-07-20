package com.alibaba.array3Test.exer;

/*
 	
5.1 编写程序，声明一个method方法，在方法中打印一个10*8 的矩形，在main方法中调用该方法。

5.2 修改上一个程序，在method方法中，除打印一个10*8的矩形外，再计算该矩形的面积，
并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

5.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的矩形，
并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

 */
public class Demo {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		demo.method();
		demo.method2();
		demo.method();
		
	}
	
	public int method3(int m,int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return m * n;
	}
	
	public void method(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public int method2(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return 10 * 8;
	}
}
