package com.alibaba.array3Test.exer;

/*
 * 要求：(1)创建Person类的对象，设置该对象的name、age和sex属性，
 * 调用study方法，输出字符串“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 10;
		//输出年纪信息
		person.showAge();
		//将当前对象的年纪加2岁并返回age
		int age = person.addAge(2);
		System.out.println("age=" + age);
		//输出年纪信息
		person.showAge();
		
		
		Person p1 = new Person();
		p1.showAge();
	}
}

class Person{
	String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println("studying");
	}
	
	//方法的调用 ： 对象名.方法名
	//谁调用的方法，那么方法中调用的属性就是谁的
	public void showAge(){
		System.out.println(age);
	}
	
	public int addAge(int i){
//		age= age + i;
//		return age; // age = age + i;
		
		return age += i;
	}
}
