package com.alibaba.Throws.java3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyExceptionTest {

	public static void main(String[] args) {

		MyExceptionTest mt = new MyExceptionTest();
		try {
			mt.setScore(-10);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("------------------------------------");

		mt.setScore2(-10);

		System.out.println("程序结束");
	}



	public void test() throws FileNotFoundException{
		new FileInputStream("aaa.txt");
	}
	/*
	 * 验证自定义的运行时异常类
	 */
	public void setScore2(int score){
		if(score < 0){
			//抛的是一个编译时异常需要处理
			throw new MyException2("不能小于0");
		}
	}

	/*
	 * 验证自定义的编译时异常类
	 */
	public void setScore(int score) throws MyException{
		if(score < 0){
			//抛的是一个编译时异常需要处理
			throw new MyException("不能小于0");
		}
	}
}
