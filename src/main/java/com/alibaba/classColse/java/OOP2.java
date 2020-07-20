package com.alibaba.classColse.java;

/*
 	内存解析 ：
 		通过一个类创建多个对象，每个对象单独拥有一份属性。对其中的一个对象中的属性进行修改不会影响到其它对象中的属性。
 */
public class OOP2 {

	public static void main(String[] args) {
		
		System.out.println("-------------------内存解析---------------");
		Person p = new Person();
		p.name = "aa";
		p.age = 12;
		
		Person p2 = new Person();
		p2.name = "cc";
		p2.age = 20;
		
		Person p3 = p2;
		p3.name = "dd";
		
		p.test(); //aa 12
		p2.test();//dd 20
		p3.test();//dd 20
		
		System.out.println("-----------------匿名对象----------------------");
		//匿名对象 ： 没有名字的对象。
		//特点 ：只能调用一次
		//使用场景 ： 往往作为实参传递给方法的形参（暂时先知道即可）。
		new Person().name = "无名";
		new Person().test();
		
	}
}

/*
 * The type Person is already defined
 * 注意 ： 在同一个包中类名不能相同
class Person{
	
}
*/
