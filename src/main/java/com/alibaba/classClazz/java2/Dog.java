package com.alibaba.classClazz.java2;

public class Dog extends Animal{

	
	private int dogAge;
	public int dogId;
	
	private void showPrivate(){
		System.out.println("showPrivate");
	}
	
	public void showPublic(String name,int sex){
		System.out.println("showPublic" + " " + name + " " + sex);
	}
	
	public void info(){
		System.out.println("dogAge=" + dogAge  + " dogid=" + dogId);
	}
}
