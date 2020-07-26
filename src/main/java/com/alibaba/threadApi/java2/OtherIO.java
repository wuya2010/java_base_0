package com.alibaba.threadApi.java2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class OtherIO {
	
	/*
	 * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
	 * 直至当输入“e”或者“exit”时，退出程序。
	 * 
	 * 1.System.in是一个字节流
	 * 2.将字节流转换成字符流
	 * 3.需要使用到字符缓冲流一行一行的读取内容（字符缓冲流只能套在字符流上）
	 */
	@Test
	public void test3() throws Exception{
		//1.创建流对象
		//1.1 将字节流转成字符流
		InputStreamReader is = new InputStreamReader(System.in);
		//1.2将字符缓冲流套在字符流上
		BufferedReader br = new BufferedReader(is);
		
		//2.读取内容
		while(true){
			String str = br.readLine();
			//判断是否退出
			if("e".equals(str) || "exit".equals(str)){
				//退出
				//关流
				br.close();
				is.close();
				return;
			}
			
			//不退出就将内容转成大写并输出
			System.out.println(str.toUpperCase());
		}
	}
	
	/*
	 * 标准输入输出流：
	 * System.in : 输入(从键盘读取)
	 * System.out : 输出
	 */
	@Test
	public void test2(){
		
	}

	/*
	 * 打印流：PrintStream和PrintWriter
	 */
	@Test
	public void test() throws Exception {

		FileOutputStream fos = new FileOutputStream("text.txt");
		// 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
		PrintStream ps = new PrintStream(fos, true);

		if (ps != null) {// 把标准输出流(控制台输出)改成文件
			System.setOut(ps);
		}

		for (int i = 0; i <= 255; i++) { // 输出ASCII字符
			System.out.print("a");
		}

		ps.close();

	}
}
