package com.alibaba.threadApi.java;

import java.io.Serializable;


public class Person implements Serializable {

	/**
	 * 显示定义
	 */
	private static final long serialVersionUID = 2411523929630035447L;
	
	
	String name;
	transient int age; //transient修饰的属性该属性将不能被序列化
	Address address;
	int score;
	
	public Person(String name, int age,Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

class Address implements Serializable{
	
	int doorId;
	String street;
	
	public Address(int doorId, String street) {
		super();
		this.doorId = doorId;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [doorId=" + doorId + ", street=" + street + "]";
	}

	
}
