package com.alibaba.threadApi2.java5;

public class Dog {

	
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
