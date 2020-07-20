package com.alibaba.classMutilTai.java4;

/*
 	关键字 ：this(表示当前对象)
 	
 	this可以修饰：属性，方法，构造器
 	
 	this修饰属性和方法：
 		当我们通过方法或构造器调用属性时，属性前可以默认省略掉"this."，如果局部变量和属性的名字一样时。
 		那么"this."不可以省略。因为需要通过"this."来区分属性和局部变量。
 	
 	this修饰构造器：
 		格式 ：this(形参列表)
 		作用 ：用来调用本类中的其它构造器
 		说明：
 			 1.只能放在构造器的首行的位置 
 			 2.一个构造器中最多只能有一个this(形参列表)
 			 3.如果一个类中有N个构造器，那么最多只能有N-1个this(形参列表)
 */
public class ThisTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("隔壁老王");
		p.show();
		
		Person p2 = new Person();
		p2.setName("隔壁老张");
		p2.show();
		
		System.out.println("-----------------------------------");
		
		p.say();
		p2.say();
		
		System.out.println("----------------通过调用构造器给属性赋值--------");
		
//		Person2 per = new Person2(1);
//		per.show();
		
		System.out.println("----------------this调用构造器--------------");
		
		new Person2(10,10);
	}
}

class Person2{
	int sex;
	
	/*
	 * 构造器
	 * 注意 ： 如果一个类中有N个构造器，那么最多只能有N-1个this(形参列表)
	 */
	public Person2(){
		System.out.println("Person2()");
		System.out.println("志玲姐姐么么哒");
	}
	/*
	 * 构造器
	 */
	public Person2(int sex){
		this();//调用当前类中的空参构造器
		System.out.println("Person2(int sex)");
	}
	/*
	 * 构造器
	 */
	public Person2(int sex,int age){
		this(sex); //注意 ： 1.只能放在构造器的首行的位置  2.一个构造器中最多只能有一个this(形参列表)
		System.out.println("Person2(int sex,int age)");
		
	}
	
	public void show(){
		System.out.println(sex);
	}
}

class Person{
	
	String name;
	int age;
	
	//构造器
	public Person(){
		
	}
	
	public void say(){
		//谁调用的say方法，那么还用谁调用run方法
		this.run();
//		run(); //默认省略掉了"this."
	}
	
	public void run(){
		System.out.println("run" + name);
	}
	
	//方法
	public void setName(String name){
//		name = name;  就近原则（如果局部变量和属性的名字一样，那么使用的是局部变量）
		//this表示当前对象（谁调用的这个方法那么对象就是谁）
		this.name = name;//如果局部变量和属性名一样的时候。如果需要调用属性，则必须加上"this."
	}
	
	public void info(){
		int a = 20;
	}
	
	public void show(){
		System.out.println("name=" + this.name);
		//调用属性时可以不加"this."默认前面也会自动加上"this."
		System.out.println("name=" + name);
	}
	
}



























