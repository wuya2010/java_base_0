package com.alibaba.classClazz.java3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class ClassLoaderTest2 {

	//getResourceAsStream()
	@Test
	public void test() throws Exception{
		Properties properties = new Properties();
		
		//相对路径是day25
//		FileInputStream fis = new FileInputStream("bin/123.properties");
		
		//相对路径是bin - 读取的是bin目录中的123.properties
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("123.properties");
		properties.load(is);
		
		String name = properties.getProperty("name");
		System.out.println(name);
		
		is.close();
	}
}
