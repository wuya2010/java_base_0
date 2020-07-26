package com.alibaba.threadApi.java7;

/*
 	锁（同步监视器）
 */
class Computer{

	/*
	 * 默认的锁是 this
	 */
	public synchronized void show(){
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("show");
		}
		
	}
	
	/*
	 * 默认的锁是 this
	 */
	public synchronized void show2(){
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("show2");
		}
	}
	
	/*
	 * 默认的锁是 Computer.class
	 */
	public static synchronized void showStatic1(){
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("showStatic1");
		}
	}
	
	/*
	 * 默认的锁是 Computer.class
	 */
	public static synchronized void showStatic2(){
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("showStatic2");
		}
	}
}

/*
 	如果不同的线程使用的是不同的锁 ： 一定是交替执行
 	如果不同的线程使用的是同一把锁 ： 一定是执行完一个再执行另一个。
 */

public class LockTest {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		
/*		new Thread(){
			@Override
			public void run() {
				c.show(); //两个不同的线程使用的是同一把锁。
			}
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				c.show2();
			}
		}.start();*/
		
		
		System.out.println("-------------------------------------");
		
		
/*		new Thread(){
			@Override
			public void run() {
				new Computer().show(); //两个线程不同的对象，用.class锁为同一把锁，才能锁住，
			}
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				new Computer().show2();
			}
		}.start();*/
		
		
		
		System.out.println("-------------------------------------");
		
		/*
		 * 锁是 Computer.class
		 */
		new Thread(){
			@Override
			public void run() {
				new Computer().showStatic1();//两个不同线程使用的是同一把锁
			}
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				new Computer().showStatic2();
			}
		}.start();
	}
}









