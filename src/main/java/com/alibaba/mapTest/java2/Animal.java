package com.alibaba.mapTest.java2;

public class Animal {

	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "(" + name + "," + age + ")";
	}

	
}
