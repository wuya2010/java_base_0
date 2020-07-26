package com.alibaba.Desinger.exer5;

public class Test {

	public static void main(String[] args) {
		
		Worker worker = new Worker("小龙哥", new MyDate(2000, 3, 13));
		Worker worker2 = new Worker("亮哥", new MyDate(2000, 11, 11));
		
		System.out.println(worker.equals(worker2));
		
		System.out.println(worker.toString());
		System.out.println(worker2.toString());
	}
}
