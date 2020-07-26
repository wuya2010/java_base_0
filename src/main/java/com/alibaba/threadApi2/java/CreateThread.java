package com.alibaba.threadApi2.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 	创建一个带返回值的线程（面试经常会问）
 	1.自定义一个类并实现Callable接口
 	2.重写call方法
 	3.在call方法中实现需要在分线程中实现的功能
 	4.创建Callable实现类的对象
 	5.创建FutureTask对象，并将Callable实现类的对象作为实参传入到FutureTask构造器中
 	6.创建Thread对象，并将FutureTask对象作为实参传递到Thread构造器中
 	7.调用start方法
 	
 	
 */
public class CreateThread {

	public static void main(String[] args) throws Exception, Exception {
		
		//4.创建Callable实现类的对象
		MyCallable myCallable = new MyCallable();
		//5.创建FutureTask对象，并将Callable实现类的对象作为实参传入到FutureTask构造器中
		FutureTask<String> task = new FutureTask<String>(myCallable);
		//6.创建Thread对象，并将FutureTask对象作为实参传递到Thread构造器中
		Thread t = new Thread(task);
		//7.调用start方法
		t.start();
		
		
		
		/*
		 * get() : 获取分线程的返回值，一旦调用get方法当前线程会阻塞，直到获取返回值当前线程再继续执行。
		 */
		//获取返回值
		String str = task.get();
		System.out.println(str);
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "======" + i);
		}
		
		
		
		
	}
}

//1.自定义一个类并实现Callable接口
class MyCallable implements Callable<String>{

	//2.重写call方法
	@Override
	public String call() throws Exception {
		//3.在call方法中实现需要在分线程中实现的功能
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "======" + i);
		}
		return "aaa";
	}
	
}
