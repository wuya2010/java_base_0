package com.alibaba.classClazz.java4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import org.junit.Test;

/*
 	UDP协议：
	1.将数据、源、目的封装成数据包，不需要建立连接
	2.每个数据报的大小限制在64K内
	3.因无需连接，故是不可靠的
	4.发送数据结束时无需释放资源，速度快

 */
public class UDPTest {

	/*
	 * 发送端
	 */
	@Test
	public void test() throws Exception {
		// 创建发送端的对象
		DatagramSocket socket = new DatagramSocket();

		byte[] bytes = "abcde".getBytes();
		/*
		 * DatagramPacket(byte buf[], int offset, int length, InetAddress
		 * address, int port) buf : 发送内容的数组 offset :从数组中的哪个位置开始发送 length :
		 * 从数组的offset的索引位置开始长度是多少 address : 接收数据包的地址 port : 接收数据包的端口号
		 */
		// 创建数据包的对象
		DatagramPacket p = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 3000);
		// 发送数据
		socket.send(p);
		// 关闭资源
		socket.close();
	}

	/*
	 * 接收端
	 */
	@Test
	public void test2() throws Exception{
		
		//创建接收端的对象
		DatagramSocket socket = new DatagramSocket(3000);
		
		byte[] b = new byte[1024]; //用来接收数据
		//创建数据包的对象用来接收数据
		DatagramPacket p = new DatagramPacket(b, b.length);
		
		//接收数据
		socket.receive(p);
		
		//输出数据内容
		System.out.println(new String(b,0,p.getLength()));

		//关闭资源
		socket.close();
	}
}
