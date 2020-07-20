package com.alibaba.classMutilTai.java;

/*
  	对象的关联 : 一个对象中的属性存储的是另一个对象的地址值
 */
public class ObjectConnect {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "二哈";
		dog.month = 20;
		
		
		Dog dog2 = new Dog();
		dog2.name = "泰迪";
		dog2.month = 20;
		
		Dog dog3 = new Dog();
		dog3.name = "中华田园犬";
		dog3.month = 20;
		
		
		Teacher teacher = new Teacher();
		teacher.name = "苍老师";
		teacher.age = 20;
		//让teacher对象和dog对象产生了关系
		teacher.dog = dog2;
		
		System.out.println("---------------获取苍老师家狗的信息-----------------------");
		
		//输出苍老师家的狗的信息
		//第一种方式
		//获取苍老师家的狗
		Dog d = teacher.dog;
		//输出狗信息
		System.out.println(d.name);
		System.out.println(d.month);
		
		//第二种方式 ： 和上面的第一种方式一样。
		System.out.println(teacher.dog.name);
		System.out.println(teacher.dog.month);
		
		System.out.println("-------------修改苍老师家狗的信息-------------------");
		
		teacher.dog.name = "金毛";
		System.out.println(teacher.dog.name);
	}
}

class Teacher{
	Dog dog;
	String name;
	int age;
}


class Dog{
	String name;
	int month;
}