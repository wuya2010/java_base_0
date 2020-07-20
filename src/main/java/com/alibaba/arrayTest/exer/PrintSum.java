package com.alibaba.arrayTest.exer;

import java.util.Scanner;

public class PrintSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i <= n; i++) {
			
			System.out.println(i + " + " + (n - i) + " = " + (i + (n - i)));
		}
	}
}
