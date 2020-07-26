package com.alibaba.OverwriteFunc.java3;

public class ExtendsTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.name = "二哈";
		animal.age = 10;
		
		Dog dog = new Dog();
		dog.legs = 4;
		dog.info();
	}
}

class Animal{
	
	String name;
	int age;
}

class Dog extends Animal{
	
	int legs;
	
	public void info(){
		System.out.println("name=" + name + " age=" + age + " legs=" + legs);
	}
}
