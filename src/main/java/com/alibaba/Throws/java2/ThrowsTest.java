package com.alibaba.Throws.java2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 	异常的处理方式二 ：throws
 	
 	一 格式 ： 权限修饰符  返回值类型 方法名(形参列表) throws 异常类型1，异常类型2......{
 	
 		 }
 		 
 	二 说明 ： throws并没有真正的处理异常，而是将异常向上抛，抛给方法的调用者。
 	
 	三  try-catch-finally和throws的区别？
 	  try-catch-finally : 真正的处理了异常
 	  throws : throws并没有真正的处理异常，而是将异常向上抛，抛给方法的调用者。
 	  
 	四 思考：
 		1.什么时候不能使用throws?
 				①如果想真正的处理异常那么不能使用throws
 				②父类被重写的方法没有throws那么子类重写的方法也不能throws
 		2.什么时候必须使用throws?
 				在main方法需要连续调用多个方法（需要传入一些数据），多个方法都存在异常（因为数据的异常），
 						那么这个异常只能throws（这个数据的异常只能让输出数据的人来处理）。
 				
 		
 	五 . 子类被重写方法抛出的异常的类型不大于父类被重写方法抛出的异常
 */
public class ThrowsTest {

	
	public void buyTickt(int id) throws FileNotFoundException{
		new FileInputStream("aaa.txt");
	}
	
	public void buyTickt2(int id) throws FileNotFoundException{
		buyTickt(id);
	}
	
	public void buyTickt3(int id) throws FileNotFoundException{
		buyTickt2(id);
	}
	
	
	public static void main(String[] args) {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.buyTickt3(110);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
