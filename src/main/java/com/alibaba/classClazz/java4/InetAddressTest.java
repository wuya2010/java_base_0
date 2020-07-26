package com.alibaba.classClazz.java4;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 	InetAddress类
 */
public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		
		InetAddress localHost = InetAddress.getLocalHost();
		//获取本机的IP地址
		System.out.println(localHost.getHostAddress());
		//获取本机的名称
		System.out.println(localHost.getHostName());
		
		System.out.println("-----------------------------------");
		
		//根据域名获取IP地址
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(byName);
	}
}
