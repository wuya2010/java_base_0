package com.alibaba.Enum.java4;

import java.util.Arrays;

/*
 	2.使用enum关键字定义枚举类：
 	
 	格式 ：enum 类名{
 	
 		 }
 		 
 	3.枚举类的主要方法
 	
 	4.实现接口的枚举类
 */
public class EnumTest2 {

	public static void main(String[] args) {
		
		System.out.println(Season2.SPRING);
		System.out.println(Season2.SUMMER);
		/*
		 *  values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
			valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。
					如不是，会有运行时异常:IllegalArgumentException
		 */
		Season2[] values = Season2.values();
		System.out.println(Arrays.toString(values));
		values[0].show();
		
		Season2 summer = Season2.valueOf("SUMMER");//对象的名字严格区分大小写
		System.out.println(summer);
		
		System.out.println("-----------------------实现接口的枚举类----------------------");
		
		Season2.SUMMER.run();
		Season2.AUTUMN.run();

	}
}

/*
 *  使用 enum 定义的枚举类默认继承了 java.lang.Enum 类
	枚举类的构造器只能使用 private 访问控制符
	枚举类的所有实例必须在枚举类中显式列出(, 分隔    ; 结尾). 列出的实例系统会自动添加 public static final 修饰

 */
enum Season2 implements Test{
	//创建对象 ： 必须放在首行，多个对象之间用","隔开。用“;”结尾
	SPRING{
		@Override
		public void run() {
			System.out.println("SPRING run");
			show();
		}
	},
	SUMMER{
		@Override
		public void run() {
			System.out.println("SUMMER run");
			show();
		}
	},
	AUTUMN{
		@Override
		public void run() {
			System.out.println("AUTUMN run");
		}
	},
	WINTER{
		@Override
		public void run() {
			System.out.println("WINTER run");
			show();
		}
	};
	
	//构造器只能是private修饰（可以省略权限修饰符但默认是private）
	Season2(){
		
	}
	
	public void show(){
		System.out.println("show----------------");
	}
}

/*
 * 声明一个接口
 */
interface Test{
	void run();
}














