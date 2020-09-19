package com.alibaba.juc.juc;

public class QueryPriceOnTB {
	
	public static double getPrice() {
		
		System.out.println(Thread.currentThread().getName()+"===》开始在TB查询当前商品的价格！");
		
		
		return 12d;
	}

}
