package com.alibaba.OverwriteFunc.exer2;

public class Test {

	/*
	 * （1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息

成功存入 ：100.0
成功取出：960.0
余额不足，取款失败
Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0

	 */
	public static void main(String[] args) {
		//创建对象
		Customer customer = new Customer("Jane", "Smith");
		//创建账户
		Account account = new Account(1000, 2000, 0.0123);
		//是将用户和账户进行关联
		customer.setAccount(account);
		
		//存入 100 元 - 拿到Jane Smith的账号存钱
		customer.getAccount().deposit(100);
		//再取出960元
		customer.getAccount().withdraw(960);
		//再取出2000元
		customer.getAccount().withdraw(2000);
		
		System.out.println("Customer [" + customer.getFirstName() +", " 
					+ customer.getLastName() +"] has "
				+ "a account: id is "+ customer.getAccount().getId() +", "
				+ "annualInterestRate is " + customer.getAccount().getAnnualInterestRate() * 100 + "％, "
				+ "balance is " + customer.getAccount().getBalance());
		
		System.out.println("------------------------");
		
		Account a = customer.getAccount();
		System.out.println("Customer [" + customer.getFirstName() +", " 
				+ customer.getLastName() +"] has "
			+ "a account: id is "+ a.getId() +", "
			+ "annualInterestRate is " + a.getAnnualInterestRate() * 100 + "％, "
			+ "balance is " + a.getBalance());
	}
}
