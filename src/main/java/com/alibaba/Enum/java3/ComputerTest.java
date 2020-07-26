package com.alibaba.Enum.java3;

/*
 * 匿名内部类 ：
 * 
 * 格式 ：   new 抽象类/接口/普通的类(){
 * 
 * 		 }
 * 
 *  说明 ： 创建的是该抽象类(接口/普通的类)的子类(实现类)的对象
 */
public class ComputerTest {

	public static void main(String[] args) {
		
		class Deo extends Computer{

			@Override
			public void runCode() {
				//......
				System.out.println("aaaaaaaaaaaaaa");
			}
			
		}
		
		new Deo().runTime();
		
		
		System.out.println("-----------------简化---------------");
		//匿名内部类 : 创建的是Computer子类的对象
		Computer c = new Computer(){
			public void runCode() {
				System.out.println("bbbbbbbbbbbbbbb");
			}
		};
		c.runTime();
		
		System.out.println("----------------接口的实现类的对象-------------");
		
		class Deo2 implements USB{

			@Override
			public void run() {
				
			}
			
		}
		new Deo2().run();
		
		USB usb = new USB(){

			@Override
			public void run() {
				System.out.println("aaaa");
			}
			
		};
		usb.run();
		
		System.out.println("-------创建一个普通类的匿名的子类对象---------------");
		
		SuperClass sc = new SuperClass(){
			public void show() {
				System.out.println("subclass");
			}
		};
		sc.show();
	}
}

class SuperClass{
	public void show(){
		System.out.println("sueprclass");
	}
}

interface USB{
	void run();
}

/*
 * 求100以内的偶数
 */
class Demo extends Computer{

	@Override
	public void runCode() {
		
	}
}

abstract class Computer{
	
	public void runTime(){
		//1.开始的时间
		long start = System.currentTimeMillis();
		//2执行的代码
		this.runCode();
		//3.结束的时间
		long end = System.currentTimeMillis();
		//4.计算时间差
		System.out.println("time=" + (end - start));
	}
	
	public abstract void runCode();
	
}
