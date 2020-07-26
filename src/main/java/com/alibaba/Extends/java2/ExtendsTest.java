package com.alibaba.Extends.java2;

/*
 	
 	面向对象特性之 ：继承性
 	
 	好处 ： 1.减少了代码的冗余    2.提高了代码的扩展性     3.为多态提供了前提
 	
 	格式 ：
 		A  extends B
 		A : 子类，SubClass
 		B : 父类，SuperClass,超类，基类
 	
 	说明：
 		1.子类继承父类以后就拥有了父类中的属性和方法
 		2.在封装的影响下，子类可能不能直获取父类中的属性，但是我们还是认为继承到了。我们可以通过间接的方式获取。
 		3.子类除了可以获取父类中的属性和方法外。还可以定义自己特有的属性和方法。
 		4.我们不认为子类可以继承父类中的构造器
 		5.父类分为直接父类和间接父类。
 		6.Object是所有类的父类。（如果一个类没有显示的继承其它类那么默认继承Object类）
 		7.一个子类只能继承一个父类（单继承）,但一个父类可以有多个子类。
 		8.如果子类要想继承父类必须存在 "is a"的关系
 */
public class ExtendsTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "京哥";
		person.age = 36;
		person.info();
		
		System.out.println("----------------------------");
		
		Student student = new Student();
		student.name = "小泽同鞋";
		student.age = 20;
		student.setSex(1);
		student.school = "清华大学";
//		student.sex = 1;
//		student.show();
//		student.info();
		//调用间接父类中的属性
		student.legs = 4;
		student.run();
		System.out.println(student.getSex());
		
		System.out.println("-------------------------------------");
		
		
	}
}

class Creature{
	int legs;
	public void run(){
		System.out.println("生物游起来");
	}
}

class Person extends Creature{
	String name;
	int age;
	private int sex;
	
	//构造器
	public Person(){
		
	}
	
	public void info(){
		System.out.println("name=" + name + " age=" + age);
	}
	
	public void setSex(int sex){
		this.sex = sex;
	}
	
	public int getSex(){
		return sex;
	}
}

class Student extends Person{
	
	String school;
	
	public void show(){
		System.out.println("name=" + name + " age=" + age);
	}
}


class SuperClass extends Person{
	
}

















