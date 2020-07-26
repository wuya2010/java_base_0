package com.alibaba.OverwriteFunc.exer3;

/*
 * 快速生成setters/getters方法
 * 
 * shift + alt + s
 * 
 * 删除一行 ： ctrl + d
 */
public class Account {
	private double balance;
	
	/**
	 * 构造器
	 * @return
	 */
	public Account() {
		
	}
	
	public Account( double balance) {
		this.balance = balance;
	}
	
	public void withdraw (double amount){//取钱
		//判断余额是否足够
		if(amount > balance){
			System.out.println("余额不足，取款失败");
		}else{
			balance -= amount;
			System.out.println("成功取成 ：" + amount);
		}
	}
	
	public void deposit (double amount){//存钱
		this.balance += amount;
		System.out.println("成功存入:" + amount);
	}


	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
