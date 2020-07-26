package com.alibaba.classClazz.java3;

import org.junit.Test;

public class ClassLoaderTest {

	/*
	 * 获取类加载器
	 */
	@Test
	public void test() throws Exception {
		// 1.获取一个系统类加载器
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		
		// 2.获取系统类加载器的父类加载器，即扩展类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		
		// 3.获取扩展类加载器的父类加载器，即引导类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		
		// 4.测试当前类由哪个类加载器进行加载
		classloader = Class.forName("com.atguigu.java2.Dog").getClassLoader();
		System.out.println(classloader);

	}
}
