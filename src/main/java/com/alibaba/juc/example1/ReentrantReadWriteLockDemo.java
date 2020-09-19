package com.alibaba.juc.example1;

import java.util.concurrent.locks.ReentrantReadWriteLock;


//ReentrantReadWriteLock使用这个类，当write时，其他任何线程（读或者写）都进不来；（排他锁）
//在进行read操作时，只有read可以进来，write不能进来（共享锁）
class DYY {
	
	private Object film="无放映内容！";
	
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	
	// 工作人员换场
	public void work(Object film) {
		
		try {
			// 使用写锁上锁
			lock.writeLock().lock();
			
			Thread.sleep(5000);
			
			this.film=film;
			
			System.out.println(Thread.currentThread().getName()+"===》工作人员切换电影！");
			
		} catch (Exception e) {
		}finally {
			lock.writeLock().unlock();
		}
		
		
	}
	
	
	
	// 观众入场
	public void watch() {
		
		try {
			// 使用写锁上锁
			lock.readLock().lock();
			
			System.out.println(Thread.currentThread().getName()+"看电影！====》"+film);
			
			Thread.sleep(3000);
			
		} catch (Exception e) {
		}finally {
			
			System.out.println(Thread.currentThread().getName()+"退场！");
			
			lock.readLock().unlock();
		}
		
		
	}

}



//上一个线程的执行不会对下一个线程造成阻塞

public class ReentrantReadWriteLockDemo {
	
	public static void main(String[] args) {
		
		
		DYY dyy = new DYY();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				dyy.watch();
				
			}
		}, "吃瓜群众F").start();
		
		
		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				dyy.work("<奥特曼2>");
			}
		}, "放映员E").start();
		
		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				dyy.work("<奥特曼>");
			}
		}, "放映员C").start();
		
		
		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				dyy.watch();
				
			}
		}, "吃瓜群众A").start();
		
		
		
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				dyy.watch();
			}
		}, "吃瓜群众B").start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				dyy.watch();
				
			}
		}, "吃瓜群众D").start();
			
		
	}

}





//		吃瓜群众F看电影！====》无放映内容！
//		吃瓜群众F退场！
//		放映员E===》工作人员切换电影！
//		放映员C===》工作人员切换电影！-------------->read的时候，其他线程也可以进来
//		吃瓜群众A看电影！====》<奥特曼>
//		吃瓜群众B看电影！====》<奥特曼>
//		吃瓜群众D看电影！====》<奥特曼>
//		吃瓜群众A退场！
//		吃瓜群众D退场！
//		吃瓜群众B退场！