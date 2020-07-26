package com.alibaba.OverwriteFunc.exer3;

public class Test {

	public static void main(String[] args) {
		
		//创建一个银行的对象
		Bank bank = new Bank();
		//创建一个用户
		Customer customer = new Customer("小", "龙哥");
		//创建一个账户
		Account account = new Account(500000);
		
		//将用户和账户进行关联
		customer.setAccount(account);
		//将银行和用户关系 - 银行的数组中存放用户
		bank.addCustomer(customer);
		
		System.out.println("--------------------------------");
		//对小龙哥的账户存放1000元
		bank.getCustomer(0).getAccount().deposit(1000);
		//输出小龙哥的余额
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println(balance);
	}
}
