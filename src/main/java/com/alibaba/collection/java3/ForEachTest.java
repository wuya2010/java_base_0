package com.alibaba.collection.java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/*
 	增强for循环（foreach循环）：
 	
 	格式 ：
 	
 		for(元素的类型   变量名 ： 数组/集合的对象){
 		
 		}
 		
 	 作用 ： 用来对数组和集合的元素进行遍历
 	
 */
public class ForEachTest {
	
	@Test
	public void test3(){
		String[] names = {"gg","jj","dd","mm"};
		
		/*
		for (int i = 0; i < names.length; i++) {
			names[i] = "苍姐";
		}
		*/
		
		/*
		 	String name = names[0];
		 	name = "苍姐";
		 */
		for (String name : names) {
			//修改的是局部变量name的值并没有赋值给数组中的元素
			//name = "苍姐";
			
			System.out.println(name);
		}
		
		System.out.println(Arrays.toString(names));
	}
	
	/**
 		对集合进行遍历
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		c.add("ddd");
	
		
		for(Object obj : c){
			System.out.println(obj);
		}
	}

	/**
	 	对数组进行遍历
	 */
	@Test
	public void test(){
		
		String[] names = {"gg","jj","dd","mm"};
		
		for(String name : names){
			System.out.println(name);
		}
	}
}






