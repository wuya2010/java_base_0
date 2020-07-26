package com.alibaba.threadApi2.exer;

/*
 1. 案例题目描述:编写龟兔赛跑多线程程序，设赛跑长度为30米
乌龟和兔子每跑完10米输出一次结果。
兔子的速度是10米每秒,兔子每跑完10米休眠的时间10秒
乌龟的速度是1米每秒,乌龟每跑完10米的休眠时间是1秒

2. 案例完成思路要求：
1)乌龟定义一个线程,兔子定义一个线程
2)两个线程同时开启
3)提示：可以使用Thread.sleep(毫秒数)来模拟耗时

 */
public class RabbitTest {

	public static void main(String[] args) {

		/*
		 * 乌龟
		 */
		Thread t = new Thread() {
			public void run() {

				for (int i = 1; i <= 30; i++) {
					//1米每秒
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if(i % 10 == 0){
						System.out.println(Thread.currentThread().getName() + "跑了" + i);
						
						//如果已经跑到终点那么就不需要休息了
						if(i == 30){
							return;
						}
						
						//每跑完10米休息1秒
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};

		/*
		 * 兔子
		 */
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 30; i++) {
					if(i % 10 == 0){
						//10米每秒
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println(Thread.currentThread().getName() + "跑了" + i);
						
						//如果已经跑到终点那么就不需要休息了
						if(i == 30){
							return;
						}
						//每跑完10米休息10秒
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						
					}
				}
			}
		};

		t.setName("乌龟");
		t2.setName("兔子");
		t.start();
		t2.start();

	}
}
