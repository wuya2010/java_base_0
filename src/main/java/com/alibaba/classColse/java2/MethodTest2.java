package com.alibaba.classColse.java2;

/*
 	方法的细节：
 		1.在同一个类中的方法之间可以相互调用。
 		2.除递归方法外，不要自己调用自己否则会发生StackOverflowError
 */
public class MethodTest2 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.test();
//		dog.loop();
	}
}

class Dog{
	
	public void run(){
		
		System.out.println("狗跑起来了");
	}
	
	//在同一个类中的方法之间可以相互调用。
	public void test(){
		System.out.println("aaaaaaaa");
		run();
		System.out.println("bbbbbbbbbb");
	}
	
	public void loop(){
		System.out.println("狗追着尾巴跑来跑去");
		//除递归方法外，不要自己调用自己否则会发生StackOverflowError
//		loop();
	}
}
















