package com.alibaba.classClazz.java2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReflectionTest2 {
	
	/*
	 * 获取方法的详细信息
	 */
	@Test
	public void test2(){
		
		Class clazz = Dog.class;
		//获取本类中所有的方法
		Method[] methods = clazz.getDeclaredMethods();
		//遍历
		for (Method method : methods) {
			//获取方法的权限修饰符
			System.out.print(Modifier.toString(method.getModifiers()) + " ");
			//获取方法的返回值类型
			System.out.print(method.getReturnType() + " ");
			//获取方法名
			System.out.print(method.getName() + " ");
			//获取形参列表
			System.out.print("(");
			Class[] parameterTypes = method.getParameterTypes();
			for (Class class1 : parameterTypes) {
				System.out.print(class1 + " ");
			}
			System.out.print(")");
			
			System.out.println();
		}
	}

	/*
	 * 获取属性的详细信息
	 */
	@Test
	public void test(){
		
		Class clazz = Dog.class;
		
		//获取本类中所有的属性
		Field[] declaredFields = clazz.getDeclaredFields();
		//遍历
		for (Field field : declaredFields) {
			//获取属性的权限修饰符
			int modifiers = field.getModifiers();
			System.out.print(Modifier.toString(modifiers) + " ");
			
			//获取属性的类型
			Class type = field.getType();
			System.out.print(type + " ");
			
			//获取属性的名字
			String name = field.getName();
			System.out.print(name);
			
			System.out.println();
		}
	}
}



















