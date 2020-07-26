package com.alibaba.classClazz.java2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/*
 * 重点 ： 
 * 		1.获取指定的属性（赋值）和方法（调用）
 * 		2.获取属性和方法的详细信息（知道怎么获取就可以）
 */
public class ReflectionTest {

	/*
	 * 通过反射获取所有的属性
	 */
	@Test
	public void test(){
		//1.获取Class的实例
		Class<Dog> clazz = Dog.class;
		//2.获取所有的属性- 获取本类及父类中所有的public修饰的属性
		Field[] fields = clazz.getFields();
		//3.遍历
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("-----------------------------------------------");
		//获取本类中所有的属性
		Field[] declaredFields = clazz.getDeclaredFields();
		
		for (Field field : declaredFields) {
			System.out.println(field);
		}
		
	}
	
	/*
	 *通过反射获取所有的方法 
	 */
	@Test
	public void test2(){
		//1.获取Class的实例
		Class<Dog> clazz = Dog.class;
		//2.获取所有的方法 -- 获取本类及父类中所有的public修饰的方法
		Method[] methods = clazz.getMethods();
		//3.遍历
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		System.out.println("---------------------------------");
		
		//获取本类中所有的方法
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
	}
	
	/*
	 * 通过反射创建对象（获取构造器）：getDeclaredConstructor(Class<?>... parameterTypes)
	 */
	@Test
	public void test3() throws Exception, Exception{
		//1.获取Class的实例
		Class<Person> clazz = Person.class;
		//2.获取构造器 - 任意权限修饰符修饰的构造器都可以
		//getDeclaredConstructor(Class<?>... parameterTypes)
		//parameterTypes : 形参的类型
		Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class);
		//3.允许访问
		constructor.setAccessible(true);
		//4.创建对象(通过构造器创建对象)
		//newInstance(Object ... initargs)
		//initargs : 实参
		constructor.newInstance("aaa");
	}
	
	
	/*
	 * 通过反射获取对象
	 */
	@Test
	public void test6() throws Exception, IllegalAccessException{
		
		Class clazz = Dog.class;
		Dog dog = (Dog)clazz.newInstance();
		dog.info();
	}
	

	
	/*
	 * 创建任意类的对象
	 */
	
	public Object createObject(String str) throws Exception{
		Class<?> clazz  = Class.forName(str);
		return clazz.newInstance();
	}
	
	/*
	 * 通过反射获取父类：getSuperclass()
	 */
	@Test
	public void test4(){
		Class clazz = Dog.class;
		//获取父类
		Class superclass = clazz.getSuperclass();
		
		System.out.println(superclass);//class com.atguigu.java2.Animal
	}
	/*
	 * 
	 * 通过反射获取注解：clazz.getAnnotations()
	 * getField("address")--->field.getAnnotations()
	 * MyAnn ma = (MyAnn) annotation
	 * 
	 */
	@Test
	public void test5() throws Exception, Exception{
		Class clazz = Person.class;
		
		//获取注解 - 类上的注解
		Annotation[] annotations = clazz.getAnnotations();
		//遍历
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		//获取注解 - 属性上的注解
		//1.先获取该属性
		Field field = clazz.getField("address");
		//2.获取属性上的注解
		Annotation[] annotations2 = field.getAnnotations();
		for (Annotation annotation : annotations2) {
			System.out.println(annotation);
			
			//获取注解中的属性的值
			MyAnn ma = (MyAnn) annotation;
			System.out.println(ma.name());
		}
	}
}









