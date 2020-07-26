package com.alibaba.Throws.java;

/*
 	异常的处理方式 ：

 	一  抓抛模型：

 	  1.抛 ： 在代码正常执行的过程中，一旦发生异常。系统会根据对应的异常的类型创建对象e，并抛出，抛出给调用者。
 	  		异常抛出后同时终止程序的执行。
 	  		①系统抛异常   ②手动抛异常

 	  2.抓 ：

 	  		方式一 ： try-catch-finally;
 	  		方式二 ：throws

 	二 异常处理方式一 ： try-catch-finally

 	  1.格式 ：
 	  		try{
 	  			可能会发生异常的代码;
 	  		}catch(异常的类型1){
 	  			异常的处理方式1;
 	  		}catch(异常的类型2){
 	  			异常的处理方式2;
 	  		}
 	  		.......
 	  		finally{
 	  			一定会执行的代码;
 	  		}
 	  2.说明：
 	  	  1.finally可以省略，finally中的代码一定会执行。
 	  	  2.当try中的代码执行过程中一旦发生异常，将创建对应的异常的对象，并抛出。
 	  	  	会将抛出的异常和catch后面异常的类型进行匹配，一旦匹配成功则执行对应的异常的处理方式。
 	  	  	处理完成后跳出try-catch结构继续向下执行其它代码。（没有finally的情况）
 	  	  3.可以有多个catch。如果多个catch中的异常类型存在子父类关系那么子类在上面，父类在下面。
 	  	  		如果不存在子父类关系，谁上谁下都可以。
 	  	  4.可以有 ： try-catch-finally，try-catch，try-finally
 	  	  5.异常信息的处理 ： ①printStackTrace() ②getMessage()


 	 注意 ：在实际开发中，运行时异常一般都不处理。
 */
/**
 * @author Administrator
 *
 */
public class ExceptionTest2 {

	/**
	 * 输出异常信息
	 */
	public void test5(){
		try{
			System.out.println(1 / 0);
		}catch(ArithmeticException e){
//			e.printStackTrace(); //输出异常的详细信息
			System.out.println(e.getMessage()); //异常的简单错误详细
		}

		System.out.println("程序结束");
	}

	// by zero
	//程序结束

	/**
	 * 结构 ：try-catch-finally ： 需求 -即要捕获异常还必须执行某些代码
	 * 		try-catch ： 需求 -只是捕获异常
	 * 		try-finally : 需求 - 不捕获异常，但是一定要执行某些代码
	 */
	public void test4(){
		try{
			System.out.println("aaa");
			System.out.println(1 / 0);
		}finally{
			System.out.println("我必须执行");
		}
		System.out.println("程序结束了");//这里不执行这一句
	}

	//aaa
	//Exception in thread "main" 我必须执行
	//java.lang.ArithmeticException: / by zero



	/**
	 * finally : finally中的代码一定会执行。
	 */
	public void test3(){
		try{
			System.out.println("aaa");
			System.out.println(1 / 0);
			System.out.println("ccc");
		}catch(ArithmeticException e){
			System.out.println("哥们你空指针都不会处理啊？？？");
		}finally{
			System.out.println("我一定会执行");
		}

		System.out.println("程序结束");
	}

	//aaa
	//哥们你空指针都不会处理啊？？？
	//我一定会执行
	//程序结束


	/**
	 *
	 * 思考 ： 能不能只写一个catch异常类型是Exception?
	 * 		  如果所有的异常的处理方式都一样，那么可以。
	 * 		  如果不同的异常的处理方式不一样，那么不可以。
	 *
	 * 注意 ：如果没有catch到异常那么程序终止运行。
	 */
	public void test2(){
		try{
			System.out.println("aaa");
//			System.out.println(1 / 0);

			int[] numbers = new int[2];
			System.out.println(numbers[2]);
			//如果上面的代码抛出异常则下面的代码将不再执行。
			System.out.println("ccc");

		}catch(NullPointerException e){
			System.out.println("哥们你空指针都不会处理啊？？？");
		}catch(Exception e){//可以有多个catch如果多个catch中的异常类型存在子父类关系那么子类在上面，父类在下面。
			System.out.println("发生了异常");
		}

		System.out.println("程序结束");
	}
	//aaa
	//发生了异常
	//程序结束


	/**
	 * 异常的格式
	 */
	public void test() {
		try{
			System.out.println("aaa");
			System.out.println(1 / 0);
			//如果上面的代码抛出异常则下面的代码将不再执行。
			System.out.println("ccc");
		}catch(ArithmeticException e){
			System.out.println("哥们你数学是体育老师教的吧");
		}catch(NullPointerException e){
			System.out.println("哥们你空指针都不会处理啊？？？");
		}

		System.out.println("程序结束");
	}

	//aaa
	//哥们你数学是体育老师教的吧
	//程序结束

	public static void main(String[] args) {
		ExceptionTest2 et = new ExceptionTest2();
		et.test5();
	}
}














