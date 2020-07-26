package com.alibaba.threadApi.java4;

public class ThreadAPI4 {

	/*
	 	interrupt() ： 用来终止线程
	 	isInterrupted() : 当前线程如果被杀死那么返回结果为true,否则返回结果为false
	 	
	 */
	public static void main(String[] args) {
		
		
		Thread t = new Thread(){
			public void run() {
				for (int i = 0; i < 50; i++) {
					if(isInterrupted()){
						System.out.println("不行了我要被杀死了");
						//去做一些其它的操作
						return;
					}
					System.out.println(Thread.currentThread().getName() + " === " + i);
				}
			}
		};
		
		t.start();
		
		
		for (int i = 0; i < 50; i++) {
			if(i == 2){
				//杀死t线程
				t.interrupt();
			}
			System.out.println(Thread.currentThread().getName() + " === " + i);
		}
	}
}
