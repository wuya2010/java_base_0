package com.alibaba.threadApi2.exer;

import java.util.Random;
import java.util.Scanner;

/*
 * 在main方法中创建并启动两个线程。第一个线程循环随机打印100以内的整数，直到第二个线程从键盘读取了“Q”命令。
 */
public class Demo {

	public static void main(String[] args) {
		
		//todo: final 的用法
		final Thread t = new Thread(){
			@Override
			public void run() {
			
				while(true){
					Random random = new Random();
					int number = random.nextInt(100); //[0,100)
					System.out.println(number);

					
					/*
					 * 当前线程被其它线程调用interrupt方法时，如果当前线程正在sleep就会抛出异常
					 * InterruptedException
					 */
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
//						e.printStackTrace();
						return;
					}
				}
			}
		};

		t.start();
		
		
		new Thread(){
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				String str = scanner.next();
				if("q".equals(str)){
					t.interrupt();
				}
			}
		}.start();
		
	}
}
