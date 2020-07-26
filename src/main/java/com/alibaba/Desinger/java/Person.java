package com.alibaba.Desinger.java;

public class Person {

	String name;
	int age;
	
	public Person() {
	
	}
	
	@Override
	public String toString() {
		return "(" + name + " " + age + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Person){
			//向下转型
			Person p = (Person) obj;
			//比较属性内容
			return this.age == p.age && this.name.equals(p.name);
		}
		return false;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void show(){
		System.out.println("name=" + name + " age=" + age);
	}
}
