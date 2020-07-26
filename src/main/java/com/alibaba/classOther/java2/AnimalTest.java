package com.alibaba.classOther.java2;

/*
 * 多态
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Dog();
//		a.say();
		a.show();
		
	}
}
class Dog extends Animal{
	@Override
	public void say() {
		System.out.println("dog say");
	}
}

class Animal{
	public void show(){
		System.out.println("animal show");
		say();
	}
	
	public void say(){
		System.out.println("animal say");
	}
}
