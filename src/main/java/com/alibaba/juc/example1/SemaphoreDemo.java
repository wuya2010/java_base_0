package com.alibaba.juc.example1;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	
	public static void main(String[] args) {
		
		
		Semaphore semaphore = new Semaphore(5, true);
		
		for (int i = 1; i <= 10; i++) {
			
			new Thread(new Runnable() {

				@Override
				public void run() {
				
					// 获取信号量，如果没有，就等待
					try {
						// 当一个线程调用acquire操作时，它要么通过成功获取信号量
						semaphore.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName()+"===>用餐开始！");
					
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}

					System.out.println(Thread.currentThread().getName()+"===>用餐结束！");
					
					/*try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}*/
					
					//	release（释放）实际上会将信号量的值加1
					semaphore.release();
					
				}
			}, i+"号顾客").start();
			
		}
		
	}

}
