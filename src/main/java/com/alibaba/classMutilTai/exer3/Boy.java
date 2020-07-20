package com.alibaba.classMutilTai.exer3;

public class Boy {

	private String name;
	private int age;
	
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void marry(Girl girl){
		System.out.println(this.name + ":" + girl.getName() + "我们今晚就结婚");
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
