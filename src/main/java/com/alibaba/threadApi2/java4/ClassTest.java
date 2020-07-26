package com.alibaba.threadApi2.java4;

import org.junit.Test;

public class ClassTest {
	
	/*
	 	如何获取Class的实例
	 */
	@Test
	public void test2() throws Exception{
		Person person = new Person();
		
		//1.通过类名.class (必须掌握)
		Class clazz = Person.class;
		//2.通过对象名.getClass()(必须掌握)
		Class clazz2 = person.getClass();
		//3.通过Class.forName(全类名)(必须掌握)
		Class clazz3 = Class.forName("com.atguigu.java4.Person");
		//4.通过类加载器(知道就可以)
		Class clazz4 = this.getClass().getClassLoader().loadClass("com.atguigu.java4.Person");
		
	}

	/*
	 	Class:
	 	1.Class是反射的源头
	 	2.类加载时，我们会将字节码文件加载到JVM中。加载到JVM中的字节码文件就是Class的实例
	 	3.加载到JVM中的字节码文件所对应的类叫做运行时类（比如Person）。
	 			运行时类就是Class的实例。
	 	4.类加载只加载一次。类信息（运行时类，字节码文件（同一个比如Person））只有一份。
	 	5.Class本身也是一个类
		6.Class 对象只能由系统建立对象
		7.一个类在 JVM 中只会有一个Class实例 
		8.一个Class对象对应的是一个加载到JVM中的一个.class文件
		9.每个类的实例都会记得自己是由哪个 Class 实例所生成
		10.通过Class可以完整地得到一个类中的完整结构 

	 */
	@Test
	public void test(){
		
	}
}
