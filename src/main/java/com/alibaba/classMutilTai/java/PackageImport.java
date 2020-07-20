package com.alibaba.classMutilTai.java;



/*
 	
 	package : java为了对项目中所有的类进行统一划分和管理所以有了包的概念
 	
 	说明：
 		1.包名 ： com/cn...(分类)  +  公司名  +  项目名  + 模块名  ( com.atguigu.im(项目名).modle(模块名))
 		2.每"."表示一层目录
 		3.同一个包下的类名不能相同
 		4.源文件中的package声明是用来告诉编译器，字节码文件所放的目录。
 		5.源文件中的package声明必须放在源文件的首行
 	
 	思考 ：有了包以后，多个包中都可以有相同的类名，但是如何确定调用的是哪个包下的那个类呢？
 	
 	import:
 		1.在源文件中使用import显式的导入指定包下的类或接口
		2.声明在包的声明和类的声明之间。
		3.如果需要导入多个类或接口，那么就并列显式多个import语句即可
		4.举例：可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
		5.如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
		6.如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的是哪个类。
		7.import static组合的使用：调用指定类或接口下的静态的属性或方法
		8.如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。


		//如果在同一个类中需要调用多个包下相同类名的类 ，那么需要使用全类名d
		//全类名 ： 包含包名在内的类的全名 - com.atguigu.java.Person
 */

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;

public class PackageImport {

	public static void main(String[] args) {
		
		new Scanner(System.in);
		new Date();
		
		Math.random();
		
		new Person();
		
		out.println("aaaa");
	}
}


















