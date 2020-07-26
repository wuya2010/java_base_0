package com.alibaba.threadApi2.java3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 	将线程池封装成单例：线程池(了解)
 */
public class ThreadPoolTest {

	
	private ThreadPoolTest(){}
	
	private static ThreadPoolTest tt = new ThreadPoolTest();
	
	//属性
	private static ExecutorService pool = Executors.newCachedThreadPool();
	
	
	public static ThreadPoolTest getInstance(){
		return tt;
	}
	
	
	public void run(Runnable runnable){
		pool.execute(runnable);
	}

}








