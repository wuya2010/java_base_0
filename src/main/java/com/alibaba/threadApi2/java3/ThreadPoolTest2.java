package com.alibaba.threadApi2.java3;

/*
 	线程池(了解)
 */
public class ThreadPoolTest2 {

	public static void main(String[] args) {
		
		
		ThreadPoolTest.getInstance().run(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("aaaaaaaaaaaaaaaaaaaaa");
				}
			}
		});
		
		
		ThreadPoolTest.getInstance().run(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
				}
			}
		});
	}
}
