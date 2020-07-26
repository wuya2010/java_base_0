package com.alibaba.ioTest.java4;

import java.io.Serializable;

/*
 	需要序列化的对象所在的类：
 	1.该类必须实现Serializable接口
 	2.该类中的引用数据类型的属性也必须实现Serializable接口
 	3.需要显示提供一个serialVersionUID可以不显示定义（系统会自动提供一个），但是强列建议显示定义
 	(如果是系统自动提供的，一旦类中发生改变，那么系统提供的序列号将会发生改变。再进行反序列化
 			serialVersionUID改变前的对象将会失败，因为两个序列化不一致)
 */
public class Person implements Serializable {

	/**
	 * 显示定义
	 */
	private static final long serialVersionUID = 2411523929630035447L;
	
	
	String name;
	int age;
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
