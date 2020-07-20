package com.alibaba.classColse.java2;

/*
 	属性：
 	
 	变量的分类：
 		1.安照类型分 ： 基本数据类型  vs 引用数据类型
 		2.安照位置分 ： 局部变量  vs 成员变量(属性)
 	
 	局部变量和成员变量的区别？
 		1.相同点：
 				①声明的格式相同
 				②先声明后使用
 				③都有作用域
 		2.不同点：
 				①位置上：
 					属性：类中，其它结构外。
 					局部变量：在方法中，方法的形参，构造器中等声明的变量都是局部变量
 				②权限修饰符：
 					属性：可以使用四种权限修饰符，public protected 缺省的(默认的)  private （暂了解即可）
 					局部变量：不能使用权限修饰符
 				③默认值：
 					属性：
 							byte shoft int long -> 0
 							float double ->0.0
 							char -> \u0000
 							boolean -> false
 							引用数据类型 -> null
 					局部变量：没有默认值
 				④内存：
 					属性：在堆中创建的对象中
 					局部变量 ：在栈中
 */
public class FieldTest {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.println(a);
	}
}

class Animal{
	
	String name = "aaa";//属性
	
	/*
	 * 构造器（看看就行）
	 */
	public Animal(){
		int age = 20;
	}
	
	public Animal(int c){ //形参 - 局部变量
		int age = 20;
	}
	
	/*
	 * 代码块（看看就行）
	 */
	{
		
	}
	
	/*
	 * 内部类（看看就行）
	 */
	class A{
		
	}
	
	/*
	 * 方法
	 */
	public void show(String a){	//形参 -局部变量
		int age = 10;
	}
	
}














