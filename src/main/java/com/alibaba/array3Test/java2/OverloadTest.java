package com.alibaba.array3Test.java2;

/*
 	方法的重载 ：同一个类中，相同的方法名，不同的形参列表构成方法的重载
 	
 	说明：
 		1.两同一不同 ：
 			两同 ： 同一个类，相同的方法名。
 			一不同 ：形参列表不同
 		2.形参列表的不同 ：形参的类型，形参的个数，形参列表的顺序。
 		3.方法的重载和返回值类型，权限修饰符，形参的名字无关
 		4.如何确定调用的是哪个方法 ： 方法名 + 形参列表
 	
 */
public class OverloadTest {

	public static void main(String[] args) {
		OverloadTest ot = new OverloadTest();
		ot.add(1, 1);
	}
	
	public void add(int a,int b){
		System.out.println("int a,int b");
		System.out.println(10);
	}
	
	public void add(double a,double b){
		System.out.println("double a,double b");
	}
}

/*
 * 不可以构成方法的重载
 */
class Computer2{
	
	public void add(int a, int b) {
		System.out.println(a + b);
	
	}
	
	//方法的重载和返回值类型无关
//	public int add(int a, int b) {
//		return a + b;
//	}
	//方法的重载和权限修饰符无关
//	private void add(int a, int b) {
//		System.out.println(a + b);
//	}
	//方法的重载和形参的名字无关
//	public void add(int aa, int bb) {
//		
//	}
}

/*
 * 可以构成方法的重载
 */
class Computer {

	// 需求：求两个int类型数值的和
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) { // 个数不同
		System.out.println(a + b + c);
	}

	public void add(char c, float f) {// 类型不同

	}

	public void add(float f,char c) {// 顺序不同

	}

	// 需求：求两个double类型数值的和
	public void add(double a, double b) {
		System.out.println(a + b);
	}
}
