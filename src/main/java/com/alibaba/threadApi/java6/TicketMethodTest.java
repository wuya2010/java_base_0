package com.alibaba.threadApi.java6;

/*
 	Java中提供的解决方式：
 		1.同步代码块
 		2.同步方法
 		
 	一 同步方法：
 		格式 ：  权限修饰符  synchronized 返回值类型   方法名（形参列表）{
 					方法体;
 			  }
 		说明：
 			1.在实现Runnable的方式中，同步方法不用加static默认的监视器（锁）是this
 			2.在继承Thread的方式中，同步方法必须加static默认的监视器就是 (当前类.class)
 			
 
 	二 思考 ：使用线程同步的优缺点？
 	  优点 ： 保证了线程的安全
 	  缺点 ：操作共享数据的代码同时只能有一个线程进行操作，降低了效率
 */
public class TicketMethodTest {

	public static void main(String[] args) {
//		MyRunn mr = new MyRunn();
//
//		Thread t1 = new Thread(mr);
//		Thread t2 = new Thread(mr);
//		Thread t3 = new Thread(mr);
//
//		t1.start();
//		t2.start();
//		t3.start();
		
		System.out.println("------------------------继承Thread的方式------------------");
		
		MyThr t1 = new MyThr();
		MyThr t2 = new MyThr();
		MyThr t3 = new MyThr();

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class MyThr extends Thread{
	//注意：必须使用static修饰，否则每个对象中都存在一份
	static int tick = 100;
	
	@Override
	public void run() {
		while (true) {
			//调用同步方法
			boolean isBuy = buy();
			
			if(!isBuy){
				return;
			}
		}
	}
	
	/*
	 * 同步监视器 ： 当前类的运行时类的对象 （MyThr.class）
	 * 		三个对象拥有的是同一把锁（Class clazz = MyThr.class）
	 * 
	 * 注意 ： 在继承Thread的方式中的同步方法必须加static ，用来保证多个线程使用的是同一把锁
	 */
	public static synchronized boolean buy(){
		if (tick > 0) {

			System.out.println(Thread.currentThread().getName() + " === " + tick);
			tick--;
			
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}
}





class MyRunn implements Runnable {

	int tick = 100;

	@Override
	public void run() {
		while (true) {
			//调用同步方法
			boolean isBuy = buy();
			
			if(!isBuy){
				return;
			}
		}

	}
	
	/*
	 * 同步方法  ： 同步监视器（锁）默认为this
	 */
	public synchronized boolean buy(){
		//操作共享数据的代码
		if (tick > 0) {

			System.out.println(Thread.currentThread().getName() + " === " + tick);
			tick--;

			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return true;
		} else {
			return false;
		}
	}
}
 