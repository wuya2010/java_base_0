package com.alibaba.Desinger.java2;

public class StaitcTest2 {

	public static void main(String[] args) {
		
		new Computer().show();
		new Computer().show();
		new Computer().show();
		new Computer().show();
		Computer computer = new Computer();
		computer.show();
		
		System.out.println("-------------------------------");
		
		Student s = new Student("aa",18);
		Student s2 = new Student("bb",20);
		Student s3 = new Student("c",30);
		
		s.show();
		s2.show();
		s3.show();
	}
}

/**
 * 思考 ： 哪些属性可以共同拥有，哪些属性不能共同拥有？
 * 
 * 自动给id赋值
 */
class Student{
	int id;
	String name;
	int age;
	
	static int count = 0;
	
	public Student(String name,int age){
		id = ++count;
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println(id + " " + name + " " + age);
	}
}

/**
 *  需求 : 统计一个类创建的对象的个数
 */
class Computer{
	static int count;
	
	public Computer(){
		count++;
	}
	
	public void show(){
		System.out.println(count);
	}
}















