package com.alibaba.threadApi2.java2;

/*
 	需求 ： 两个线程交替执行输出0 - 100
 */
public class NotifyTest2 {

	public static void main(String[] args) {
		
		MyRun myRun = new MyRun();
		
		new Thread(myRun).start();
		new Thread(myRun).start();
	}
}


class MyRun implements Runnable{

	int number = 100;
	Object obj = new Object();
	
	@Override
	public void run() {
		
		while(true){
			
			synchronized (obj) {
				//调用的是锁这个对象的方法
				obj.notifyAll();
				
				if(number >= 0){
					System.out.println(Thread.currentThread().getName() + " ----- " + number);
					number--;
				}else{
					return;
				}
				
				try {
					//调用的是锁这个对象的方法
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
