package com.alibaba.juc.example1;

/*
 * 1. 线程安全
 * 		一般是多个线程同时写一个全局变量或静态变量
 * 
 * 2. 解决
 * 		  传统：
 * 			a)使用synchronized代码块时
 * 					显式锁；
 * 					在继承Thread类的线程上，需要使用当前类.class作为锁。
 * 					在实现了Runnable的线程上，使用this（当前对象）即可
 * 			b)使用synchronized方法
 * 					隐式锁；
 * 					使用synchronized来修饰的方法，称为同步方法
 * 					在实现了Runnable的线程上，同步方法使用this（当前对象）作为锁
 * 					在继承Thread类的线程上，同步方法使用this（当前对象）作为锁,不安全。
 * 						解决： 加上static修饰同步方法
 * 					在继承Thread类的线程上，静态同步方法使用类.class作为锁,安全。
 * 					
 * 3. 核心，多个线程使用同一把锁
 * 
 * 
 */

class window extends Thread{
	
	private static int tickets=100;
	
	@Override
	public void run() {
	
		while(true) {
			// 当前对象
			synchronized (window.class) {
				if (tickets>0) {
					
					System.out.println(getName()+"====售出了===="+tickets+"号票！");
					
					tickets--;
					
				}else {
					
					break;
					
				}
				
			}
			
			
		}
		
		
	}
}





class window3 extends Thread{
	
	private static int tickets=100;
	
	private static synchronized boolean sale() {
		
		if (tickets>0) {
			
			System.out.println(Thread.currentThread().getName()+"====售出了===="+tickets+"号票！");
			
			tickets--;
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	@Override
	public void run() {
	
		while(sale()) {
			
		}
		
		}
}




class window1 implements Runnable{
	
	private static int tickets=100;
	
	@Override
	public void run() {
	
		while(true) {
			// 当前对象
			synchronized (this) {
				if (tickets>0) {
					
					System.out.println(Thread.currentThread().getName()+"====售出了===="+tickets+"号票！");
					
					tickets--;
					
				}else {
					
					break;
					
				}
				
			}
			
			
		}
		
		
	}
}





class window2 implements Runnable{
	
	private static int tickets=100;
	
	private synchronized boolean sale() {
		
		if (tickets>0) {
			
			System.out.println(Thread.currentThread().getName()+"====售出了===="+tickets+"号票！");
			
			tickets--;
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	@Override
	public void run() {
	
		while(sale()) {
			
		}
			
	}
}


public class ThreadSafe {
	
	public static void main(String[] args) {
		
		
		//这个地方回看一下视频，了解逻辑
		
		
		//使用了同步代码块中的this锁
		
//		window window1 = new window();
//		window window2 = new window();
//		window window3 = new window();
//		
//		window1.setName("窗口1");
//		window2.setName("窗口2");
//		window3.setName("窗口3");
//		
//		window1.start();
//		window2.start();
//		window3.start();
		
		
		
		
		
		//使用了静态同步方法，隐式锁
		
//		window1 window1 = new window1();
//		
//		new Thread(window1, "窗口1").start();
//		new Thread(window1, "窗口2").start();
//		new Thread(window1, "窗口3").start();
//		
		
		// 使用同步方法
//		window2 window1 = new window2();
//		
//		new Thread(window1, "窗口1").start();
//		new Thread(window1, "窗口2").start();
//		new Thread(window1, "窗口3").start();
		
		
		
		///使用了静态同步方法，隐式锁
		window3 window1 = new window3();
		window3 window2 = new window3();
		window3 window3 = new window3();
		
		window1.setName("窗口1");
		window2.setName("窗口2");
		window3.setName("窗口3");
		
		window1.start();
		window2.start();
		window3.start();
//		
	}

}
