package com.alibaba.array3Test.exer2;

/*
 * 1.有以下三个方法，分别实现返回姓名和两门课成绩，返回姓名和三门课成绩，
 * 返回姓名和五门课成绩。封装成一个可变参数的方法返回类型为String，并调用

 */
public class ScoreTest {

	/*
	public String getInfo(String name,int a,int b){
		return name + " " + a + " " + b;
	} 
	
	public String getInfo(String name,int a,int b,int c){
		return name + " " + a + " " + b;
	} 
	
	public String getInfo(String name,int a,int b,int c,int d,int e){
		return name + " " + a + " " + b;
	}
	*/
	
	public String getInfo(String name,int ... scores){
		
		for (int i = 0; i < scores.length; i++) {
			name += scores[i] + " ";
		}
		
		return name;
	}
	
	
	
}
