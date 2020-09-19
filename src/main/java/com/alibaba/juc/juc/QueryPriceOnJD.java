package com.alibaba.juc.juc;

public class QueryPriceOnJD {
	
	public static double getPrice() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"===》开始在JD查询当前商品的价格！");
		
		
		return 11d;
	}

}
