package com.alibaba.collection.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

import org.junit.Test;

/*
 	
 	jdk1.8新的时间日期API
 */
public class NewTime {
	
	/*
	 	DateTimeFormatter : 用来格式化时间（SimpleDateFormat的升级版）
	 	1.预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE
		2.本地化相关的格式。如：ofLocalizedDate(FormatStyle.FULL)
		3.自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss E”)

	 */
	@Test
	public void test4(){
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		//1.预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE
		DateTimeFormatter localDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		//format() : 将时间转成字符串
		String time = localDateTime.format(dateTime);
		System.out.println(time);
		//parse() : 将字符串转成时间
		TemporalAccessor parse = localDateTime.parse("2019-06-03T11:32:12.934");
		System.out.println(parse);
		
		System.out.println("-----------------------------");
		//2.本地化相关的格式。如：ofLocalizedDate(FormatStyle.FULL)
		DateTimeFormatter localDateTime2 = DateTimeFormatter
					.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(localDateTime2.format(dateTime));
		
		System.out.println("-----------------------------");
//		3.自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss E”)
		DateTimeFormatter localDateTime3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(localDateTime3.format(dateTime));
		
	}
	
	/*
	 * Instant : 时间是以中时区的时间为基准
	 */
	@Test
	public void test3(){
		//获取当前时间（中时区）
		Instant instant = Instant.now();
		System.out.println(instant);
		
		//ofEpochMilli(long epochMilli) : 获取毫秒数所对应的时间
		Instant instant2 = Instant.ofEpochMilli(156546456456L);
		System.out.println(instant2);
		
		
		//atOffset(ZoneOffset offset) :结合即时的偏移来创建一个 OffsetDateTime
		OffsetDateTime atOffset = instant.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);


		//返回1970-01-01 00:00:00到当前时间的毫秒数，即为时间戳
		long epochMilli = instant.toEpochMilli();
		System.out.println(epochMilli);
	}
	
	/*
	 	本地日期 LocalDate
	 	本地时间 LocalTime
	 	本地日期和时间 LocalDateTime
	 */
	@Test
	public void test2(){
		//now() : 静态方法，根据当前时间创建对象/指定时区的对象
		LocalDate date = LocalDate.now(); //本地日期
		LocalTime time = LocalTime.now(); //本地时间
		LocalDateTime dateTime = LocalDateTime.now();//本地日期和时间
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		System.out.println("----------------------------------");
		//of() :静态方法，根据指定日期/时间创建对象
		LocalDate date2 = LocalDate.of(2019, 3, 6);
		System.out.println(date2);
		
		System.out.println("----------------------------------");
		//getDayOfMonth() : 当天是当月的第几天
		int dayOfMonth = date.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		System.out.println("----------------------------------");
		//将月份天数、年份天数、月份、年份修改为指定的值并返回新的对象
		//原来的对象并不会发生改变
		LocalDate withDayOfMonth = date.withDayOfMonth(1);
		System.out.println("修改后=" + withDayOfMonth);
		System.out.println("修改前=" + date);
		
		System.out.println("---------------------------------");
		//向当前对象添加几天、几周、几个月、几年、几小时
		LocalDate plusDays = date.plusDays(5);
		System.out.println(plusDays);
		
		System.out.println("--------------------------------");
		//判断当年是否是闰年
		System.out.println(date.isLeapYear());
		
		System.out.println("--------------------------------");
		LocalDate ld = LocalDate.of(2018, 3, 6);
		LocalDate ld2 = LocalDate.of(2015, 3, 6); 
		System.out.println(ld.isBefore(ld2));
		
	}
	
	/*
	 * jdk1.8之前时间日期API存在的问题
	 *  格式化：格式可变性：像日期和时间这样的类应该是不可变的。
		偏移性：Date中的年份是从1900开始的，而月份都从0开始。

	 */
	@Test
	public void test(){
		//根据提供的年月日创建对应的日期的对象
		Date date = new Date(2019, 6, 3);
		
		System.out.println(date);
	}

	
	
	@Test
	public void test7(){
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter time = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println(time);//ParseCaseSensitive(false)(Value(Yea
		
		//时间转字符串
		String time2 = time.format(dateTime);
		System.out.println(time2);//2019-06-03T23:48:14.898

		TemporalAccessor parse = time.parse("2019-06-03T23:48:14.898");
		System.out.println(parse);
		
		
		DateTimeFormatter time3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);	
		System.out.println(time3.format(dateTime));//2019年6月3日 星期一
		
		//自定义
		//DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		DateTimeFormatter time4 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(time4.format(dateTime));
		

		
	}
}









