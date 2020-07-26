package com.alibaba.classOther.exer2;

public class Teacher {
	
	static{
		System.out.println("teacher static");
	}
	
	public static void main(String[] args) {
		new Demo("666");
	}
}

class Demo{
	String name;
	
	static Demo t = new Demo("小龙哥");
	
	static {
		System.out.println("嘿嘿");
	}
	
	{
		System.out.println("哈哈哈：" + name);
	}
	
	public Demo(String string) {
		this.name = string;
		System.out.println("构造器：" + name);
	}
}