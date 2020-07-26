package com.alibaba.OverwriteFunc.java3;

/*
 * 通过子类的构造器调用父类的构造器给父类中的属性赋值
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Women women = new Women(20,"志玲","中国台湾");
		women.say();
	}
}

class Person{
	
	private String name;
	private String address;
	
	public Person(String name,String address){
		this.name = name;
		this.address = address;
		
	}
	
	public Person(){
		
	}
}

class Women extends Person{
	int age;
	
	public Women(){
		
	}
	
	public Women(int age,String name,String address){
		//通过调用父类中有参的构造器，给父类中的属性进行赋值
		super(name,address);
		this.age = age;
	}
	
	public void say(){
//		System.out.println(name + " " + address + " " + age);
	}
}
