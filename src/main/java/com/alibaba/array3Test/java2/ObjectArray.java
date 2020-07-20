package com.alibaba.array3Test.java2;

import java.util.Arrays;

/*
 	对象数组 ： 使用自定义类的类型的数组
 */
public class ObjectArray {

	public static void main(String[] args) {
		
		ObjectArray oa = new ObjectArray();
//		oa.test1();
		System.out.println("---------------通过使用循环给对象数组赋值--------");
		//数组中所有的元素都是同一个地址值
		oa.test2();
		//数组中所有的元素（地址值）都是不同的
		oa.test3();
	}
	
	public void test3(){
		System.out.println("---------------数组中所有的元素（地址值）都是不同的----------------");
		Person[] ps = new Person[5];
		for (int i = 0; i < ps.length; i++) {
			Person p = new Person();
			p.name = "化腾";
			p.age = 80;
			ps[i] = p;
		}
		
		ps[0].name = "马云";
		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i].name + " " + ps[i].age);
		}
	}
	
	public void test2(){
		System.out.println("---------数组中所有的元素都是同一个地址值----------");
		Person[] ps = new Person[5];
		Person p = new Person();
		p.name = "化腾";
		p.age = 80;
		//数组中所有的元素都是同一个地址值。
		for (int i = 0; i < ps.length; i++) {
			ps[i] = p;
		}
		
		ps[0].name = "马云";
		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i].name + " " + ps[i].age);
		}
		
	}

	public void test1() {
		// 创建一个Person类型的数组，数组中用来存放Person类型的对象
		Person[] ps = new Person[3];
		// 创建Person对象
		Person p = new Person();
		p.name = "化腾";
		p.age = 80;
		// 将对象放入数组中
		ps[0] = p;
		ps[1] = p;
		// 修改数组索引值为1的对象中的属性name为"马云"
		ps[1].name = "马云";

		System.out.println(ps[0].name);

		System.out.println(Arrays.toString(ps));
	}
}

class Person {
	String name;
	int age;
}
