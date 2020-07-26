package com.alibaba.Throws.java2;

/*
 	finally的再说明：
 	
 	1.就算catch中再次发生异常，finally中的代码也一定会执行
 	2.就算在方法中执行了return也会执行finally中的代码
 	
 	
 	总结 ：finally中的代码一定会执行。
 	
 */
public class FinallyTest {

	
	/**
	 * 就算catch中再次发生异常，finally中的代码也一定会执行
	 */
	public void test(){
		
//		try{
//			System.out.println(1 / 0);
//		}catch(ArithmeticException e){
//			System.out.println(1 / 0);
//			System.out.println("算术运算异常");
//		}
//		System.out.println("程序结束");
		
		System.out.println("--------------------------");
		
		try{
			System.out.println(1 / 0);
		}catch(ArithmeticException e){
			System.out.println(1 / 0);
			System.out.println("算术运算异常");
		}finally{
			System.out.println("程序结束");
		}
	}
	
	/**
	 * 
	 * 就算在方法中执行了return也会执行finally中的代码
	 */
	public int getNumber(){
//		try{
//			System.out.println(1 / 0);
//		}catch(ArithmeticException e){
//			return 10;
//		}finally{
//			return 20;
//		}
		
		System.out.println("-------------------------");
		
		try{
			System.out.println(1 / 0);
		}catch(ArithmeticException e){
			return 10; //注意 ：在return的时候只会检查有没有finally，如果有则执行。没有就结束方法返回结果
		}finally{
			System.out.println("aaaaaaaaaaaaa");
		}
		
		return 20;
		
		//------------------------先把下面的代码搞明白----------------------------------------
		
//		boolean boo = true;
//		
//		if(boo){
//			return 10;
//		}
//		
//		return 20;
	}
	
	public static void main(String[] args) {
		
		FinallyTest ft  = new FinallyTest();
//		ft.test();
		
		System.out.println(ft.getNumber());
	}
}
