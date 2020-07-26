package com.alibaba.Throws.java4;

import org.junit.Test;
/*
 	单元测试 ：
 	
 	1.先添加一个包 ： 在项目上右键 -> BuildPath -> AddLibraries -> JUnit -> JUnit4
 	2.在方法上加一个注解 @Test
 	3.在方法上右键 -> RunAs -> JUnitTest运行代码
 	4.如果显示的是绿条说明代码运行成功，如果是红条说明在代码的执行过程发生了异常
 	
 	注意：
 		1.单元测试方法所在的类必须为public
 		2.单元测试方法一定是权修饰符为public，返回值类型为void，方法且没有形参
 		3.项目中的代码和单元测试必须分开写。一定不能让两者混在一起。
 */
public class JUnitTestTest {
	
	@Test
	public void test(){
		System.out.println("aaaa");
	}
	
	@Test
	public void test2(){
		System.out.println(1 / 0);
	}
}
