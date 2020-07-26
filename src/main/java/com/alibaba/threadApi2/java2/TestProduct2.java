package com.alibaba.threadApi2.java2;

class Clerk2 { // 售货员
	private int product = 0;

	/*
	 * 添加商品
	 */
	public  synchronized void addProduct() {
		if (product >= 20) {
			try {
				wait(); // 将生产者的线程wait
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			product++;
			System.out.println("生产者生产了第" + product + "个产品");
			// 唤醒所有线程 （消费者）
			notifyAll();
		}
	}

	/*
	 * 卖出商品
	 */
	public  synchronized void getProduct() {
		if (this.product <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("消费者取走了第" + product + "个产品");
			product--;
			// 唤醒所有线程 （生产者）
			notifyAll();
		}
	}
}

public class TestProduct2 {
	public static void main(String[] args) {
		Clerk2 clerk = new Clerk2();

		/*
		 * 生产者
		 */
		Thread productor = new Thread() {
			public void run() {

				System.out.println("生产者开始生产产品");
				while (true) {
					try {
						Thread.sleep((int) Math.random() * 1000);
					} catch (InterruptedException e) {
					}
					clerk.addProduct();
				}

			}
		};

		/*
		 * 消费者
		 */
		Thread consumer = new Thread() {
			public void run() {
				System.out.println("消费者开始取走产品");
				while (true) {
					try {
						Thread.sleep((int) Math.random() * 1000);
					} catch (InterruptedException e) {
					}
					clerk.getProduct();
				}
			}
		};

		productor.start();
		consumer.start();
	}
}
