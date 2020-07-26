package com.alibaba.Enum.java5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 	注解（Annotation） : 注解可以用来对类的结构（属性，方法，构造器，类等）进行补充说明，而并不改并原有的结构。
 	
 	一 JDK内置的基本注解类型（3个）
 		@Override: 限定重写父类方法, 该注解只能用于方法
		@Deprecated: 用于表示某个程序元素(类, 方法等)已过时
		@SuppressWarnings: 抑制编译器警告

	二  自定义注解类型
		格式 ：@interface 注解名{
		
			 }
			
	三 元注解：对注解进行注解（4个） - 注解上的注解
		@Target : 用来说明使用了该注解的注解可以使用的结构
		@Retention : 用来说明使用了该注解的注解的生命周期
			SOURCE : 源文件 - 编译期间（废弃了可以忽略）
			CLASS : 编译期间 - 运行期间
			RUNTIME : 运行期间 （只要自定义注解必须用这个）
		@Inherited(了解即可): 用来说明使用了该注解的注解可以被子类继承
		@Documented(了解即可): 用来说明使用了该注解的注解可以被javadoc所解析
	
			
	四 利用反射获取注解信息（在反射部分涉及）
		
 */

/*
 * 自定义注解
 */
@interface MyAnn{
	
}

@interface MyAnn2{
	//default 后面是该"属性"的默认值
	String name()  default "aaa"; //可以理解成属性
}

/*
 * 需求 ：让该注解只能作用在方法上
 */
@Retention(RetentionPolicy.RUNTIME) //注意 ：只要自定义 注解必须加该元注解，必须是RUNTIME
@Target(ElementType.METHOD) //元注解
@interface MyAnn3{
	
}


@MyAnn2
public class AnnotationTest {

	@MyAnn3
	public static void main(String[] args) {
		
		SuperClass sc = new SubClass();
		sc.show();
		
		@SuppressWarnings("unused")
		int a = 10;
	
		System.out.println(10);
	}
}

@MyAnn
class SuperClass{
	
	@MyAnn3
	public void show(){
		System.out.println("suepr");
	}
}

@MyAnn2(name = "com.atguigu.java5.SubClass")
@MyAnn
@Deprecated
class SubClass extends SuperClass{
	
	@MyAnn
	@Deprecated
	public String name;
	
	@MyAnn
	@Deprecated
	public SubClass(){
		
	}
	
	@MyAnn
	@Deprecated
	@Override
	public void show(){
		System.out.println("sub");
	}
}













