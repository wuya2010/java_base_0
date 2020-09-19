package com.alibaba.juc.example1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	
	public static void main(String[] args) {
		
		// 循环屏障创建完毕
		CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("同学们辛苦了！我们军训工作圆梦结束！鼓掌！");
				
			}
		});
		
		
		
		
		
		for (int i = 1; i <= 5; i++) {
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
					
					System.out.println(Thread.currentThread().getName()+"===>集合完毕！请指示！");
					
					// 等待所有班级全部集合完毕
					try {
						
						//线程进入屏障通过CyclicBarrier的await()方法
						cyclicBarrier.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName()+"===>解散！");
					
				}
			}, i+"班级").start();
			
		}
		
		
		
		
		
		
	}

}
