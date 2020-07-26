package com.alibaba.collection.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeTest {
	
	/**
	 	如何将前端发过来的字符串格式的时间插入到数据库中？
	 * @throws ParseException 
	 */
	@Test
	public void test3() throws ParseException{
		
		String str = "2019-06-03 10:23:33";
		//1.将字符串转成java.util.Date（利用SimpleDateFormat）
		//1.1创建SimpleDateFormat的对象定义好时间的格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//1.2将字符串转成时间
		Date date = sdf.parse(str);
		
		//2.将java.util.Date转成java.sql.Date
		java.sql.Date date2 = new java.sql.Date(date.getTime());
	}
	
	/**
	  java.text.SimpleDateFormat : 用来格化式化我们的时间
	  
	  text : 该包下的所有的类都是关于国际化的
	  @throws ParseException 
	  
	  	两个方法 ：
	  		format（Date date） : 将时间转成字符串
	  		
	  		parse(String str) : 将字符串转成时间
	  			注意 ： SimpleDateFormat设置的时间格式必须和字符串的格式保持一致否则可能会发生异常
	 
	 */
	@Test
	public void test2() throws ParseException{
		//创建Date的对象
		Date date = new Date();
		//创建SimpleDateFormat的对象
		SimpleDateFormat sdf = new SimpleDateFormat();
		//format(Date date) : 将时间转成字符串
		String time = sdf.format(date);
		//19-6-3 上午10:18
		System.out.println(time);
		
		System.out.println("-------------自定义时间的格式（通过构造器）-----------------------");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("K:mm a, z");
		//10:21 上午, CST
		System.out.println(sdf2.format(date));
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ" );
		//2019-06-03T10:22:00.546+0800
		System.out.println(sdf3.format(date));
		
		System.out.println("--------------------------");
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//2019-06-03 10:23:33
		System.out.println(sdf4.format(date));
		
		System.out.println("--------------将String转成Date-------------");
		//注意 ： SimpleDateFormat设置的时间格式必须和字符串的格式保持一致否则可能会发生异常
		Date parse = sdf4.parse("2019-06-03 10:23:33");
		System.out.println(parse);
	}

	@Test
	public void test(){
		//Mon Jun 03 10:15:03 CST 2019
		Date date = new Date();
		System.out.println(date);
	}
}
