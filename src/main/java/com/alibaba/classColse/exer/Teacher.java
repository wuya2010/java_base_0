package com.alibaba.classColse.exer;

public class Teacher {

	/*
	 * name:String
		age:int
		teachAge:int
		course:String

	 */
	String name;
	int age;
	int teachAge;
	String course;
	
	
	public String say(){
		
		String str = name + " " + age + " " + teachAge + " " + course;
		
		return str;
	}
	
	
}
