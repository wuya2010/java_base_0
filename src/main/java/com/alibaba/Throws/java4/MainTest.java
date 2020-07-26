package com.alibaba.Throws.java4;

import java.util.Arrays;

/*
 	
 	main方法
 	1.main方法只可以修改形参的名字
 	2.给main方法传数据：(一定要先运行一次该类)
 		eclipse : 右键 -> RunAs -> RunConfigurations -> 左边选类名 ，右边选Arguments
 		命令行 ：java 字节码文件名  参数1 参数2  参数3......
 	3.在一个程序中只能有一个程序的入口
 */
public class MainTest {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		new Test().main(new String[]{"cc","dd"});
	}
}

class Test{
	public static void main(String[] args) {
		System.out.println("test");
	}
}














