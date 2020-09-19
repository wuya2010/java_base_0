package com.alibaba.juc.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/*
 * Callable<V>: V代表运行run()后，返回值的类型
 * 
 * 线程只能通过Thread.start()执行！
 * 
 * FutureTask的get()，继承自Future的get()，get()可以获取线程的执行结果。
 * 		会一直阻塞当前线程，直到分线程执行完毕，获取到了结果！
 */
public class MyCallable implements Callable<Integer>{

	// 类似于之前的run()，编写业务逻辑
	@Override
	public Integer call() throws Exception {
		
		int sum=0;
		
		for (; sum< 10; sum++) {
			System.out.println(Thread.currentThread().getName()+"===》"+sum);
			Thread.sleep(500);
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable myCallable=new MyCallable();
		
		/*FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
		
		new Thread(futureTask, "线程A").start();
		
		// 可以获取之前线程运行的结果
		//Integer num = futureTask.get();
		
		//System.out.printlnnum);
		
		System.out.println("主线程结束！");*/
		
		ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
		
		//  使用ThreadPoolExecutor 执行线程池的设置
		//service.set
		
		//java.util.concurrent.ThreadPoolExecutor
		//System.out.println(service.getClass().getName());
		
		service.submit(myCallable);
		service.submit(myCallable);
		service.submit(myCallable);
		
		
		
	}

}
