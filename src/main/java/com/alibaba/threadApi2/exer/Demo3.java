package com.alibaba.threadApi2.exer;
/*
 	有2个账户分别向同一个卡上取钱（10000），每次都取1000
 */

class Account {

	private double balance = 10000;

	public synchronized void withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			System.out.println("成功取出1000" + " 余额为" + balance);
		} else {
			System.out.println("取款失败" + balance);
		}
	}

}

public class Demo3 {

	public static void main(String[] args) {
		Account account = new Account();
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					account.withdraw(1000);
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					account.withdraw(1000);
				}
			}
		}.start();
	}
}
