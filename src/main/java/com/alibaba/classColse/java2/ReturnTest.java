package com.alibaba.classColse.java2;

/*
 	关键字 ：return
 	
 	作用：
 		1.在有返回值的方法中，return用来返回数据，并结束当前方法
 		2.在没有返回值的方法中，return用来结束当前方法。return后面不能写数据。
 */
public class ReturnTest {

	public static void main(String[] args) {
		
		ReturnTest rt = new ReturnTest();
		
//		int age = rt.getAge();
//		System.out.println(age);
		
		rt.demo();
	}
	
	
	public void demo(){
		for (int i = 0; i < 5; i++) {
			
			System.out.println(i);
			if(i == 3){
//				break;
				return; //用来结束当前方法
			}
		}
		System.out.println("demo");
		
	}
	
	public int getAge(){
		boolean boo = true;
		//注意 ： 无论何种情况都需要保证必须返回一个结果
		/*
		if(boo){
			return 10;
		}else{
			return 20;
		}
		*/
		
		
		if(boo){
			return 10;
		}
		
		return 20;
		
		
		
		/*
		 * 和上面的方式完全不一样。
		if(boo){
			System.out.println("aaa");
		}else{
			System.out.println("bbbb");
		}
		
		
		
		if(boo){
			System.out.println("aaaa");
		}
		
		System.out.println("bbbbb");
		*/
		
		
//		System.out.println("aaaa");  因为该代码不可能被执行
	}
}
