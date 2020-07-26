package com.alibaba.Throws.java2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 	什么时候不能使用throws?
 */
public class ThrowsTest2 {

}

class A{
	
	public void show() throws RuntimeException{
		
	}
}

/**
 * 1.父类被重写的方法没有throws那么子类重写的方法也不能throws
 * 2.子类被重写方法抛出的异常的类型不大于父类被重写方法抛出的异常
 * @author Administrator
 *
 */
class B extends A{
	
	@Override
	public void show() throws RuntimeException{
//		new FileInputStream("aaa.txt");
	}
}







