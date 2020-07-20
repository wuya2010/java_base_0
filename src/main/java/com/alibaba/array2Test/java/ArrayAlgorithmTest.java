package com.alibaba.array2Test.java;

/*
1.求数组元素的最大值、最小值、平均数、总和 、查找等

2.数组的复制、反转

3.数组元素的排序


  快捷键 ： ctrl + /  (单行注释)
  
  	   ctrl + shift + / （多行注释）
  	   ctrl + shift + \ （撤销多行注释）
  	   
  	   shift + 回车 (向下另起一行)
  	   shift + ctrl +回上 （向上另起一行）
 */
public class ArrayAlgorithmTest {

	public static void main(String[] args) {
		
		int[] numbers = {20,10,100,2,1,6,70};
		//求数组元素的最大值
		int maxNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(maxNumber < numbers[i]){ //number的值比数组中的值小
				maxNumber = numbers[i]; //将数组中的该值赋值给number变量（保证number中的值是当前最大的）
			}
		}
		System.out.println("maxNumber=" + maxNumber);
		
		//----------------------------------------------
		//下面的写法是不对的
//		int maxNumber = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			if(maxNumber < numbers[i]){ 
//				maxNumber = numbers[i]; 
//			}
//		}
//		System.out.println("maxNumber=" + maxNumber);
		
		
		System.out.println("----------------------求最小值---------------------------");
		
		int minNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(minNumber > numbers[i]){
				minNumber = numbers[i];
			}
		}
		System.out.println("minNumber=" + minNumber);
		
		System.out.println("----------------------求总和平均数---------------------------");
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("和=" + sum + " 平均数=" + sum / numbers.length);
		
		System.out.println("---------------------线性查找--------------------------------");
		//{20,10,100,2,1,6,70};
		int findNumber = -2;
		int index = -1; //记录查找到的数据的位置
		//遍历数组中所有数据
		for (int i = 0; i < numbers.length; i++) {
			//对比数据
			if(findNumber == numbers[i]){ //说明找到了
				//记录该数据所在的索引值
				index = i;
				break; //一旦找到就不向后再查找其它内容了
			}
		}
		//利用index的值来判断是否找到了该数据
		if(index == -1){
			System.out.println("亲，没有您要的内容哦");
		}else{
			System.out.println("您要的数据在索引值为" + index + "位置上");
		}
		
	}
}














