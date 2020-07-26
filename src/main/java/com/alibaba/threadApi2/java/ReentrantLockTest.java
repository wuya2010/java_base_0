package com.alibaba.threadApi2.java;

import java.util.concurrent.locks.ReentrantLock;

/*
	ReentrantLock
 */
public class ReentrantLockTest {

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class MyRunnable implements Runnable{

	int tick = 100;
	ReentrantLock lock = new ReentrantLock();
	
	@Override
	public void run() {
		while(true){
			lock.lock();//锁住代码
			try{
				//try中写操作共享数据的代码
				if(tick > 0){
		
					System.out.println(Thread.currentThread().getName() + " === " + tick);
					tick--;
					
				}else{
					return;
				}
			}finally{
				lock.unlock();//解锁
			}
		}
	}
}










