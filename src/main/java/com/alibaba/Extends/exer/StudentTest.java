package com.alibaba.Extends.exer;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Family family = new Family("北京市中关村",5);
		
		Student student = new Student(family, "小明同鞋", 10);
		
		//输出小明同鞋的家的地址
		System.out.println(student.family.address);
		
		Family f = student.family;
		System.out.println(f.address);
		
	}
}

class Family{
	String address;
	int member;
	
	public Family(String address,int member){
		this.address = address;
		this.member = member;
	}
}

class Student{
	Family family;
	String name;
	int age;
	public Student(Family family,String name,int age){
		this.family = family;
		this.name = name;
		this.age = age;
	}
}
