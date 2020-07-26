package com.alibaba.classOther.java;

/*
 	给属性赋值的方式 ： 1.默认值     2.显示赋值    3.代码块  4.构造器赋值    5.对象名.方法名、属性名   
 	
 	属性的赋值顺序 ： 1 -> 2/3(谁在上面谁先赋值) -> 4 -> 5
 */
public class SetValue {

	public static void main(String[] args) {
		
		Number number = new Number();
//		System.out.println(number.a);
		number.show();
	}
	
	public void test(){
		int a = 10;
		//局部代码块 ： 一般我们用来控制变量的生命周期
		{
			int b = 20; //该变量是随着代码块的结束然后被释放掉
		}
		
		for (int i = 0; i < 1000000000000000L; i++) {
			
		}
		System.out.println(a);
	}
}

/*
 * 注意 ：
 * 		1.类中的成员 在类中的位置谁上谁下都可以 （代码块和属性的上下关系就会有影响）。
 * 		2.如果有多个代码块那么从上到下依次执行
 *      3.如果有多个属性从上到下依次执行。
 */
class Number{
	
	public void show(){
		System.out.println(a);
	}
	
	{
		a = 20;
	}
	{
		int c = 30;
	}
	
//	int b = a;  //不行，因为给b赋值的时候,a变量还没有声明
	int a = 10;
	
	public Number(){
		System.out.println("构造器");
	}
	
	
}











