package com.alibaba.classMutilTai.exer;

public class Demo {

	/*
	 * 4.求两个double，三个double，四个double的最大值



	 */
	
	public double max(double a,double b){
		return (a > b)? a : b;
	}
	
	public double max(double a,double b,double c){
		double maxNumber = max(a,b);
		return (maxNumber > c)? maxNumber : c;
	}
	
	public double max(double a,double b,double c,double d){
		double maxNumber = max(a,b,c);
		return (maxNumber > d)? maxNumber : d;
	}
}
