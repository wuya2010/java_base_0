package com.alibaba.Throws.java3;

/*
 	自定义异常：
 	1.自定义一个类继承Exception(编译时异常)或者RuntimeException(运行时异常)
 	2.定义两个构造器，一个空参的，一个有参的（调用父类中有参的构造器）
 	3.显示提供一个serialVersionUID（也可以省略）
 */
public class MyException2 extends RuntimeException{

	/**
	 *  serialVersionUID可以省略，系统会默认添加一个。
	 */
	private static final long serialVersionUID = -5168658047493233856L;

	public MyException2(){
		
	}
	
	public MyException2(String s){
		super(s);
	}
}
