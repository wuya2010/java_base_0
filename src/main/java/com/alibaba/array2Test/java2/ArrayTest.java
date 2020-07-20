package com.alibaba.array2Test.java2;

/*
 	多维数组之二维数组
 	
 	说明：
 		1.二维数组的元素是一维数组
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//1.二维数组的声明
		String[][] persons;
		String persons2[][];//暂时不建议使用
		String[] persons3[];//暂时不建议使用
		
		//2.二维数组的初始化
		//2.1静态初始化 : 初始化和赋值同时进行
		persons = new String[][]{{"高圆圆","110"},{"志玲姐姐","120"},{"冰冰","114"}};
		String[][] ps = {{"华仔","119"},{"胡扯","120"},{"彭于晏","129"}};
		//2.2动态初始化
		//所有的二维数组的元素的长度都是一样的
		persons2 = new String[3][2];//3指的是二维数组的长度，2指的是一维数组（二维数组的元素）的长度
		//可以给二维数组的元素指定不同的长度
		persons3 = new String[3][];//指明了二维数组的长度。
		persons3[0] = new String[2]; //将一维数组赋值给二维数组中的元素
		persons3[1] = new String[3];
		persons3[2] = new String[4];
		
		
		//3.调用数组中的元素
		//3.1取值
		String phone = persons[0][1]; //0指的是二维数组的索引值，1指的是一维数组（二维数组元素的元素）的索引值
		System.out.println("phone=" + phone);
		//3.2赋值
		persons2[0][0] = "小龙哥";
		System.out.println("name=" + persons2[0][0]);
		
		//4.二维数组的属性 ：length
		System.out.println(persons3.length); //二维数组的长度
		System.out.println(persons3[1].length);//二维数组元素（一维数组）的长度
		
		//5.遍历二维数组
		//5.1遍历二维数组的元素
		for(int i = 0; i < persons.length; i++){
			
			//获取二维数组的元素(一维数组)
			String[] person = persons[i];
			
			//遍历一维数组
			for(int j = 0; j < person.length; j++){
				System.out.print(person[j] + " ");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < persons.length; i++){
			//遍历一维数组
			for(int j = 0; j < persons[i].length; j++){
				System.out.print(persons[i][j] + " ");
			}
			
			System.out.println();
		}
		
		//二维数组元素的默认值是null
		//二维数组元素的元素的默认值和一维数组元素的默认值一样。因为二维数组的元素就是一维数组
		
	}
}




















