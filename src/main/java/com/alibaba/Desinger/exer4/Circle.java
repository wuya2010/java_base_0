package com.alibaba.Desinger.exer4;

public class Circle extends GeometricObject{

	private double radius;

	/**
	 * 初始化值 ： 初始化对象的color属性为“white”，weight属性为1.0，radius属性为1.0。

	 */
	public Circle() {
		super();
		this.radius = 1.0;
	}

	/**
	 * 
	 * 初始化值 ： 初始化对象的color属性为“white”，weight属性为1.0
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, double weight,double radius) {
		super(color, weight);
		this.radius = radius;
	}
	
	/**
	 * 求圆的面积
	 * @return
	 */
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
	/**
	 * 重写equals比较圆的半径
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Circle){
			//向下转型
			Circle c = (Circle) obj;
			return this.radius == c.radius;
		}
		return false;
	}
	
	/**
	 * 重写toString输出圆的半径
	 */
	@Override
	public String toString() {
		return "radius=" + radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
