package com.alibaba.classColse.java;

/*
 
 	一  面向对象 vs 面向过程
 	 	面向对象 ：将功能封装进对象，强调具备了功能的对象
 	 	面向过程：强调的是功能行为
 	 
 	二 Java语言的基本元素：类和对象
 		类 ：类是对一类事物的描述，是抽象的、概念上的定义
 		对象： 对象是实实在在的个体。(是new出来的，是由类派生出来的)
 		
 	三 类的成员之 ：属性和方法
 		属性 = field = 成员变量
 		方法 = method = 函数
 		
 	四 面向对象的落地实现：
 		1.创建一个类并提供必要的属性和方法
 		2.通过类创建对象 （new 出来的）
 		3.调用对象的属性和方法。（对象名.属性名/方法名()）

 */
public class OOP {

	public static void main(String[] args) {
		//通过类创建对象
		//p是对象的名字 ，new Person()是对象，我们习惯性的叫做p对象
		Person p = new Person();
		//给对象中的属性赋值 : 对象名.属性名 = 数据
		p.name = "小龙哥";
		p.age = 16;
		p.sex ='男';
//		调用方法 : 对象名.方法名()
		p.run();
		p.show();
		
		Person p2 = new Person();
		p2.name = "小苍姐";
		p2.age = 18;
		p2.sex = '女';
		p2.run();
		p2.show();
		
	}
}





















