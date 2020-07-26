package com.alibaba.threadApi.java5;

/*
 	生命周期
 */
public class LifecycleTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				System.out.println("a");
				for (int i = 0; i < 100; i++) {
					System.out.println("t1");
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				System.out.println("b");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 100; i++) {
					System.out.println("t2");
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
