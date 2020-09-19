package com.alibaba.Jvm;

public class JvmDemo04 {
	
	private static int count;
	
	// 10719
	public static void count(){
		
		try {
			count++;
			count(); // 递归
		} catch (Throwable e) {
			System.out.println("最大深度:"+count);
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
			 count();
	}


}
