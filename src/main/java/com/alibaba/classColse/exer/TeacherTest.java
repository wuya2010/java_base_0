package com.alibaba.classColse.exer;

public class TeacherTest {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		teacher.name = "苍老师";
		teacher.age = 20;
		teacher.teachAge = 2;
		teacher.course = "表演";
		
		String info = teacher.say();
		System.out.println(info);
		System.out.println("------------------------");
		//如果方法没有返回值则不能使用下面的方式
		System.out.println(teacher.say());
	}
}
