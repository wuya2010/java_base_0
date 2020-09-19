package com.alibaba.juc.juc;

public class DaemonThread {
	
	public static void main(String[] args) {
		
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					try {
						Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName()+"===》"+i);
					
				}
				
			}
		}, "线程A");
		
		// 如果分线程和主线程有因果练习，为主线程服务的，设置分线程为守护线程
		t.setDaemon(true);
		
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("主线程已经运行结束！");
		
	}
	

}
