package com.alibaba.threadApi.java3;

/*
 	创建线程 ： 继承Thread 和 实现Runnable接口
 	
 	第一种创建线程方式 ： 继承Thread
 	1.自定义一个类并继承Thread
 	2.重写Thread类中的run方法
 	3.在run方法中实现需要在分线程中实现的功能
 	4.创建Thread子类的对象
 	5.调用start方法	
 	
 	
 */
public class CreateThread {

	public static void main(String[] args) {

		// 4.创建Thread子类的对象
		MyThread mt = new MyThread("线程一");
		// 5.调用start方法
		mt.start(); // 作用 ：①开启分线程 ②调用run方法

		// 思考 ： 可以直接调用run方法吗？ 并没有开启分线程
		// mt.run();

		// 思考 ：如何开启多个线程？ - 需要开启几个分线程就创建几个Thread子类的对象
		// mt.start(); 同一个Thread的子类的对象不能调用两次start方法会抛异常
		MyThread mt2 = new MyThread("线程二");
		mt2.start();

		/*
		 * 作业 ： 开启两个分线程，一个输出100以内的偶数，一个输出100以内的奇数
		 * 
		 * 利用匿名内部类创建
		 */
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				}
			}
		};
		t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i + "=======================");
		}

	}
}

// 1.自定义一个类并继承Thread
class MyThread extends Thread {
	
	public MyThread(){
		
	}
	
	/*
	 * 通过构造器给线程起名字
	 */
	public MyThread(String name){
		super(name); //调用父类中的构造器
	}
	
	// 2.重写Thread类中的run方法
	@Override
	public void run() {

		// 3.在run方法中实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			// Thread.currentThread().getName() : 获取当前线程的名字
			System.out.println(Thread.currentThread().getName() + "我是一个分线程");
		}
	}
}
