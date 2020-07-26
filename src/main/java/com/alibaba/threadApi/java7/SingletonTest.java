package com.alibaba.threadApi.java7;

/*
 	线程安全的单例 ： 懒汉式(必须会)
 */
public class SingletonTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			
			new Thread(){
				public void run() {
					System.out.println(Bank.getInstance());
				}
			}.start();
		}
	}
}

class Bank{
	
	private Bank(){}
	
	private static Bank bank = null;
	
	public static Bank getInstance(){
		
		if(bank == null){ //为了提高效率
			synchronized (Bank.class) {
				if(bank == null){
					bank = new Bank();
				}
			}
		}
		
		return bank;
		
	}
	
}
