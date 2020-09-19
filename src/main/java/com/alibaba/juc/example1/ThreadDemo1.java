package com.alibaba.juc.example1;


/*
 * 0. 线程： 每条执行路径都是一个线程。
 * 				一个进程中可以有多条线程。
 *    程序：  一段可以执行的代码。静态。
 *    进程： 执行程序时，开启一个线程申请资源运行代码。
 * 				有多条执行路径。
 * 
 * 		多线程目的：  ①提高程序的运行效率
 * 				 ②主要应用场景：
 * 					在核心功能不阻塞时，解决一些其他的无关的或耗时的操作。
 *    守护线程（后台线程）：  daemon(守护进程)在后台运行的程序。
 *    用户线程（前台线程）： 用户正在使用的线程，切实和用户进行交互
 *    
 *    
 * 
 * 1. 线程的创建方式
 * 		一个线程必须是Thread类的子类。
 * 		
 * 		a) 继承Thread类
 * 				在Java中类只能单继承，只能有一个父类。
 * 		b) 实现runnable()接口
 * 				一般采用实现runnable接口的方式实现线程，接口可以多实现
 * 		c) 匿名内部类实现
 * 
 * 2. 启动线程
 * 			必须执行Thread的start()方法，start()最终会调用Thread类中的run()
 * 
 * 3. 每个线程不能重复执行start()!
 * 
 * 4. 使用volatile关键字修饰的变量，所有线程都可见。
 * 
 * 5. 开启一个线程，只能使用Thread.start(); 从JDK1.0就提供了！
 * 
 * 
 */
class Thread1 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			
	/*		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			
			//Thread可以直接使用getName()方法
			//Thread可以直接使用getName()方法
			System.out.println(getName()+"===>"+i);
		}
		
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"===>"+i);
		}
	
	}
	
	
}



public class ThreadDemo1 {
	
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		
		//run()方法是否会阻塞
			thread1.run();
		//thread1.start();
			thread1.setName("线程A");
		
/*		thread1.start();
		
		Thread1 thread2 = new Thread1();
		
		thread2.setName("线程B");
		
		thread2.start();
		*/
		/*Thread2 thread2 = new Thread2();
		
		Thread thread1 = new Thread(thread2, "线程A");
		Thread thread3 = new Thread(thread2, "线程B");
		thread1.start();
		thread3.start();*/
		
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName()+"===>"+i);
				}
			}
		},"线程A").start();*/
		
		
		for (int i = 0; i < 100; i++) {
		/*	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			System.out.println(Thread.currentThread().getName()+"===>"+i);
		}
		
	}

}
