package com.alibaba.Desinger.exer;

public class AnimalTest {

}
/*
 * 3.创建一个Animal类有属性 String name; String species;
	定义一个run()和一个eat()
  定义一个子类Bird类继承Animal。声明属性int sex;
	Bird类要求重写父类中的run()和eat()
	通过Bird构造器给属性赋值（包括父类中的属性）。
	要求在run()方法中调用父类的run()
	*/

class Bird extends Animal{
	int sex;
	
	public Bird(int sex,String name,String species){
		super(name, species);
		this.sex = sex;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("Bird run");
	}
	@Override
	public void eat() {
		System.out.println("Bird eat");
	}
}

class Animal{
	String name;
	String species; //物种
	
	public Animal(String name,String species){
		this.name = name;
		this.species = species;
	}
	public void run(){
		System.out.println("Animal run");
	}
	
	public void eat(){
		System.out.println("Animal eat");
	}
}
