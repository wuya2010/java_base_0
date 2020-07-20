package com.alibaba.classMutilTai.java4;

/*
 	通过使用构造器给属性赋值（利用this(形参列表)调用本类中的其它构造器）
 */
public class ThisTest2 {

	public static void main(String[] args) {
		
		new Man("小龙哥", 20, '男', "宝安区").show();
	}
}

class Man {

	String name;
	int age;
	char gender;
	String address;

	public Man() {

	}

	public Man(String name) {
		this.name = name;
		System.out.println("Man(String name)");
	}

	public Man(String name, int age) {
		this(name);
		this.age = age;
		System.out.println(" Man(String name, int age) ");
	}

	public Man(String name, int age, char gender) {
		this(name,age);
		this.gender = gender;
		System.out.println("Man(String name, int age, char gender)");
	}

	public Man(String name, int age, char gender, String address) {
		this(name,age,gender);
		this.address = address;
		System.out.println(" Man(String name, int age, char gender, String address)");
	}
	
	public void show(){
		System.out.println(name + age + gender + address);
	}
}
