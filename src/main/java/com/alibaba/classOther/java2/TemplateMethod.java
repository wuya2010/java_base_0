package com.alibaba.classOther.java2;

/*
 	abstract的使用场景 ： 模板设计模式
 	
 	说明：
 		1.在我们写代码的时候如果发现多个类中的代码都是一样的，那么可以将这些代码放入到父类中。让子类继承即可
 		2.在我们写代码的时候如果发现有些代码是相同的有些是不同的，可以考虑使用模板设计模式。
 				相同的写入父类，不同的声明成抽象方法让子类重写。
 */
public class TemplateMethod {

	public static void main(String[] args) {
		
		Computer c = new PrintNumber();
		c.runTime();
	}
}


/*
 * 计算输出10000以内偶数的时间
 */
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

class PrintNumber2 extends Computer{

	@Override
	public void runCode() {
		for (int i = 0; i < 1000; i++) {
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}

}

class PrintNumber extends Computer{

	@Override
	public void runCode() {
		for (int i = 0; i < 1000; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}

}
















