package com.alibaba.juc.example1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 模拟饭店上菜过程,每个工人同时只负责一道菜的处理！
 * 		饭店有三个小工：
 * 			配菜工： 小张
 * 			炒菜工： 小王
 * 			传菜工： 小李
 * 
 * 		严格按照： 配菜完毕---唤醒炒菜---唤醒传菜---唤醒配菜---
 * 
 * 练习：  完成十道菜！
 */
class CookPlace{
	
	// 每个人干活的状态
	// 每个人完成工作后，需要修改当前菜的状态，唤醒下一个处理的工序方法
	// 0: 需要配菜   1：需要炒菜  2：需要传菜
	private int status=0;
	
	private ReentrantLock lock=new ReentrantLock(true);
	
	private Condition cutCondition=lock.newCondition();
	private Condition cookCondition=lock.newCondition();
	private Condition passCondition=lock.newCondition();
	
	//切菜
	public void cut() {
		
		lock.lock();
		
		try {
			
			while(status!=0) {
				
				try {
					cutCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//当status为0时
			System.out.println(Thread.currentThread().getName()+"===》配菜完毕！");
			
			status=1;
			
			// 唤醒炒菜师父: 具体唤醒某位
			cookCondition.signal();
			
		} finally {
			lock.unlock();
		}
		
		
	}
	
	
	
	
	//做菜
	public void cook() {
		
		lock.lock();
		
		try {
			
			while(status!=1) {
				
				try {
					cookCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//当status为0时
			System.out.println(Thread.currentThread().getName()+"===》炒菜完毕！");
			
			status=2;
			
			// 唤醒传菜师父： pass唤醒传菜的
			passCondition.signal();
			
		} finally {
			lock.unlock();
		}
		
		
	}
	
	
	
	
	
	// 传菜
	public void pass() {
		
		lock.lock();
		
		try {
			
			while(status!=2) {
				
				try {
					passCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//当status为0时
			System.out.println(Thread.currentThread().getName()+"===》传菜完毕！");
			
			status=0;
			
			// 唤醒炒菜师父
			cutCondition.signal();
			
		} finally {
			lock.unlock();
		}
		
	}
	
}

/*
 * 配菜工： 小张
 * 			炒菜工： 小王
 * 			传菜工： 小李
 */
public class ConditionExcecise {
	
	public static void main(String[] args) {
		
		
		//在主线程中，利用对象调用不同的方法实现不同线程的功能
		CookPlace cookPlace = new CookPlace();
		
		
		
		// 创建三个线程，模拟三个小工
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					cookPlace.cut();
					
				}
				
			}
		}, "配菜工： 小张").start();
		
		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					cookPlace.cook();
					
				}
			}
		}, "炒菜工： 小王").start();
		
		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					cookPlace.pass();
					
				}
				
			}
		}, "传菜工： 小李").start();
		
		
		
	}

}
