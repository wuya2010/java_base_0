package com.alibaba.Desinger.exer5;

/*
 * 编写Worker类，里面有姓名和生日（MyDate类）两个属性，进行合理封装，并提供有参构造器，重写equals方法
MyDate类表示日期，类中包含属性day、month和year，提供必要的方法，
在Test类的main方法中，创建两个属性值一样的Worker对象，比较它们是否相同。

 */
public class Worker {

	String name;
	MyDate birthday;
	
	public Worker(String name,MyDate birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj instanceof Worker){
			//向下转型
			Worker w = (Worker) obj;
			return this.name.equals(w.name) && this.birthday.equals(w.birthday);
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return name + " " + birthday.toString();
	}
}

















