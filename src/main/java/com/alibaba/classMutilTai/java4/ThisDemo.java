package com.alibaba.classMutilTai.java4;

public class ThisDemo {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a);
	
		A a2 = new A();
		System.out.println(a2);
		System.out.println("----------------------------------");
		a.show();
		a2.show();
		
	}
}


class A{
	
	public void show(){
		//谁调用该方法，那么this就是谁
		System.out.println(this);
	}
}