package com.alibaba.collection.exer;

import java.util.Date;

/*
 * 如何将java.util.Date转成java.sql.Date  ---- 利用当前时间的毫秒数传给sql.Date的构造器中
 */
public class PersonDemo {

	public static void main(String[] args) {
		
		PersonDemo pd = new PersonDemo();
		
		Date date = new Date();
		
		Person p = new Person(1, "小龙哥", new java.sql.Date(date.getTime()));
		
		
		pd.add(p);
	}
	
	/**
	 * 将数据插入到数据库中
	 * @param p
	 */
	public void add(Person p){
		 //----------------------插入到数据库中---------------------------
		System.out.println(p.id + " " + p.name + " " + p.date);
	}
}
