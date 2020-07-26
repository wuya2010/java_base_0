package com.alibaba.Enum.java4;

/*
 	枚举类 ： 一个类的对象的个数是可数多个的，这样的类叫作枚举类
 	
 	需要学习的内容：
 		1.如何自定义枚举类
		2.如何使用关键字enum定义枚举类
		3.枚举类的主要方法
		4.实现接口的枚举类

 */
/*
 * 自定义枚举类
 * 
 * 快捷键 ： ctrl + shift + x : 将字母全部变成大写
 * 		  ctrl + shift + y : 将字母全部变成小写
 */
class Season{
	private final String NAME;
	private final String DES;
	
	//1.私有化构造器 - 为的是不让类的外部随意创建该类的对象
	private Season(String name,String des){
		
		this.NAME = name;
		this.DES = des;
		
	}
	
	//2.创建对象
	public static final Season SPRING = new Season("春天","春眠不觉晓");
	public static final Season SUMMER = new Season("夏天","处处蚊子咬");
	public static final Season AUTUMN = new Season("秋天","秋天树叶黄");
	public static final Season WINTER = new Season("冬天","冬天穿棉袄");
	
	
	public String getName() {
		return NAME;
	}
	
	public String getDes() {
		return DES;
	}
	
	
}


public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(Season.SPRING.getName() + " " + Season.SPRING.getDes());
		System.out.println(Season.SUMMER.getDes());
	}
}


















