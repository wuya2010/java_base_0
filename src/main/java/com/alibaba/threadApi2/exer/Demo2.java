package com.alibaba.threadApi2.exer;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

/*
 * 编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）
 * 产生一个0-100之间的随机整数，打印后将该整数放到集合中；
共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；

 */
public class Demo2 {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Long> list = new ArrayList();
		
		
		Thread t = new Thread(){
			@Override
			public void run() {
				
				
				for (int i = 0; i < 100; i++) {
					
				
					long  number = Math.round(Math.random() * 100);
					
					list.add(number);
					
					int time = new Random().nextInt(200);
					
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				
//				System.out.println(list);
				
			}
		};
		
		t.start();
		
		//等待分线程执行完毕再执行主线程
		try {
//			t.join();
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(list);
	}
}
