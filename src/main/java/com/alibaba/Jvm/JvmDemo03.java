package com.alibaba.Jvm;

import java.util.ArrayList;
import java.util.List;

public class JvmDemo03 {
	
	public static void main(String[] args) {
		
		
		// -XX:+HeapDumpOnOutOfMemoryError ： 在当前项目下，一旦发生OOM，将堆的快照抓取输出
		// -Xms1m -Xmx10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
		List<Object> listObject = new ArrayList<>();
				
		for (int i = 0; i < 10; i++) {
					
			System.out.println("i:" + i);
			Byte[] bytes = new Byte[1 * 1024 * 1024]; // 1m
			listObject.add(bytes);
		}
		
		System.out.println("添加成功...");

		
	}

}
