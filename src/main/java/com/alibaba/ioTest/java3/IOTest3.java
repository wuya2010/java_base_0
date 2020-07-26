package com.alibaba.ioTest.java3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 	字符缓冲流
 */
public class IOTest3 {
	
	/*
	 	BufferedWriter : 字符缓冲流（输出流）
	 */
	@Test
	public void test2() throws Exception{
		//1.创建流的对象
		FileWriter fw = new FileWriter("person2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//2.写内容
		bw.write("志玲姐今晚不约你！！！");
		bw.flush(); //将内存中的数据刷新到文件中
		
		//3.关流
		bw.close();//close方法中调用了flush方法
		fw.close();
	}

	/*
	 	BufferedReader : 字符缓冲流（输入流）
	 */
	@Test
	public void test() throws Exception{
		
		//1.创建流的对象
		FileReader fr = new FileReader("person.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//2.读取内容
//		String str = br.readLine(); //读取一整行,如果没有更多的内容返回null
		
		String str = "";
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		//3.关流
		br.close();
		fr.close();
	}
}
