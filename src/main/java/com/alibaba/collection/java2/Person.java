package com.alibaba.collection.java2;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println(name + " " + age);
	}
	
	
	
	

	@Override
	public boolean equals(Object obj) {
		System.out.println("-------------equals------------------");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return "(" + name + "," + age + ")";
	}
}
