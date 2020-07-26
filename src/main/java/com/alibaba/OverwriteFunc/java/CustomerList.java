package com.alibaba.OverwriteFunc.java;

public class CustomerList {

	private String[] str;
	private int total;
	
	public CustomerList(){
		str = new String[5];
	}
	
	
	/*
	 * 向数组中添加内容
	 */
	public void add(String s){
		str[total] = s;
		total++;
	}
	
	
	/*
	 * 获取数组
	 */
	public String[] getStr(){
		return str;
	}
}
