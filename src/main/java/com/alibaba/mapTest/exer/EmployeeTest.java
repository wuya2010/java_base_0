package com.alibaba.mapTest.exer;

import java.util.TreeSet;

/*
 1. 定义一个Employee类，
该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
并为每一个属性定义 getter, setter 方法；
并重写 toString 方法输出 name, age, birthday
 

 

 
1). 使Employee实现Comparable 接口，并按 name和birthday排序

 */
class Employee implements Comparable{
	private String name;
	private int age;
	private MyDate birthday;
	
	
	public Employee(String name, int age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		
		return "(" + name + "," + age + "," + birthday + ")";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Employee){
			Employee e = (Employee) o;
			//安照名字排序
			int n = this.name.compareTo(e.name);
			if(n == 0){
				//安birthday排序
				return this.birthday.compareTo(e.birthday);
			}
			return n;
		}
		return 0;
	}
	
	
}
/*
 * MyDate类包含:
private成员变量month,day,year；并为每一个属性定义 getter, setter 方法；
 */
class MyDate implements Comparable{
	private int year;
	private int month;
	private int day;
	
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof MyDate){
			MyDate md = (MyDate) o;
			//比较年份
			int y = this.year - md.year;
			
			if(y == 0){
				//比较月份
				int m = this.month - md.month;
				
				if(m == 0){
					//比较日期
					return this.day - md.day;
				}
				
				return m;
			}
			
			return y;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}


	
	
	
}
/*
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中，对集合中的元素进行排序，并遍历输出：
 */
public class EmployeeTest {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Employee("aa", 19, new MyDate(2000, 1, 5)));
		set.add(new Employee("dd", 17, new MyDate(2002, 6, 3)));
		set.add(new Employee("aa", 24, new MyDate(1995, 3, 8)));
		
		System.out.println(set);
	}
}






