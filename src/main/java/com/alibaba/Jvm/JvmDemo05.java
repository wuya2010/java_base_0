package com.alibaba.Jvm;

public class JvmDemo05 {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		Car car2=car1;
		
		car1=null;
		
		// 建议回收
		System.gc();
		
	}

}
