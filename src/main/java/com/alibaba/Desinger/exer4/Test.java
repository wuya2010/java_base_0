package com.alibaba.Desinger.exer4;

public class Test {

	public static void main(String[] args) {
		
		Circle circle = new Circle("yellow", 2.0, 3.5);
		Circle circle2 = new Circle("red", 3.0, 3.5);
		
		System.out.println(circle.equals(circle2));//true
		
		System.out.println(circle);
		System.out.println(circle2);
	}
}
