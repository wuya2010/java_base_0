package com.alibaba.String.java3;

import java.sql.Date;
import java.util.Calendar;

import org.junit.Test;

/*
 	jdk1.8之前时间日期API
 */
public class TimeTest {
	
	/**
	 	 Calendar（日历类）：了解即可
	 */
	@Test
	public void test3(){
		//获取日历类的对象
		Calendar calendar = Calendar.getInstance();
		//获取该对象所在的类的全类名
		System.out.println(calendar.getClass().getName());
		//获取当天是当月的第几天（是当月的几号）
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println("-----------修改日期-------------");
		//在当天是当月第几天的基础上再增加1天（减去天数可以写成负数）
//		calendar.add(Calendar.DAY_OF_MONTH, 1);
		//把当天修改成当月的第20天。
		calendar.set(Calendar.DAY_OF_MONTH, 20);
		
		day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println("------------获取时间--------------");
		//获取日历类所对应的时间
		java.util.Date time = calendar.getTime();
		System.out.println(time);
		
	}

	/**
	  
	   java.util.Date:
	  		1.两个构造器：
	  			 new java.util.Date() ：可以获取当前的日期和时间
	  			 new java.util.Date(1559378522672L) :获取的是毫秒数对应的日期和时间
	  		2.两个方法
	  			 toString() : 获取以字符串形式的日期和时间
	  			 getTime() : 获取日期时间所对应的毫秒数
	  			 
	   java.sql.Date :
	   		1.一个构造器：
	   			new java.sql.Date(long time) : 获取毫秒数对应的日期
	   		2.两个方法
	  			 toString() : 获取以字符串形式的日期
	  			 getTime() : 获取日期所对应的毫秒数
	 */
	@Test
	public void test(){
		//可以获取当前的日期和时间
		java.util.Date date = new java.util.Date();
		//Sat Jun 01 16:42:02 CST 2019
		System.out.println(date.toString());
		//时间所对应的毫秒数 ： 1559378522672
		System.out.println(date.getTime());
		
		System.out.println("---------------------------------------");
		
		//获取的是毫秒数对应的日期和时间
		java.util.Date d = new java.util.Date(1559378522672L);
		System.out.println(d);
	}
	
	@Test
	public void test2(){
		//获取毫秒数对应的日期
		Date date = new Date(1559378522672L);
		System.out.println(date.toString());
		System.out.println(date.getTime());
	}
	

}





