package com.alibaba.threadApi.java4;

public class ThreadAPI2 {

	/*
	 *  设置优先级
	 *  getPriority() ：返回线程优先值 
		setPriority(int newPriority) ：改变线程的优先级
		
		MAX_PRIORITY（10）;    
		MIN _PRIORITY （1）;  
		NORM_PRIORITY （5）;


	 */
	public static void main(String[] args) {
		
		Thread t= new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "==" + i);
				}
			}
		};
		//设置该线程名称
		t.setName("线程1");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		Thread t2= new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "==" + i);
				}
			}
		};
		//设置该线程名称
		t2.setName("线程2");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
	}
}
