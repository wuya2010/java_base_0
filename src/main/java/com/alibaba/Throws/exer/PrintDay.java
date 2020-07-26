package com.alibaba.Throws.exer;

/*
 * 2.声明Week枚举类，其中包含星期一至星期日的定义；
（Monday  Tuesday Wednesday  Thursday  Friday  Saturday  sunday）
在TestWeek类中声明方法中printWeek(Week week)，根据参数值打印相应的中文星期字符串。

 */
public class PrintDay {
	
	public static void main(String[] args) {
		
		PrintDay pd = new PrintDay();
		pd.printWeek(Week.MONDAY);
	}

	public void printWeek(Week week) {

		switch (week) {
		case MONDAY:
			System.out.println("星期一");
			break;

		case TUESDAY:

			break;
		case WEDNESDAY:

			break;
		case THURSDAY:

			break;
		case FRIDAY:

			break;
		case SATURDAY:

			break;
		case SUNDAY:

			break;
		}
	}
}

enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}






















