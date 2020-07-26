package com.alibaba.ioTest.java2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 	使用字节缓冲流进行文件的复制
 */
public class IOTest4 {

	@Test
	public void test() {
		long start = System.currentTimeMillis();
		bufferedCopy("C:\\Users\\Administrator\\Desktop\\bbb.avi", 
				"C:\\Users\\Administrator\\Desktop\\aaa.avi");
		long end = System.currentTimeMillis();
		System.out.println("time=" + (end - start));
	}

	@SuppressWarnings("resource")
	public void bufferedCopy(String desc, String src) {
		// 1.创建流的对象
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(desc);
			bos = new BufferedOutputStream(fos);

			// 2.一边读一边写
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = bis.read(b)) != -1) {
				// 写数据
				bos.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3.关流
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
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
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
