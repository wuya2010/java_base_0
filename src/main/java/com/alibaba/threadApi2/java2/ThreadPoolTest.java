package com.alibaba.threadApi2.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 	线程池(了解)
 */
public class ThreadPoolTest {

	public static void main(String[] args) {

		// 缓存线程池 - （池量已经没有多余的线程）使用多少造多少
		ExecutorService pool = Executors.newCachedThreadPool();
		// 定长线程池 - （线程池中的线程数量是固定的）
		pool = Executors.newFixedThreadPool(1);
 
		// 使用
		pool.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + " aaaaaaaaaaaaaa " + i);
				}
			}
		});

		pool.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + " bbbbbbbbbbbbbbbb " + i);
				}
			}
		});

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " --- " + i);
		}
	}
}
