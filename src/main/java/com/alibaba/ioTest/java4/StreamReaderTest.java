package com.alibaba.ioTest.java4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * 转换流：
 * 
 * 作用 ： 1.在读取内容时可以将字节流转成字符流，在写内容时可以将字符流转成字节流
 * 2.可以将读取文件的内容的编码集(gbk)，在写入到另一个文件时将内容的编码集转成另一种(utf-8)
 */
public class StreamReaderTest {

	/*
	 * 2.可以将读取文件的内容的编码集(gbk)，在写入到另一个文件时将内容的编码集转成另一种(utf-8)
	 * 
	 *  注意 ：　InputStreamReader中设置的编码集必须和读取文件内容的编码集一致。
	 */
	@Test
	public void test2() throws IOException {
		// 1.创建流的对象
		// 1.1创建FileInputStream的对象
		FileInputStream fis = new FileInputStream("char8.txt");
		// 1.2创建InputStreamReader : 将字节流转成字符流
		InputStreamReader isr = new InputStreamReader(fis,"gbk");

		// 1.3创建FileOutputStream的对象
		FileOutputStream fos = new FileOutputStream("char9.txt");
		// 1.4创建OutputStreamWriter : 将字符流转成字节流
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

		// 2.一边读一边写
		char[] c = new char[1024];
		int len = 0;
		while ((len = isr.read(c)) != -1) {
			// 写数据 - 以字符的形式写出来
			osw.write(c, 0, len);
		}

		// 3.关流
		osw.close();
		isr.close();
		fos.close();
		fis.close();
	}

	/*
	 * 1.在读取内容时可以将字节流转成字符流，在写内容时可以将字符流转成字节流
	 */
	@SuppressWarnings("resource")
	@Test
	public void test() throws Exception {

		// 1.创建流的对象
		// 1.1创建FileInputStream的对象
		FileInputStream fis = new FileInputStream("person.txt");
		// 1.2创建InputStreamReader : 将字节流转成字符流
		InputStreamReader isr = new InputStreamReader(fis);

		// 1.3创建FileOutputStream的对象
		FileOutputStream fos = new FileOutputStream("person2.txt");
		// 1.4创建OutputStreamWriter : 将字符流转成字节流
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		// 2.一边读一边写
		char[] c = new char[1024];
		int len = 0;
		while ((len = isr.read(c)) != -1) {
			// 写数据 - 以字符的形式写出来
			osw.write(c, 0, len);
		}

		// 3.关流
		osw.close();
		isr.close();
		fos.close();
		fis.close();

	}

	/**
	 * 显示所有的内容
	 * 
	 * @param is
	 */
	public void show(InputStream is) {

	}
}
