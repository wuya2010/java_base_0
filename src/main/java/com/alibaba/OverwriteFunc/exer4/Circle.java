package com.alibaba.OverwriteFunc.exer4;

/*
 * Circle(): 构造方法,将radius属性初始化为1
+setRadius(double radius) : void
+getRadius(): double
+findArea():double  计算圆的面积

 */
public class Circle {

	private double radius;
	
	public Circle(){
		radius = 1;
	}
	
	/**
	 * 计算圆的面积
	 * @return
	 */
	public double findArea(){
		
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
