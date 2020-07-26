package com.alibaba.OverwriteFunc.java4;

public class Demo {

	public static void main(String[] args) {
		
		new AA();
	}
}


class AA{
	
	public AA(){
		
	}
	
	
	public void show(){
		new AA();
	}
}
