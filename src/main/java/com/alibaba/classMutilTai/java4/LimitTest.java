package com.alibaba.classMutilTai.java4;

public class LimitTest {

	public static void main(String[] args) {
		
		//不同的包中 ： 可以使用public
		//不同包的子类 ：public ,protected(后面再讲)
		Cat cat = new Cat();
		System.out.println(cat);
//		cat.sayPublic();
	}
}
