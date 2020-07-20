package com.alibaba.arrayTest.exer;

/*
 * 输出所有的水仙花数，所谓水仙花数是指一个3
   位数，其各个位上数字立方和等于其本身。
    例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

 */
public class Daffodil {

	public static void main(String[] args) {
		
		for (int i = 100; i < 1000; i++) {
			//先获取百位，十位，个位上的数
			
			//获取百位上的数
			int a = i / 100;
			//获取十位上的数
			int b = i % 100 / 10;
			//获取个位上的数
			int c = i % 10;
			
			if(i == a * a * a + b * b * b + c * c * c){
				System.out.println(i);
			}
		}
	}
}
