package com.alibaba.juc.example1;

import java.util.concurrent.CountDownLatch;

/*
 * 班级中有10个同学，班长负责锁门，班长必须等所有人走完后，才可以锁门！
 * 
 * 
 * CountDownLatch可以设置一个初始化值,  初始值为0后，await()被唤醒
 */
public class CountDownLatchDemo {
	
	public static void main(String[] args) {
		
		
		CountDownLatch countDownLatch = new CountDownLatch(10);
		
		System.out.println("班长准备开始锁门了！");
		
		
		
		for (int i = 1; i <= 10; i++) {
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
					
					System.out.println(Thread.currentThread().getName()+"===>离开教室！");
					
					// countDownLatch自减少1，调用countDown方法的线程不会阻塞)
					countDownLatch.countDown();
				}
			}, i+"号同学").start();
			
		}
		
		
		
		// 班长等着
		try {
			
			//当计数器的值变为0时，因await方法阻塞的线程会被唤醒
			
			countDownLatch.await();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("班长锁门完成！");
		
		
	}

}
