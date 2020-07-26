package com.alibaba.OverwriteFunc.java4;

public class Women extends Person{

	int age = 30;
	
	@Override
	public void show() {
		System.out.println("女人美美的秀一下");
	}
	
	@Override
	public void run() {
		System.out.println("女人妖娆的跑起来");
	}
	
	public void buy(){
		System.out.println("女人喜欢买买买");
	}
}
