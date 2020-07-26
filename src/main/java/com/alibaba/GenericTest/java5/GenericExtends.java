package com.alibaba.GenericTest.java5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 	3.泛型在继承上的体现
 */
public class GenericExtends {

	/**
	 	说明:
	 		1.如果A是B的父类，那么A和B存在子父类关系。
	 		2.如果G是具有泛型声明的类或接口那么，G<A> 和 G<B> 不存在仍何关系
	 */
	@Test
	public void test(){
		//Number <- Integer
		Number number = new Integer(11);//多态
		
		//编译有问题
//		ArrayList<Number> list = new ArrayList<Integer>(); 不存在仍何关系，因为泛型的类型不一致
		
		//下面的写法是不对的，泛型没有起到作用
		ArrayList list = new ArrayList<Integer>();
		
		//下面的写法可以（jdk1.7开始支持的）
		ArrayList<Integer> list2 = new ArrayList<>();
		
		//下面的写法不对
		ArrayList<Integer> list3 = new ArrayList();
		
		
		
	}
}
