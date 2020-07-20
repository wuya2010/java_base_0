package com.alibaba.arrayTest.exer;

import java.util.Scanner;

/*
 随机猜数游戏：
随机生成一个1——100的整数
有十次机会
如果第一次就猜中，提示 “你真是个天才”
如果第2——3次猜中，提示“你很聪明，赶上我了”
如果第4——9次猜中，提示“一般般”
如果最后一次猜中，提示“可算猜对啦”
一次都没猜对，提示“说你点啥好呢”

 */
public class GuessNumber {

	public static void main(String[] args) {
		
		//需要猜的数
		int guessNum = (int)(Math.random() * 100) + 1;
		System.out.println("guessNum" + guessNum);
		
		//从键盘读取数据
		Scanner s = new Scanner(System.in);
		//标记是否猜中了
		boolean isFlag = false;
		
		for (int i = 1; i <= 10; i++) {
			
			int number = s.nextInt();
			
			if(number == guessNum){//猜中了
				isFlag = true;
				
				//判断是第几次猜中的
				if(i == 1){
					System.out.println("你真是个天才");
					break; //猜对了就不猜了
				}else if(i >=2 && i <=3){
					System.out.println("你很聪明，赶上我了");
					break; //猜对了就不猜了
				}else if(i >=4 && i <=9){
					System.out.println("一般般");
					break; //猜对了就不猜了
				}else{
					System.out.println("可算猜对了");
					break; //猜对了就不猜了
				}
				
			}
		}
		
		/*
		 * 1.通过判断i的值，如果i是11。那么就说明没有猜对过。
		 * 
		 * 2.通过使用一个标记（布尔类型的变量），来记录是否猜对了。
		 */
		if(isFlag == false){
			System.out.println("说你点啥好呢");
		}
		
	}
}


















