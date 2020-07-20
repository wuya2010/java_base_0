package com.alibaba.classColse.exer;

public class BoxTest {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.volume();
	}
}

/*
 * 1：编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，
 * 定义一个方法获取立方体的体积。创建一个对象，打印给定尺寸的立方体的体积。
 */
class Box{
	
	public int length; //长
	public int width; //宽
	public int height; //高
	
	/*
	 * 定义方法 ： 1.要不要返回值   2.要不要形参列表
	 */
	public void volume(){
		System.out.println(length * width * height);
	}
}

