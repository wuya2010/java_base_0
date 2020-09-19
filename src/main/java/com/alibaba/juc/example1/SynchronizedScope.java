package com.alibaba.juc.example1;

/*
 * 锁的作用范围：
 *  静态同步方法，采用隐式锁，一个类中的所有的静态同步方法都默认使用类名.class作为锁！
 *  同步方法，采用隐式锁，一个类中的所有的同步方法都默认使用this(当前对象)作为锁！
 *  普通方法和同步方法无关！
 */
class Phone{
	
	
	//默认锁： 类名.class
	public  static synchronized void sendSMS() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"===>发送了SMS");
		
		
	}
	
	
	
	//默认锁： this，与具体方法无关
	public  static synchronized void sendEmail() {
		
		System.out.println(Thread.currentThread().getName()+"===>发送了Email!");
		
	}
	
	public  void sayHello() {
		
		System.out.println(Thread.currentThread().getName()+"===>salHello");
		
	}
}





//主进程
public class SynchronizedScope {
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		
		//线程A(锁与方法)
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				phone1.sendSMS();
				
			}
		}, "线程A").start();
		
		
		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//线程B
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				phone1.sendEmail();
			}
		}, "线程B").start();
	}

}
