package com.alibaba.OverwriteFunc.exer4;

/*
 * 
 * 注意 ： 以后只要调用父类中的方法或属性一定要加上"super."
 * 
Cylinder():  构造方法,将length属性初始化为1
+setLength(double length):void
+getLength():double
+findVolume() :double   计算圆柱体积

 */
public class Cylinder extends Circle {

	private double length;
	
	public Cylinder(){
		this.length = 1;
	}
	
	/**
	 * 重写父类的findArea方法求圆柱的表面积
	 */
	@Override
	public double findArea() {
		
		return super.findArea() * 2 + Math.PI * 2 * getRadius() * length;
	}
	
	/**
	 * 圆柱的体积
	 * @return
	 */
	public double findVolume(){
		return super.findArea() * length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
}
