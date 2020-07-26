package com.alibaba.Enum.exer;

interface A {
	int x = 0;
}

class B {
	int x = 1;
}

public class C extends B implements A {
	public void pX() {
		System.out.println(A.x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		new C().pX();
	}
}
