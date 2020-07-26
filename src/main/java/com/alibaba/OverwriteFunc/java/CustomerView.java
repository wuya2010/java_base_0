package com.alibaba.OverwriteFunc.java;

import java.util.Arrays;

public class CustomerView {
	
	private CustomerList list;
	
	public CustomerView(){
		list = new CustomerList();
	}

	public static void main(String[] args) {
		
		
		CustomerView view = new CustomerView();
		view.add("aaa");
		view.add("bbb");
		view.add("ccc");
		view.add("ddd");
		
		String[] str = view.getStr();
		System.out.println(Arrays.toString(str));
	}
	
	/*
	 * 获取数组中所有的人
	 */
	public String[] getStr(){
		return list.getStr();
	}
	
	/*
	 * 向数组中添加人
	 */
	public void add(String s){
		/*
		 * 不能每调用一次添加的操作，就创建一个对象，因为我们需要将多个数据放到一个对象（有数组的属性）的数组中。
		 */
//		list = new CustomerList();
		list.add(s);
	}
}
