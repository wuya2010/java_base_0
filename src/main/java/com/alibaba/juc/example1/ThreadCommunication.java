package com.alibaba.juc.example1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Thread5 implements Runnable{
	
	private int num=0;
	
	private ReentrantLock lock=new ReentrantLock(true);
	
	private Condition condition=lock.newCondition();

	@Override
	public void run() {
		
		while(num<=100) {
			
			lock.lock();
			
			try {
				
				condition.signal();
				
				if(num % 2==1) {
					
					System.out.println(Thread.currentThread().getName()+"===》"+num);
					
				}else {
					
					System.out.println(Thread.currentThread().getName()+"===》"+num);
					
				}
				
				num++;
				
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			} finally {
				lock.unlock();
			}
				
			
			
		}
		
		System.out.println("结束！");
		
		
	}

}




/*
 * 1.默认两个线程一个打印奇数，一个打印偶数，交替打印
 */
public class ThreadCommunication {
	
	public static void main(String[] args) {
		
		Thread5 thread5 = new Thread5();
		
		new Thread(thread5, "threadA").start();
		new Thread(thread5, "threadB").start();
		
	}

}
