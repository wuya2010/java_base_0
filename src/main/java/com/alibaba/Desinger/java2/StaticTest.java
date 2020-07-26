package com.alibaba.Desinger.java2;

/*
 	关键字 ：static
 	
 	一 static可以修饰 ：属性，方法，代码块，内部类
 	
 	二  成员变量 ： 实例变量（不是static修饰的）  vs 类变量(static修饰的)
 	
 	三 static修饰属性 ：类变量
 		1.类变量是随着类的加载而加载的。类的加载优先于对象的创建
 		2.同一个类的多个对象，每个对象各自拥有一份实例变量，共同拥有一份类变量。
 		3.当其中的某一个对象对类变量进行修改后，其它的对象看到的都是修改后的类变量。
 		4.类变量的调用 ：对象名.属性名，类名.类变量名
 		
 	四 static修饰方法
 		1.静态方法是随着类的加载而加载的
 		2.静态方法的调用 ： 类名.静态方法名,对象名.静态方法名
 		3.静态方法中只能调用类变量和静态方法。非静态方法中可以调用类变量和静态方法。
 		4.静态方法中不能使用"this"和"super"关键字
 	
 	五 思考：什么时候使用static修饰属性和方法？
 		static修饰属性 ： 
 			1.变量作为常量时必须使用static修饰 ： 例 - public static final double PI = 3.14159265358979323846;
 			2.当多个对象需要共同拥有一份属性的时候需要使用static修饰
 		static修饰方法：
 			1.作为工具类中的方法时需要使用static修饰
 			2.有时为了调用类变量会将方法设置成静态方法
 */
public class StaticTest {

	public static void main(String[] args) {
		//类名.类变量名
		Person.nation = "中国";
		
		Person p1 = new Person();
		p1.name = "健林";
		p1.age = 58;
//		p1.nation = "中国";
		
		Person p2 = new Person();
		p2.name = "化腾";
		p2.age = 38;
		
		Person p3 = new Person();
		p3.name = "马云";
		p3.age = 48;
//		p3.nation = "大中国";
		
		p1.show();
		p2.show();
		p3.show();
		
		System.out.println("-----------------静态方法------------------");
		//类名.方法名
		Person.info();
		p1.info();
		p2.info();
		p3.info();
		
		System.out.println("---------------------------------");
		
		Person.info();
	}
}

class Person{
	//实例变量
	String name;
	//实例变量
	int age;
	//类变量
	static String nation;
	
	public Person(){
		
	}
	
	/*
	 * 非静态方法
	 * 1.非静态方法中可以调用类变量和静态方法
	 */
	public void show(){
		System.out.println("name=" + name + " age=" + age + " nation=" + nation);
	}
	
	/*
	 * 静态方法
	 * 1.静态方法中不能调用实例变量 （因为类加载优先于对象的创建）
	 * 2.静态方法中不能调用非静态方法
	 * 3.静态方法中只能调用类变量和静态方法
	 * 4.静态方法中不能使用this和super关键字
	 */
	public static void info(){
		System.out.println("info" + nation);
		//不能调用非静态方法
//		show();
	}
}














