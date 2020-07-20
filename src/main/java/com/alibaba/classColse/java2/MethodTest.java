package com.alibaba.classColse.java2;

/*
 	一 方法：
 	
 	二 方法声明的格式：
 	
 		权限修饰符  返回值类型  方法名（形参列表）{
 			方法体;
 		}
 		
 	三说明：
 		1.权限修饰符 ：有四个public protected 缺省的  private (先都使用public)
 		2.返回值类型 ： 有两种void  vs 具体的数据类型
 				void : 没有返回值
 				具体的数据类型 ： 有返回值 ，返回值的类型可以是基本数据类型也可以是引用数据类型
 				注意 ： 如果方法有返回值类型，那么需要返回的数据放在return的后面 (必须有返回值)
 		3.方法名 ：只要遵守标识符的规则和规范即可。 xxxYyyZzz
 		
 		4.形参列表 ：形参列表的个数可以是0个1个或多个，多个之间用","隔开
 				作用 ：通知方法的调用者调用此方法时必须传递数据。
 		5.方法体 ：方法的具体的实现。方法被调用的时候方法体才会执行。
 		
 	四总结：
 		无返回值无参   public void set(){}
 		无返回值有参   public void setName(String name){}
 		有返回值无参   public int getAge(){return 10;}
 		有返回值有参   public String getInfo(String n){return "aaa";}
 		
 		
 	五思考:定义一个方法时要不要返回值，要不要形参？
 		  1.如果需要方法运行后的结果，用来做为其它运算的数据，那么就需要返回值。
 		  2.方法运行中如果需要外来(需要方法的调用者传递数据)的数据，那么就需要写形参列表
 */
public class MethodTest {

	public static void main(String[] args) {
		//创建对象
		Computer computer = new Computer();
		//调用没有返回值的方法
		computer.say();
		//调用有返回值的方法
		int sum = computer.add();
		System.out.println(sum);
		
		System.out.println("----------------------------");
		
		//调用有形参列表的方法
		computer.sum(10, 20);//实参
		//注意 ： 实参的类型和形参的类型必须一致。（实参的顺序(个数)和形参的顺序（个数）保持一致。）
		computer.info("小龙哥",16);
	}
}

class Computer{
	
	/*
	 * 有参的方法
	 */
	public void info(String name,int age){
		System.out.println("我叫" + name + "年纪" + age);
	}
	/*
	 * 有参的方法 : 形参列表是用来提示方法的调用者调用方法时传递数据的类型。
	 */
	public void sum(int a,int b){//形参
		System.out.println(a + b);
	}
	
	/*
	 * 有返回值的方法
	 */
	public int add(){
		int a = 2;
		int b = 3;
		int c = 5;
		//注意 ： 如果方法有返回值类型，那么需要返回的数据放在return的后面(必须有返回值)
		return b;
	}
	
	public void say(){
		System.out.println("say");
	}
	
	private int getAge(){
		return 10;
	}
	
	protected void test(String n){
		
	}
}

