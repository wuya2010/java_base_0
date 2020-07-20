package com.alibaba.array3Test.java2;

import java.util.Arrays;

/*
 	可变形参 ：
 	
 	格式 ：权限修饰符  返回值类型 方法名(变量的类型  ... 变量名){}
 	
 	说明：
 		1.可变形参的个数可以是0个1个或多个。
 		2.可变形参的方法，和该类型（可变形参的类型）相同的数组不构成方法的重载。
 		3.可变形参只能是形参列表的最后一个
 		4.在一个形参列表中，可变形参只能有一个
 */
public class MoreArgs {

	public static void main(String[] args) {
		
		Number number = new Number();
//		number.add(new int[]{1,2,3,4,5,6,7,8,9});
		number.add();
//		number.add(1,2,3);
//		number.add(1,2,3,4,5,6,7,8,9);
		
		number.add("aa", 10, 1,2,3,4,5);
		number.add(new int[]{1,2,3,4,5});
	}
}

class Number {
	
	/*
	 * 可变形参只能是形参列表的最后一个
	 */
	public void add(String a,int b,int ... numbers){
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println(Arrays.toString(numbers));
	}
	
	//可变形参的底层就是一个数组
	public void add(int ... numbers){
//		System.out.println("我是可变形参我是就这么拽");
		//思考 ：如何获取形参列表中的数据
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum=" + sum);
	}
	

	/*
	//需求 ：求1500个数的和
	public void add(int[] numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum=" + sum);
	}
	*/
	
	
}
