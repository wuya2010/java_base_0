package com.alibaba.threadApi.java5;

/*
 	模拟火车站售票程序，开启三个窗口售票 (三个窗口一共卖100张票)
 	
 	发生的问题 ： 发生了重票，错票（负票）的问题
 	
 	发生的原因 ： 多个线程操作共享数据时，当一个线程操作共享数据还没有结束时，其它线程进入操作共享数据的问题
 	
 	解决问题的思路 ： 在操作共享数据时同时只能有一个线程进行操作，当一个线程操作完毕后另一个线程才能继续进行操作
 	
 	Java中提供的解决方式：
 		1.同步代码块
 		2.同步方法
 */
public class TicketTest {

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

	static int tick = 100;
	
	@Override
	public void run() {
		while(true){
			if(tick > 0){
				System.out.println(Thread.currentThread().getName() + " === " + tick);
				tick--;
				
			}else{
				return;
			}
		}
	}
}










