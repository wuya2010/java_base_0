package com.alibaba.classClazz.java4;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * 访问一个网站并获取内容 （了解即可）
 */
public class URLTest2 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://192.168.10.160:8080/txt/123.txt");
		//打开连接
		URLConnection openConnection = url.openConnection();
		//向下转型
		//获取对象所在类的全类名
//		System.out.println(openConnection.getClass().getName());
		HttpURLConnection conn = (HttpURLConnection) openConnection;
		
		//连接网站
		conn.connect();
		//获取响应码（如果是200则说明连接成功）
		//下载数据的过程
		if(conn.getResponseCode() == 200){
			
			//获取输入流
			InputStream is = conn.getInputStream();
			//创建一个输出流，将内容写到本地
			FileOutputStream fos = new FileOutputStream("123.txt");
			//读内容
			byte[] b = new byte[1024];
			int len = 0;
			while((len = is.read(b) )!= -1){
//				System.out.println(new String(b,0,len));
				fos.write(b, 0, len);
			}
			
			//关流
			is.close();
			fos.close();
		}
		
	}
}







