package com.alibaba.threadApi.java3;

/*
 	创建线程的方式 ：实现Runnable接口
 	1. 自定义类并实现Runnable接口
 	2.重写run方法
 	3.在run方法中实现需要在分线程中实现的功能
 	4.创建Runnable接口实现类的对象
 	5.创建Thread类的对象并将Runnable接口的实现类的对象作为实现传入到Thread的构造器中
 	6.调用start方法
 	
 	
 	[面试题]继承Thread和实现Runnable谁更好？
 		1.单继承多实现的角度 ： 实现Runnable的方式更好一些。
 		2.共享数据的角度 ： 
 			继承Thread的方式，类中的共享数据必须使用static修饰，用来保证多个对象操作的是同一份数据
 			实现Runnable的方式 ,类中的共享数据不用特殊处理。因为该接口的实现类的对象只创建一份。
 		3.线程安全：
 			继承Thread的方式，①同步代码块中的监视器不能使用this  ②同步方法必须使用static修饰
 			实现Runnable的方式，①同步代码块中可以使用this  ②同步方法不用使用static修饰
 */
public class CreateThread2 {

	public static void main(String[] args) {
		
		//4.创建Runnable接口实现类的对象
		MyRunnable mr = new MyRunnable();
		//5.创建Thread类的对象并将Runnable接口的实现类的对象作为实现传入到Thread的构造器中
		Thread t = new Thread(mr);
		//6.调用start方法
		t.start();
		
		//思考 ：如何创建多个线程? 需要再创建Thread类的对象即可
		Thread t2 = new Thread(mr);
		t2.start();
		
		//使用匿名内部类创建对象
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("runnable-------------------");
				}
			}
		}).start();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
}

//1. 自定义类并实现Runnable接口
class MyRunnable implements Runnable{

	//2.重写run方法
	@Override
	public void run() {
		//3.在run方法中实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
	
}
