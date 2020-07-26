package com.alibaba.ioTest.java;

import java.io.File;

import org.junit.Test;

/**
 	File类：
 	
 	说明：
 		1.File类是java.io包下的
 		2.File可以用来表示一个文件(.txt , .mp3 , .mp4 , .avi)或者目录。
 		3.File类只可以用来创建文件或者目录。可以获取文件的信息或者删除目录删除文件等操作。
 				但是没有向文件中写数据的功能。如果要向文件中写内容那么需要使用IO流。
 		4.一般我们会将File类的对象作为实参传递到IO流的构造器中。
 */
public class FileTest {
	
	/**
	 * 绝对路径 ：包含盘符在内的完整路径
	 * 相对路径 ：相对于当前工程下 
	 */
	@Test
	public void test2(){
		//绝对路径 ：包含盘符在内的完整路径
		new File("E:\\0508\\code\\day22\\123.txt");
		//相对路径 ：相对于当前工程下
		new File("123.txt");
	}

	/**
	 * 使用File表示一个文件或目录
	 */
	@Test
	public void test(){
		/*
		 * 路径分隔符 ：  / 或  \\  或  File.separator
		 */
		//创建File对象，用来表示一个文件
		File file = new File("E:/io\\aaa.txt");
		new File("E:" + File.separator + "io" + File.separator + "aaa.txt");
		
		//创建File对象，用来表示一个文件
		new File("E:/io","aaa.txt"); //相当于 E:/io/aaa.txt
		
		//创建File对象，用来表示一个目录
		new File("E:/io");
	}
}











