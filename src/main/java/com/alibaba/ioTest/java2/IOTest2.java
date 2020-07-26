package com.alibaba.ioTest.java2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 一边读一边写
 */
public class IOTest2 {

	/*
	 * 作业 ：实现文件的复制功能
	 */
	@Test
	public void test2() {
		long start = System.currentTimeMillis();
		copy("C:\\Users\\Administrator\\Desktop\\bbb.avi", 
				"C:\\Users\\Administrator\\Desktop\\aaa.avi");
		long end = System.currentTimeMillis();
		System.out.println("time=" + (end - start));
	}

	public void copy(String desc, String src) {
		// 2.创建流的对象
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 1.创建File对象
			File writerFile = new File(desc);
			File readerFile = new File(src);

			fis = new FileInputStream(readerFile);
			fos = new FileOutputStream(writerFile);

			// 3.一边读一边写
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				// 写数据
				fos.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关流
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * 一边读一边写
	 */
	@Test
	public void test() {

		// 2.创建流的对象
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 1.创建File对象
			File writerFile = new File("abc.txt");
			File readerFile = new File("aaa.txt");

			fis = new FileInputStream(readerFile);
			fos = new FileOutputStream(writerFile);

			// 3.一边读一边写
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				// 写数据
				fos.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关流
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
