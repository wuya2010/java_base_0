package com.alibaba.classColse.exer;

import java.util.Scanner;

public class ComputerTest {

	public static void main(String[] args) {
		
		//读取数据
		Scanner s = new Scanner(System.in);
		System.out.print("请输入第一个整数:");
		int num1 = s.nextInt();
		System.out.print("请输入第二个整数：");
		int num2 = s.nextInt();
		
		//调用方法进行运算
		Computer computer = new Computer();
		computer.run(num1, num2);
	}
}

/*
 * 请输入第一个整数：10
请输入第二个整数：5

*************************************

	    小小计算器


*************************************

10 + 5 =15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
*/
class Computer{
	
	public void printLogo(){
		System.out.println("*************************************");
		System.out.println();
		System.out.println("              小小计算器");
		System.out.println();
		System.out.println("*************************************");
	}
	
	public void run(int num1,int num2){
		printLogo();//打印logo
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}






