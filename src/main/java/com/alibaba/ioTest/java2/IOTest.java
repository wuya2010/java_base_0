package com.alibaba.ioTest.java2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

/**
 	一 流的分类
 		1.按操作数据单位不同分为：字节流(8 bit)，字符流(16 bit)  
		2.按数据流的流向不同分为：输入流，输出流
		3.按流的角色的不同分为：节点流，处理流

	二 四个抽象基类
		InputStream  OutputStream
		Reader		Writer
		
	三 四个节点流
		FileInputStream FileOutputStream
		FileReader	FileWriter
 */
public class IOTest {
	/*
	 	FileOutputStream : 文件输出流(字节流)
	 */
	@Test
	public void test2() throws IOException{
		//1.创建File对象
		File file = new File("aaa.txt");
		//2.创建FileOutputStream对象
		/*
		 	FileOutputStream(File file, boolean append) : 
		 	append的值为true则内容进行追加
		 	append的值为false则内容进行覆盖
		 	append的值默认为false
		 */
		FileOutputStream fos = new FileOutputStream(file);
		//3.写内容
		fos.write("ccccccc".getBytes());
	//	fos.write("ddddddd".getBytes());
		//4.关流
		fos.close();//调用了close才是一次操作的结束
	}

	/*
	 	FileInputStream ： 文件输入流 (字节流)
	 */
	@Test
	public void test() throws Exception{
		//1.创建File对象
		File file = new File("person3.txt");
		//2.创建FileInputStream的对象用来读取文件内容
		FileInputStream fis = new FileInputStream(file);
		//3.读取内容
		/*
		 * read() : 读取一个字符并返回。如果没有更多内容返回-1
		 */
		/*
		int n = fis.read();
		while(n != -1){
			System.out.println((char)n);
			n = fis.read();
		}
		*/
		
	/*	int n = 0;
		while((n = fis.read()) != -1){
			System.out.println((char)n);
		}*/
		
		
		System.out.println("----------------------------------------------------");
		byte[] b = new byte[10];
		/*
		 * read(byte[] b) : 将内容读取到b这个数组中，并返回读取了几个内容，如果没有更多的内容返回-1
		 */
		int len = 0;
		
		while((len = fis.read(b)) != -1){
//			System.out.println("len=" + len);
			//new String(b,0,len) ： 将byte[]转成字符串，将数组中从索引值为0开始长度len的所有元素转成字符串
			System.out.println(new String(b,0,len));
			
//			for (byte c : b) {
//				System.out.println((char)c);
//			}
		}
		//4.关流
		fis.close();
	}
}






