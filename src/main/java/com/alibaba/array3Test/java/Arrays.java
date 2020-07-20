package com.alibaba.array3Test.java;

/*
 	
 	将数组中（求最大值，最小值，排序 等等）全部封装到方法中
 */
public class Arrays {

	/*
	 * 排序
	 */
	public void sort(int[] numbers, boolean boo) {
		if (boo) {
			for (int i = 0; i < numbers.length - 1; i++) {

				// 内层循环 ： 1.控制次数 2.索引值
				for (int j = 0; j < numbers.length - i - 1; j++) {

					// 比较两个值，如果前面的值比后面的值大，那么进行交换
					if (numbers[j] > numbers[j + 1]) {
						int temp = numbers[j];
						// 注意 ： j当索引值表示的范围(因为下面有j + 1所以一定要注意索引值范围)
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
					}

				}
			}
		}else{
			for (int i = 0; i < numbers.length - 1; i++) {

				// 内层循环 ： 1.控制次数 2.索引值
				for (int j = 0; j < numbers.length - i - 1; j++) {

					// 比较两个值，如果前面的值比后面的值大，那么进行交换
					if (numbers[j] < numbers[j + 1]) {
						int temp = numbers[j];
						// 注意 ： j当索引值表示的范围(因为下面有j + 1所以一定要注意索引值范围)
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
					}

				}
			}
		}
	}

	/*
	 * 数组的反转 1.第一种通过新建数组的方式进行反转 - 需要返回值 2.第二种直接对数组进行反转 - 不需要返回值（值传递 -
	 * 引用数据类型（传的是地址值））
	 */
	public void reverse(int[] numbers) {
		for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}

	/*
	 * 数组的复制 : 注意传进来的对象和返回去的对象不是同一个
	 */
	public int[] copyNumber(int[] numbers) {
		// 1.创建一个数组
		int[] copyNumber = new int[numbers.length];
		// 2.将numbers中的内容赋值给copyNumber
		for (int i = 0; i < numbers.length; i++) {
			copyNumber[i] = numbers[i];
		}
		return copyNumber;
	}

	/*
	 * 线性查找
	 */
	public int findNumber(int[] numbers, int number) {
		int index = -1; // 记录查找到的数据的位置
		// 遍历数组中所有数据
		for (int i = 0; i < numbers.length; i++) {
			// 对比数据
			if (number == numbers[i]) { // 说明找到了
				// 记录该数据所在的索引值
				index = i;
				break; // 一旦找到就不向后再查找其它内容了
			}
		}
		return index;
	}

	/*
	 * 求平均数
	 */
	public int aver(int[] numbers) {
		return sum(numbers) / numbers.length;
	}

	/*
	 * 求总和
	 */
	public int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/*
	 * 求数组中的最小值
	 */
	public int getMinNumber(int[] numbers) {
		int minNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (minNumber > numbers[i]) {
				minNumber = numbers[i];
			}
		}
		return minNumber;
	}

	/*
	 * 求数组的最大值
	 */
	public int getMaxNumber(int[] numbers) {
		int maxNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}
}
