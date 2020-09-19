package com.alibaba.Jvm;

public class JvmDemo01 {
	
	private static final String hello="";
	
	//xxxxxxx
	
	static {
		
	//	xxxx
	}
	
	public static void main(String[] args) {
		
		
		
			//sun.misc.Launcher$AppClassLoader@50040f0c
			System.out.println(Car.class.getClassLoader());
			//sun.misc.Launcher$ExtClassLoader@5d099f62
			System.out.println(Car.class.getClassLoader().getParent());
			// null
			System.out.println(Car.class.getClassLoader().getParent().getParent());
	
			
			Car car=new Car();
	
	
	}

		
		
	

}
