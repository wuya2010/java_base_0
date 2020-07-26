package com.alibaba.OverwriteFunc.java2;

public class SuperTest3 {

	public static void main(String[] args) {
		
		new BB(10,"aa");
	}
}

class AA{
	
	public AA(int a){
		System.out.println("AA()");
	}
}

class BB extends AA{
/*
  Implicit super constructor AA() is undefined. 
  Must explicitly invoke another constructor
  
  解决方式一 ：
  		父类提供一个空参构造器
  解决方式二：
  		子类构造器显示调用父类的其它构造器
 */
	/*
	 * 报错的原因 ：父类没有空参构造器。而且子类的构造器中没有显示的调用其它构造器。
	 */
	public BB(){
		super(10);
		System.out.println("BB()");
	}
	
	public BB(int a){
		this();
		System.out.println("BB(int a)");
	}
	
	public BB(int a,String s){
		this(a);
		System.out.println("BB(int a,String s)");
	}
}
