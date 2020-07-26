package com.alibaba.threadApi.java6;


/*
 	Java中提供的解决方式：
 		1.同步代码块
 		2.同步方法
 		
 	一  同步代码块：
 	  格式 ：synchronized (同步监视器/锁) {
 	  	    	操作共享数据的代码;
 	  	  }
 	  
 	 说明：
 	 	1.同步监视器 ：可以是任意类的对象。
 	 		注意 ： 所有的线程都必须使用的是同一把锁（同一个对象）
 	 	2.实现Runnable的方式同步监视器可以用this,
 	 		继承Thread的方式同步监视器不能使用this。
 	 		
 	注意 ： 继承Thread的方式再实现线程安全的问题上，共享数据必须static修饰保证只有一份。
  			同步监视器不能使用this(必须保证多个线程使用的是同一把锁)
 */
public class TicketBlockTest {

	public static void main(String[] args) {
//		MyRunnable mr = new MyRunnable();
//
//		Thread t1 = new Thread(mr);
//		Thread t2 = new Thread(mr);
//		Thread t3 = new Thread(mr);
//
//		t1.start();
//		t2.start();
//		t3.start();
		
		System.out.println("--------------继承Thread的方式-------------------------");
		
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

/*
  注意 ： 继承Thread的方式再实现线程安全的问题上，共享数据必须static修饰保证只有一份。
  			同步监视器不能使用this(必须保证多个线程使用的是同一把锁)
 */
class MyThread extends Thread{
	//注意：必须使用static修饰，否则每个对象中都存在一份
	static int tick = 100;
	static Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (MyThread.class) {
				if (tick > 0) {

					System.out.println(Thread.currentThread().getName() + " === " + tick);
					tick--;
					
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					return;
				}
			}
			
		}
	}
}

class MyRunnable implements Runnable {

	int tick = 100;

	@Override
	public void run() {
		while (true) {
			//同步代码块
			synchronized (this) {
				if (tick > 0) {

					System.out.println(Thread.currentThread().getName() + " === " + tick);
					tick--;
					
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					return;
				}
			}
			
		}
	}
}
