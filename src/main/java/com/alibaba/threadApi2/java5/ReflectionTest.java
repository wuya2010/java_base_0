package com.alibaba.threadApi2.java5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {

	/*
	 	通过反射获取指定的属性
	 */
	@Test
	public void test() throws Exception, Exception{
		Dog dog = new Dog();
		
		//1.获取Class的实例
		Class clazz = Dog.class;
		
		System.out.println("-------------------给public修饰的属性赋值---------");
		//2.获取指定的属性 - 只能获取public修饰的属性
		Field dogId = clazz.getField("dogId");
		
		//3.给属性赋值
		/*
		 * 第一个参数 ： 给指定对象中的该属性进行赋值
		 * 第二个参数 ：给属性赋值的值的内容
		 */
		dogId.setInt(dog, 3);
		
		System.out.println("----------------给除public外的其它修饰的属性进行赋值---------");
		
		//2.获取指定的属性 - 除public外其它权限修饰符修饰的属性
		Field dogAge = clazz.getDeclaredField("dogAge");
		//3.允许访问除public外其它权限修饰符修饰的属性
		dogAge.setAccessible(true);
		//4.给属性赋值
		dogAge.setInt(dog, 30);
		dog.info();
	}
	
	/*
	 * 通过反射获取指定的方法
	 */
	@Test
	public void test2() throws Exception, SecurityException{
		Dog dog = new Dog();
		
		//1.获取Class
		Class clazz = Dog.class;
		
		System.out.println("---------------------调用public修饰的方法--------");
		//2.获取指定方法 - public修饰的方法
		/*
		 *  getMethod(String name, Class<?>... parameterTypes)
		 *  第一个参数 ： 方法名
		 *  第二个参数 ： 形参的类型
		 */
		Method showPublic = clazz.getMethod("showPublic",String.class,int.class);
		//3.调用方法
		/*
		 * invoke(Object obj, Object... args)
		 * 第一个参数 ： 调用指定的对象中的该方法
		 * 第二个参数 ： 调用方法传递的实参
		 */
		showPublic.invoke(dog,"二哈",1);
		
		System.out.println("--------------------调用除public修饰外的其它的方法--------");
		
		//2.获取指定的方法 - 除public修饰外的其它的方法
		/*
		 *  getDeclaredMethod(String name, Class<?>... parameterTypes)
		 *  第一个参数 ： 方法名
		 *  第二个参数 ： 形参的类型
		 */
		Method showPrivate = clazz.getDeclaredMethod("showPrivate");
		//3.允许访问	
		showPrivate.setAccessible(true);
		//4.调用方法
		/*
		 * invoke(Object obj, Object... args)
		 * 第一个参数 ： 调用指定的对象中的该方法
		 * 第二个参数 ： 调用方法传递的实参
		 */
		showPrivate.invoke(dog);
		
	}
	
	/*
	 * 通过反射创建对象
	 */
	
	/*
	 * 通过反射获取注解
	 */
}
