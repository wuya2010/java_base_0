package com.alibaba.ioTest.java2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 	字节缓冲流
 */
public class IOTest3 {
	
	/*
	 	BufferedOutputStream : 字节缓冲输出流
	 */
	@Test
	public void test2() throws Exception{
		
		//1.创建节点流的对象
		FileOutputStream fos = new FileOutputStream("bbc.txt");
		//2.创建缓问流的对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//3.写数据
		bos.write("aaaaaaaaaaaaaaaaa".getBytes());
		//4.关流
		bos.close();
		fos.close();
	}

	/*
	 	BufferedInputStream : 字节缓冲输入流
	 */
	@Test
	public void test() throws IOException{
		
		//1.创建节点流的对象
		FileInputStream fis = new FileInputStream("aaa.txt");
		//2.创建缓冲流的对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//3.读数据
		byte[] b = new byte[1024];
		int len = 0;
		while((len = bis.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
		
		//4.关流 - 先关外面的再关里面的
		bis.close();
		fis.close();
		
	}
}














