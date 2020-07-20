package com.alibaba.classMutilTai.exer3;

public class Test {

	public static void main(String[] args) {
		
		Boy boy = new Boy("小龙哥", 35);
		Girl girl = new Girl("志玲姐姐", 16);
		
//		girl.marry(boy);
		
		Girl girl2 = new Girl("苍老师", 18);
		
		girl.compare(girl2);
	}
}
