package com.alibaba.threadApi2.java2;

import java.util.concurrent.locks.ReentrantLock;


/*
wait()：令当前线程挂起并放弃CPU、同步资源，使别的线程可访问并修改共享资源，而当前线程排队等候再次对资源的访问
notify()：唤醒正在排队等待同步资源的线程中优先级最高者结束等待
notifyAll ()：唤醒正在排队等待资源的所有线程结束等待

[面试题]sleep和wait的区别？
	1.sleep在睡着时不会释放锁，wait在睡着时会释放锁。
	2.sleep是Thread中的方法，wait是Object中的方法。
	3.sleep会自动唤醒，wait需要被notify/notifyAll唤醒。
 */
public class NotifyTest {

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

class MyRunnable implements Runnable {

	int tick = 100;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				//notifyAll ()：唤醒正在排队等待资源的所有线程结束等待
				this.notifyAll();
				
				System.out.println(Thread.currentThread().getName());
				try {
					//睡着时抱着锁 - 没有释放锁
//					Thread.sleep(1000);
					//睡着时会释放锁
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
