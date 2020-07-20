package com.alibaba.array3Test.exer;

/*
 
  	利用面向对象的编程方法，设计类Circle计算圆的面积
 */
public class CicrleTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.radius = 1;
		System.out.println(circle.getArea());
		System.out.println(circle.getArea2(1));
	}
}

class Circle{
	
	
	double radius;
	
	
	/*
	 * 圆的面积
	 */
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	/*
	 * 设计上不合理 ： 同一个对象中无论如何计算，都应该保持属性（半径）的一致性。
	 */
	public double getArea2(double r){
		return Math.PI * r * r;
	}
	
	/*
	 * 周长
	 * 下面的方法设计不合理
	 */
	public double getZhouChang(double r){
		return 2 * r * Math.PI;
	}
	
	public double getZhouChang2(){
		return 2 * radius * Math.PI;
	}
}


















