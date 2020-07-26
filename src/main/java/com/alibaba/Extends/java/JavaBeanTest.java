package com.alibaba.Extends.java;

/*
	JavaBean : 所谓javaBean，是指符合如下标准的Java类：
		1.类是公共的
		2.有一个无参的公共的构造器
		3.有属性，且有对应的get、set方法

 */
public class JavaBeanTest {

	String name;
	int age;
	
	public JavaBeanTest(){
		
	}
	

	public JavaBeanTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
