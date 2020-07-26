package com.alibaba.classClazz.java4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * TCP协议：
	1.使用TCP协议前，须先建立TCP连接，形成传输数据通道
	2.传输前，采用“三次握手”方式，是可靠的
	3.TCP协议进行通信的两个应用进程：客户端、服务端
	4.在连接中可进行大数据量的传输
	5.传输完毕，需释放已建立的连接，效率低

 */
public class TCPTest {

	/*
	 * 客户端
	 */
	@Test
	public void client() throws Exception, IOException {
		// 创建一个客户端
		/*
		 * 第一个参数 ： 服务器的IP地址 第二个参数 ： 端口号
		 */
		Socket socket = new Socket(InetAddress.getLocalHost(), 9000);
		// 给服务端发送数据 - 获取输出流
		OutputStream os = socket.getOutputStream();
		// 向服务器写数据
		os.write("aaaa".getBytes());
		// 通知服务器发送完毕
		socket.shutdownOutput();

		// 接收服务器发来的数据
		// 获取输入流
		InputStream is = socket.getInputStream();
		// 读取数据
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = is.read(b)) != -1) {
			System.out.println("客户端:" + new String(b, 0, len));
		}

		// 关资源
		os.close();
		is.close();
		socket.close();
	}

	/*
	 * 服务端
	 */
	@Test
	public void server() throws Exception {
		// 创建一个服务端
		ServerSocket ss = new ServerSocket(9000);
		// 接受客户端的请求
		Socket socket = ss.accept();
		// 获取输入流
		InputStream is = socket.getInputStream();
		// 读取数据
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = is.read(b)) != -1) {
			System.out.println("服务器:" + new String(b, 0, len));
		}

		// 向客户端发送数据
		OutputStream os = socket.getOutputStream();
		// 向客户端写数据
		os.write("cccc".getBytes());
		// 通知客户端发送完毕
		socket.shutdownOutput();

		// 关资源
		is.close();
		os.close();
		socket.close();
		ss.close();
	}
}
