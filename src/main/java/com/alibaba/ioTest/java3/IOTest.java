package com.alibaba.ioTest.java3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 	字符流
 */
public class IOTest {
	
	/*
	 	FileWriter : 文件输出流(字符)
	 */
	@Test
	public void test2() throws Exception{
		
		//1.创建流的对象
		FileWriter fw = new FileWriter("person2.txt");
		//2.写数据
		fw.write("中国你好呀");
		//3.关流
		fw.close();
	}

	/*
	 	FileReader : 文件输入流（字符）
	 */
	@Test
	public void test() throws Exception{
		//1.创建流的对象
		FileReader reader = new FileReader("person.txt");
		//2.读取内容
		char[] c = new char[1024];
		int len = 0;
		while((len = reader.read(c)) != -1){
			System.out.println(new String(c,0,len));
		}
		
		//3.关流
		reader.close();
	}
}
