package com.alibaba.Desinger.exer3;

/*
 * 快速生成setters/getters方法
 * 
 * shift + alt + s
 */
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	
	/**
	 * 构造器
	 * @return
	 */
	public Account() {
		
	}
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withdraw (double amount){//取钱
		//判断余额是否足够
		if(amount > balance){
			System.out.println("余额不足");
		}else{
			balance -= amount;
		}
	}
	
	public void deposit (double amount){//存钱
		this.balance += amount;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	
}
