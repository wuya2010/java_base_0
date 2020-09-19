package com.alibaba.juc.juc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * Future一般是结合 Callable一起使用
 * 		get()通常是一个线程需要等待其他线程的执行完成后，才能继续向下运行。执行get()让当前线程阻塞。
 * 
 * Kafka会使用Future:
 * 		Kafka是一个消息中间件。
 * 		在Kafka中每条消息都有一个id，id唯一的，是递增的。
 * 		Kafka中收消息的角色称之为消费者，消费者一次收一批消息，消费者需要记录本次这批消息收到哪条了。
 * 			收消息是一个线程。
 * 			记录消息的id是另外一个线程。
 * 
 * 		同步的消费： 收完，记录，效率低。安全！
 * 					 在消费者的主线程，在记录消费的id之前，调用收集线程(返回Future)的get()
 * 		异步的消费：收集和记录 互不干扰。  效率高
 * 			在kafka中默认是异步消费！
 * 
 * 
 * 	当多个线程同时使用同一个FutureTask，调用其get()，只要有一个线程已经提前执行完毕，所有get()会立刻返回执行的结果	
 *   还没有执行完或者还没有执行的线程则不会再运行线程。		
 */
public class ComparePrice {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		QueryPriceUtil queryPriceUtil = new QueryPriceUtil();
		
		FutureTask<Double> futureTask1 = new FutureTask<>(queryPriceUtil);
		FutureTask<Double> futureTask3 = new FutureTask<>(queryPriceUtil);
		FutureTask<Double> futureTask2 = new FutureTask<>(queryPriceUtil);
		
		// 开启线程查询
		new Thread(futureTask1, "JD").start();
		new Thread(futureTask2, "TB").start();
		
		Double jdPrice = futureTask1.get();
		Double tbPrice = futureTask2.get();
		
		if (jdPrice<tbPrice) {
			System.out.println("此商品JD价格更划算,低至："+jdPrice);
		}else {
			System.out.println("此商品TB价格更划算,低至："+tbPrice);
		}
		
		// 第二次查询JD
		new Thread(futureTask3, "JD").start();
		Double jdPrice2 = futureTask3.get();
		
		System.out.println(jdPrice2);
		
		
	}

}
