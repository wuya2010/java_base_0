package com.alibaba.collection.java;

import java.util.Optional;

import org.junit.Test;

/**
 
 	Optional : 用来预防空指针异常问题（本身是一个容器）
 */
public class OptionalTest {
	
	/**
	 * 第一种创建对象方式
	 */
	@Test
	public void test3(){
		//创建对象 ：通过empty的方式创建的是一个容器为空的对象
		Optional<Object> empty = Optional.empty();
		
	}
	
	/**
	 * 
	/**
	 * 第二种创建对象方式
	 */
	 
	@Test
	public void test2(){
		String str = null;
		//创建对象 ： 通过of的方式无法判断容器中的数据是否为null,如果为null抛异常
		Optional of = Optional.of(str);
		
		if(of.isPresent()){
			System.out.println("我不是一个null");
		}else{
			System.out.println("我是一个null");
		}
	}

	/**
	 * 
	 * 第三种创建对象方式
	 */

	@Test
	public void test(){
		String str = "ddd";
		//创建对象 ： 通过 ofNullable的方式可以判断容器中的数据是否为null
		Optional  opt = Optional.ofNullable(str);
		
		System.out.println("-------------------------------");
		//判断当前容器中的数据是否是null
//		if(opt.isPresent()){
//			System.out.println("我不是一个null");
//			//获取该数据
//			System.out.println(opt.get());
//		}else{
//			System.out.println("我是一个null");
//		}
		
		System.out.println("-------------------------------------");
		/*
		 	orElse(Object obj) : 如果当前容器中的数据是null那么输出obj，
		 					如果不为null则输出容器中的数据
		 */
		Object obj = opt.orElse("ccc");
		System.out.println(obj);
		
	}
	
	public void show(Object obj){

	}
}
