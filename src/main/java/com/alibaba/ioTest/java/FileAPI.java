package com.alibaba.ioTest.java;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileAPI {
	
	/*
	public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
	public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上父目录不存在，也不创建。
	public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
	 */
	@Test
	public void test7(){
		File file = new File("E:/io/io/ccc");
		file.mkdirs();
	}
	@Test
	public void test6() throws IOException{
		
		File file = new File("E:/io/ccc.txt");
		
		if(file.exists()){
			System.out.println("该文件已经存在");
			file.delete();//删除文件或目录
		}else{
			System.out.println("该文件不存在");
			//注意 ： 创建的文件的父目录必须存在，否则会抛出异常
			file.createNewFile();//创建文修的
		}
	}
	
	/*
	 public boolean isDirectory()：判断是否是文件目录
	 public boolean isFile() ：判断是否是文件
	 public boolean exists() ：判断是否存在
	 public boolean canRead() ：判断是否可读
	 public boolean canWrite() ：判断是否可写
	 public boolean isHidden() ：判断是否隐藏
	 */
	@Test
	public void test5(){
		
		File file = new File("E:\\io\\bbb.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
	}
	
	/*
	 public boolean renameTo(File dest):
	 	1.把文件重命名为指定的文件路径 (renameTo()中的File路径必须和被修改的文件的路径一致)
	 	
	 	2.将原文件移动到其它目录下。(renameTo()中的File路径就是文件要移动到的路径)

	 */
	@Test
	public void test4(){
		File file = new File("aaa.txt");
		
		boolean renameTo = file.renameTo(new File("E:/io/aaa.txt"));
		System.out.println(renameTo);
	}
	
	/*
	 	public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
		public long lastModified() ：获取最后一次的修改时间，毫秒值
		public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
		public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组 

	 */
	@Test
	public void test3(){
		//目录
		File file = new File("E:\\io");
		System.out.println(file.lastModified());
		
		//文件
//		file = new File("E:\\io\\aaa.txt");
//		System.out.println(file.length());
		
		System.out.println("-------------------------------");
		
		String[] list = file.list();
		for (String string : list) {
			System.out.println(string);
		}
		
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2);
		}
	}

	/*
	 *  File类的获取功能
		public String getAbsolutePath()：获取绝对路径
		public File getAbsoluteFile()：获取绝对路径表示的文件
		public String getPath() ：获取路径
		public String getName() ：获取名称
		public String getParent()：获取上层文件目录路径。若无，返回null
		
	 */
	@Test
	public void test(){
		
		//绝对路径 ：包含盘符在内的完整路径
		File file1 = new File("E:\\0508\\code\\day22\\123.txt");
		//相对路径 ：相对于当前工程下
		File file2 = new File("123.txt");
		
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getAbsoluteFile());
		System.out.println(file1.getPath());
		System.out.println(file1.getName());
		System.out.println(file1.getParent());
		System.out.println("-------------------------------------");
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getAbsoluteFile());
		System.out.println(file2.getPath());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
	}
}













