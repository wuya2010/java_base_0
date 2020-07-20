package com.alibaba.arrayTest.exer;

/*
 * 编写程序FooBizBaz.java，从1循环到150并在每行打印一个值，
 * 另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。

 */
public class FooBizBaz {

	public static void main(String[] args) {
		
		/*
		 * 如果说结果有可能是多个，那么就选用多个if语句 而非是 if-else if
		 */
		for(int i = 1; i <= 150; i++){
			
			System.out.print(i + " ");
			
			if(i % 3 == 0){
				System.out.print("foo ");
			}
			
			if(i % 5 == 0){
				System.out.print("biz ");
			}
			
			if(i % 7 == 0){
				System.out.print("baz ");
			}
			
			System.out.println();
		}
	}
}
