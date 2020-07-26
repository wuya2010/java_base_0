package com.alibaba.Desinger.exer2;

/*
 * 定义一个类Animal
还需要一个show方法。

定义Dog,Cat类分别继承Animal并重写show方法。

Dog要求定义属性int legs;

Cat要求定义run方法（无返回值无参）
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest at = new AnimalTest();
		at.test(new Dog());
	}
	
	public void test(Animal animal){
		animal.show();
		//需要调用子类对象中特有的属性或方法
		if(animal instanceof Dog){
			Dog dog = (Dog) animal;
			System.out.println(dog.legs);
		}else if(animal instanceof Cat){
			Cat cat = (Cat) animal;
			cat.run();
		}
	}
}

class Dog extends Animal{
	int legs = 4;
	@Override
	public void show() {
		System.out.println("Dog show");
	}
}

class Cat extends Animal{
	@Override
	public void show() {
		System.out.println("cat show");
	}
	
	public void run(){
		System.out.println("Cat run");
	}
}

class Animal{
	
	public void show(){
		System.out.println("Animal show");
	}
}
