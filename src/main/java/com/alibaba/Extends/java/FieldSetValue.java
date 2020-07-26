package com.alibaba.Extends.java;

/*
 	属性赋值的方式 ： 1.默认值   2.显示赋值   3.构造器赋值   4.对象名.属性名/对象名.方法名
 	
 	赋值的顺序 ：1 ->  2 -> 3 -> 4
 */
public class FieldSetValue {

	public static void main(String[] args) {
		
		Number number = new Number();
//		number.setNum(30);
		number.showNum();
	}
}

class Number{
	int num = 10;
	
	public Number(){
		
	}
	
	public Number(int num){
		this.num = num;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void showNum(){
		System.out.println(num);
	}
}
