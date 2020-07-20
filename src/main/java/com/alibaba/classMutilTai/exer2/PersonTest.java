package com.alibaba.classMutilTai.exer2;

public class PersonTest {

	public static void main(String[] args) {
		
		new Person("有朋",89).show();
		new Person().show();
	}
}

class Person{
	
	String name;
	int age;
	
	public Person(String n,int a){
		name = n;
		age = a;
	}
	
	public Person(){
		age = 18;
	}
	
	public void show(){
		System.out.println("age=" + age);
	}
}
