package com.alibaba.Jvm;

public class JvmDemo02 {
	
	
	// -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
	// Runtime代表运行时环境
	public static void main(String[] args) {
		
		//3611.0M
		System.out.print("最大内存");
		
		System.out.println(Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");
			System.out.print("当前可用内存");
			// 240.9
		System.out.println(Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");
			System.out.print("当前申请内存");
			//243.5M
		System.out.println(Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");

		
	}

}
