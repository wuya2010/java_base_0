package com.alibaba.array2Test.exer2;

/*
 使用二维数组打印一个 10 行杨辉三角.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1

 */
public class YangHui {

	public static void main(String[] args) {
		
		//1.创建二维数组
		int[][] numbers = new int[10][]; //无法直接指定二维数组元素的长度（因为长度不一样）
		//遍历二维数组，为二维数组的元素进行初始化和赋值
		for(int i = 0; i < numbers.length; i++){
			//给二维数组的元素进行初始化
			numbers[i] = new int[i + 1];
			//给二维数组元素的第一个和最后一个赋值，赋值为1
			numbers[i][0] = numbers[i][i] = 1;
			
			//给二维数组中元素的元素赋值（第一个和最后一个不要赋值）
			for(int j = 1; j < numbers[i].length - 1; j++){
				numbers[i][j] = numbers[i-1][j] + numbers[i-1][j-1];
			}
		}
		
		/*
		 * 遍历二维数组的元素
		 */
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
