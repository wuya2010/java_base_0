package com.alibaba.threadApi.java4;

public class ThreadAPI {

	/*
	 void start():  启动线程，并执行对象的run()方法
	 run():  线程在被调度时执行的操作
	 String getName():  返回线程的名称
	 void setName(String name):设置该线程名称
	 static currentThread(): 返回当前线程
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
		t.setName("线程一");
		t.start();
	}
}
