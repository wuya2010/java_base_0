package com.alibaba.Desinger.exer5;

/*
 * MyDate类表示日期，类中包含属性day、month和year，提供必要的方法，

 */
public class MyDate {

	int day;
	int month;
	int year;
	
	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj instanceof MyDate){
			MyDate md = (MyDate) obj;
			return this.year == md.year && this.month == md.month && this.day == md.day;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
}















