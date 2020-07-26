package com.alibaba.OverwriteFunc.java2;

/*
 	三 super调用构造器
 		格式 ：super(形参列表)
 		作用 ：调用父类中的构造器
 		说明：
 			1.super(形参列表)只能放在构造器的首行
 			2.在子类的同一个构造器中只能有一个super(形参列表)
 			3.在子类的同一个构造器中super(形参列表)和this(形参列表)只能有一个（因为都只能放在首行）
 			4.如果在一个构造器中即没有this(形参列表)也没有super(形参列表)那么默认调用的是super()
 		
 	总结 ： 在创建子类对象的时候必调父类的构造器。
 */
public class SuperTest2 {

	public static void main(String[] args) {
		
		new B("aaa");
	}
}

class A{
	
	public A(){
		System.out.println("A()");
	}
	
	public A(int a){
		System.out.println("A(int a)" + a);
	}
}

class B extends A{
	public B(){
//		super();//调用父类中的空参构造器
//		super(10);//调用父类中的有参构造器
		System.out.println("B()");
	}
	
	/*
	 * 如果在一个构造器中即没有this(形参列表)也没有super(形参列表)那么默认调用的是super()
	 */
	public B(String s){
		this();
		System.out.println("B(String s)");
	}
}
