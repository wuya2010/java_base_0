package com.alibaba.classMutilTai.java3;

/*
 	权限修饰符 ： private 缺省的  protected public
 	
 	1.在类的内部四种权限修饰符修饰的属性和方法都可以进行调用
 	2.在同一个包下不同的类中可以使用 ：缺省的，protected,public
 	3.不同的包中 ： 可以使用public
	     不同包的子类 ：public,protected(后面再讲)
 */
public class LimitTest {

	public static void main(String[] args) {
		
		//在同一个包下不同的类中可以使用 ：缺省的，protected,public
		Cat cat = new Cat();
		System.out.println(cat.name);
		System.out.println(cat.nameProtected);
		System.out.println(cat.namePublic);
		
		cat.say();
		cat.sayProtected();
		cat.sayPublic();
		
	}
}
