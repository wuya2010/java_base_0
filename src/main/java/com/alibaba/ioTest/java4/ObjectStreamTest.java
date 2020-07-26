package com.alibaba.ioTest.java4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 	对象流 ：
 	
 	序列化：可以将内存中的对象写入到磁盘上
 	反序列化：可以把磁盘上的对象通过反序列化恢复到内存中。
 	
 	注意 ：需要序列化的对象所在的类必须实现Serializable接口。
 */
public class ObjectStreamTest {

	/*
	 	ObjectInputStream : 
	 */
	@Test
	public void test() throws Exception{
		//1.创建ObjectInputStream对象
		FileInputStream fis = new FileInputStream("ccc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//2.读取内容
		Object obj = ois.readObject();
		Person p = (Person) obj;
		System.out.println(p);
		System.out.println(p.address);
		
		//3.关流
		ois.close();
		fis.close();
	}
	
	/*
	 	ObjectOutputStream:
	 */
	@Test
	public void test2() throws Exception{
		//1.创建ObjectOutputStream对象
		FileOutputStream fos = new FileOutputStream("ccc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//2.写内容
		oos.writeObject(new Person("小龙哥", 16,new Address(10, "宝安大道")));
		//3.关流
		oos.close();
		fos.close();
	}
}









