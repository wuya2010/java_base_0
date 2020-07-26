package com.alibaba.OverwriteFunc.exer3;

public class Bank {

	private Customer[] customers; //用来保存用户
	private int numberOfCustomer; //用来记录用户的数量
	
	public Bank(){
		//对数组进行初始化
		customers = new Customer[10];
	}
	
	/**
	 * 获取指定的用户
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index){
		//校验 - 索引值是否在合理的范围之内
		if(index >= 0 && index < numberOfCustomer){
			return customers[index];
		}
		return null;
	}
	
	public void addCustomer(Customer cus){
		//校验  ：数组是否已满
		if(numberOfCustomer < customers.length){
			//添加用户
			customers[numberOfCustomer] = cus;
			//下角标+1 （1.下一次要添加数据的索引值的位置 2.当前用户的数量）
			numberOfCustomer++;
		}
	}
	
	/**
	 * 获取用户的数量
	 * @return
	 */
	public int getNumberOfCustomer(){
		return numberOfCustomer;
	}
}
