package com.alibaba.classClazz.java4;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://192.168.10.160:8080/txt/hello.html");
		//获取协议
		System.out.println(url.getProtocol());
		//获取文件
		System.out.println(url.getFile());
		//获取主机
		System.out.println(url.getHost());
		//获取端口号
		System.out.println(url.getPort());
	}
}
