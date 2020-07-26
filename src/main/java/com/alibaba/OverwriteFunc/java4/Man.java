package com.alibaba.OverwriteFunc.java4;

public class Man extends Person{

	@Override
	public void show() {
		System.out.println("男人脱掉衣服秀一下");
	}
	
	@Override
	public void run() {
		System.out.println("男人唱着rap跑起来");
	}
	
	public void smoking(){
		System.out.println("男人不抽烟女人不喜欢");
	}
}
