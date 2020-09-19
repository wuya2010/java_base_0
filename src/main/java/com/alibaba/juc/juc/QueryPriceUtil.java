package com.alibaba.juc.juc;

import java.util.concurrent.Callable;

public class QueryPriceUtil implements Callable<Double>{

	@Override
	public Double call() throws Exception {
		
		String threadName = Thread.currentThread().getName();
		
		if (threadName.equals("JD")) {
			
			return QueryPriceOnJD.getPrice();
			
		}

		return QueryPriceOnTB.getPrice();
	}

}
