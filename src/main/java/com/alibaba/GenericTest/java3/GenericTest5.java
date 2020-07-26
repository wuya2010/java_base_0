package com.alibaba.GenericTest.java3;

/**
 
 	自定义泛型方法
 */

class Animal2<T>{
	
	T t;
	
	public void setT(T t){
		this.t = t;
	}
	
	/*
	 * 泛型方法
	 * 1.泛型方法上的泛型类型不依赖于类上的泛型类型。由传给形参（E e）的实参的类型决定的。
	 * 
	 * 2. <E> 是为了告诉编译E是一个泛型
	 * 
	 * 3. 泛型方法是可以被static修饰的
	 */
	public <E> E getE(E e,int a,int b){
		return e;
	}
	
	public static <E> E getE2(E e){
		return e;
	}
}

//自我测试
class Box<E>{
	E e;
	
	public void getE(E e){
		this.e = e;
	}
	
	public <T>T getT(T t){
		return t;
	}
	
	
/*	Box box = new Box();
	System.out.println(box.getT("ddd"));*/
	
	
}


public class GenericTest5 {

	public static void main(String[] args) {
		/*
		Animal2<String> animal = new Animal2<String>();
		
		String str = animal.getE("aaa",10,20);
		Integer number = animal.getE(111,20,30);
		*/
		
	
		
		
		String str = Animal2.getE2("aaa");
	}
}
