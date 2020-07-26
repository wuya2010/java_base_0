package com.alibaba.threadApi.java2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

/*
 	第三方IO流的框架的演示
 */
public class FileUtilsTest {

	private FileUtils fu = new FileUtils();

	/**
	 * 读内容
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception{
		
		
		
		String readFileToString = fu.readFileToString(new File("123.txt"), "utf-8");
		
		System.out.println(readFileToString);
	}
	
	/**
	 * 写内容
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		
		fu.writeStringToFile(new File("123.txt"), "hello", "utf-8");
	}
}
