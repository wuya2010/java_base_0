package com.alibaba.classMutilTai.java4;

/*
 	类的成员之：构造器
 	
 	作用 ：1.创建对象  2.给对象进行初始化
 	
 	格式：
 		权限修饰符   类名(形参列表){
 		}
 		
 	说明：
 		1.如果一个类中没有显示的声明构造器，那么系统会自动创建一个空参的构造器
 		2.如果一个类中显示的声明了构造器，那么系统将不会再提供空参的构造器
 		3.一个类中可以有多个构造器，彼此之间构成重载
 		4.构造器中的代码只能执行一次。因为构造器是在new的时候进行调用的
 		
 	总结：1.创建对象必调构造器。
 */
public class ConstructorTest {

	public static void main(String[] args) {
		//思考: 如何调用构造器?
		Dog dog = new Dog(10);
		dog.name = "二哈";//调用属性
//		dog.show(); //调用方法
		
		System.out.println("---------------------给对象进行初始化--------------");
		//给对象进行初始化
		Cat cat = new Cat("小猫咪",'公',4);
		cat.info();
		//思考 ：即然可以通过构造器给属性赋值，那么还有提供setXxx,getXxx的必要吗？
		//通过方法给属性赋值当然有必要，可能以后还需要对该属性进行赋值（修改值）
		//通过构造器给属性赋值，只能赋值一次。
	}
}

class Cat{
	
	private String name;
	private char sex;
	private int legs;
	//空参的构造器
	public Cat(){
		
	}
	//有参的构造器
	public Cat(String n,char s,int l){
		name = n;
		sex = s;
		legs = l;
	}
	
	
	public void setName(String n){
		name = n;
	}
	
	public void info(){
		System.out.println("name=" + name + " sex=" + sex + " legs=" + legs);
	}
}

class Dog{
	
	String name;
	int month;
	
	//一个类中可以有多个构造器，彼此之间构成重载
	public Dog(){
		System.out.println(" Dog()");
	}
	
	//思考 ：为什么要将代码写到构造器中，方法中不可以吗？
	//构造器中的代码只能执行一次（同一个对象，在对象创建的时候），方法中的代码可以执行无数次
	//构造器(构造方法)
	public Dog(int a){
		System.out.println("Dog(int a)");
	}
	
	public void show(){
		System.out.println("name=" + name + " month=" + month);
	}
}














