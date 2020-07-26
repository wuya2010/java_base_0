package com.alibaba.threadApi2.java4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/*
 	反射的演示
 */
public class ReflectionTest {
	

	/*
	 * 调用private修饰的方法
	 */
	@Test
	public void test2() throws Exception, Exception{
		
		Person p = new Person();
		
		System.out.println("---------------------------");
		
		Class clazz = Person.class;
		Method show = clazz.getDeclaredMethod("show");
		show.setAccessible(true);
		show.invoke(p);
		
		
	}

	/*
	 * 调用private修饰的属性
	 */
	@Test
	public void test() throws Exception, Exception{
		
		Person p = new Person();
		p.info();
		
		System.out.println("----------------------------");
		
		Class clazz = Person.class;
		
		Field name = clazz.getDeclaredField("name");
		name.setAccessible(true);
		name.set(p, "aaa");
		
		System.out.println("------------------------------");
		
		p.info();
	}
}
