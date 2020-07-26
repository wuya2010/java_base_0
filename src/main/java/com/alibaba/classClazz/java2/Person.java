package com.alibaba.classClazz.java2;

@MyAnn(name = "person")
public class Person {

	@MyAnn(name = "address")
	public String address;
	
	private Person(String name){
		System.out.println("Person(String name)" + name);
	}
	
	@MyAnn(name = "show")
	public void show(){
		
	}
}
