package com.alibaba.OverwriteFunc.java2;

/*
 	关键字 ：super
 	
 	一 作用 ：super是用来调用父类中的属性，方法，构造器
 	
 	二 super可以调用属性，方法
 		当子类继承父类以后，我们可以在子类的构造器和方法中，通过使用"super."调用父类中的属性和方法
 		通常情况下我们也会省略掉"super."。但是如果子类和父类中的属性名相同或者子类重写了父类中的方法。
 		那么我们再调用 父类中的属性和方法就必须使用"super."
 	
 	三 super调用构造器
 		格式 ：super(形参列表)
 		作用 ：调用父类中的构造器
 		说明：
 			1.super(形参列表)只能放在构造器的首行
 			2.在子类的同一个构造器中只能有一个super(形参列表)
 			3.在子类的同一个构造器中super(形参列表)和this(形参列表)只能有一个（因为都只能放在首行）
 			4.如果在一个构造器中即没有this(形参列表)也没有super(形参列表)那么默认调用的是super()
 		
 	总结 ： 在创建子类对象的时候必调父类的构造器。
 	
 	四 常见问题
 	
 		Implicit super constructor AA() is undefined. 
  		Must explicitly invoke another constructor
  
  		解决方式一 ：
  				父类提供一个空参构造器
  		解决方式二：
  				子类构造器显示调用父类的其它构造器
 */
public class SuperTest {

	public static void main(String[] args) {
		
		SubClass subClass = new SubClass();
		subClass.show();
		subClass.info();
	}
}

class SuperClass{
	String name = "superClass";
	int age = 10;
	
	public void info(){
		System.out.println("superclass info");
	}
}

class SubClass extends SuperClass{
	String name = "subClass";
	int age = 20;
	
	@Override
	public void info(){
		super.info();//调用父类中的info方法
		System.out.println("subClass info");
	}
	
	public void show(){
		//调用父类中的name
		System.out.println(super.name);//父类中的name
		System.out.println(name); //本类中的name
		//思考 ： age前面省略的是"this."还是"super."
		//默认省略的是"this."
		//this先从本来中查找，如果本类中没有再从父类中查找。
		//super直接从父类中查找，如果父类中没有则报错。
		System.out.println(age);
	}
	
}












