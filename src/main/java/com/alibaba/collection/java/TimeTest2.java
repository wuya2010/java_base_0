package com.alibaba.collection.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeTest2 {
	@Test
	public void test() throws ParseException{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println(sdf);//地址值java.text.SimpleDateFormat@b5341f2a
		
		String time = sdf.format(date);//形参
		//String time = sdf.format(date);
		System.out.println(time);//19-6-3 下午11:27

		System.out.println("-----------------");
		SimpleDateFormat sdf2 = new SimpleDateFormat("K:mm a, z");
		System.out.println(sdf2.format(date));//11:30 下午, CST
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(date));//2019-06-03 23:32:32
		
		
		System.out.println("---将String转成Date----");
		Date parse = sdf3.parse("2019-06-03 23:32:32");//解析异常
		System.out.println(parse);//Mon Jun 03 23:32:32 CST 2019
		
	}
	
	
	@Test//字符串格式的时间插入到数据库中？
	public void test2() throws ParseException{
		String str = "2019-06-03 10:23:33";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//制定simple的参数形式
		
		Date date  = sdf.parse(str);
		
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		System.out.println(date2);
		
	}
}
