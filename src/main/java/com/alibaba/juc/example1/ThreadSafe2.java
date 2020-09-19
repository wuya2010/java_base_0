package com.alibaba.juc.example1;

import java.util.concurrent.locks.ReentrantLock;

/*
 * JUC推荐使用Lock（接口）的实现类来完成！
 * 
 * ReentrantLock： 可重入互斥锁。
 * 			和synchronized作用一样，可扩展！
 * 			显式调用获取锁和解锁。
 * 			在构造方法中，可以传入一个fairness的参数，如果为true，那么是公平的，
 * 
 * 			会让等待时间最长的 线程获取锁，不保证cpu调度的公平。
 * 
 * 
 */

class window6 implements  Runnable{
	
	private  int tickets=100;
	
	// 创建锁
	private ReentrantLock lock=new ReentrantLock(true);
	
	@Override
	public void run() {
	
		while(true) {
			
			// 加锁，手动加锁
			lock.lock();
			try {
				if (tickets>0) {
					
					System.out.println(Thread.currentThread().getName()+"====售出了===="+tickets+"号票！");
					
					tickets--;
					
				}else {
					
					break;
					
				}
			} finally {
					// 释放锁
				lock.unlock();
			}
			
		}

	}
}


public class ThreadSafe2 {
	
	public static void main(String[] args) {
		
		window6 window6 = new window6();
		
		new Thread(window6, "窗口1").start();
		new Thread(window6, "窗口2").start();
		new Thread(window6, "窗口3").start();
		
		
	}

}
