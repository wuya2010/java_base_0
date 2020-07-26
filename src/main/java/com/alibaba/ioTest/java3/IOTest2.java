package com.alibaba.ioTest.java3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

/*
 	字符流实现文件复制 (一般不建议，需要实现文件的复制一般使用字节流)
 */
public class IOTest2 {

	/*
	 	注意：字符流实现文件的复制和编码集（程序的编码集，系统的编码集，文件本身的编码集）有很大的影响
	 */
	@Test
	public void test() throws Exception{
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\aaa.avi");
		FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\bbb.avi");
		
		//一边读一边写
		char[] c = new char[1024];
		int len = 0;
		while((len = fr.read(c)) != -1){
			//写数据
			fw.write(c, 0, len);
		}
		
		//关流
		fw.close();
		fr.close();
	}
}
