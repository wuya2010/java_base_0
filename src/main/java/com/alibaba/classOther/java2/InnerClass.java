package com.alibaba.classOther.java2;



/*
 	类的成员之 ： 内部类
 	
 	内部类 ： 在一个类A的内部再定义一个类B，那么类B叫做内部类，类A叫做外部类
 	
 	内部类 ： 成员内部类  vs 局部内部类
 		       成员内部类 : 静态（成员）内部类 vs非静态（成员）内部类
 		       
 	内部类作为
 			类 ：
 				1.内部类中有类的成员：属性，方法....
 				2.可以被继承，也可以继承其它类......
 			成员：
 				1.四种权限修饰符都可以使用
 				2.内部类可以访问外部类中的成员（属性和方法）。
 				
 	内部类主要学习的内容有：
 		 1.如何创建内部类的对象
 		 2.内部类如何访问外部类的属性和方法
 		 3.局部内部类的使用		
 */

public class InnerClass {

	public static void main(String[] args) {
		//一 如何创建内部类的对象
		//1.创建非静态内部类的对象 ： 外部类的对象.new 内部类名();
		//创建外部类的对象
		A a = new A();
		//再创建内部类的对象
		A.B b = a.new B();
		
		//2.创建静态内部类的对象 : new 外部类名.内部类名();
		A.C  c = new A.C();
		
//		b.show();
//		c.show();
		
		System.out.println("----------------------------------------");
		
		//2.内部类如何访问外部类的属性和方法
		//非静态内部类调用外部类的属性和方法 ：  外部类名.this.属性名/方法名
		b.show("b show");
		//调用外部类的类变量和静态方法 ： 外部类名.类变量名/静态方法名
		c.show();
		
		System.out.println("----------------------------------------");
		//3.局部内部类的使用
		InnerClass innerClass = new InnerClass();
		//思考 ： 获取局部内部类的对象是否可以向下转型？ 不可以
		SuperClass superClass = innerClass.showInnerClass();
		superClass.show();
		
	}
	
	/**
	 * 局部内部类的使用(了解即可)
	 * 1.如何获取局部内部类的对象 ： 让局部内部类去继承其它外部类。然后方法返回的类型是父类的类型即可。
	 */
	public SuperClass showInnerClass(){
		class Person extends SuperClass{
			public void show(){
				System.out.println("person show");
			}
		}
		
		return new Person();
	}
}

abstract class SuperClass{
	abstract void show();
}

//外部类
class A{
	
	String name = "A";
	static int age;
	
	//非静态内部类 : 可以调用外部类的类变量和静态方法
	class B{
		String name = "B";
		public void show(String name){
			//调用外部类的属性 ： 外部类名.this.属性名
			System.out.println(name + " --- " + this.name + " ----" + A.this.name);
			//调用外部类的方法 : 外部类名.this.方法名
			A.this.info();
		}
	}
	
	//静态内部类 : 只能调用外部类的静态方法和类变量
	static class C{
		public void show(){
			//调用外部类的类变量和静态方法 ： 外部类名.类变量名/静态方法名
			System.out.println(A.age);
			A.say();
		}
	}
	
	public static void say(){
		System.out.println("A static say");
	}
	
	public void info(){
		System.out.println("A info");
	}
}



















