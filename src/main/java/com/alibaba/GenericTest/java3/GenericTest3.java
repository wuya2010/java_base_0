package com.alibaba.GenericTest.java3;

/*
 	如何指明父类的泛型类型
 */
public class GenericTest3 {

	public static void main(String[] args) {
		
		SubClass<Integer> sc = new SubClass<Integer>();
		
	}
}

//方式二 ：在创建子类对象时指明父类的泛型类型
class SubClass<T> extends SuperClass<T>{

}

//方式一 ：在继承父类的时候就指明父类的泛型类型
//class SubClass extends SuperClass<String>{
//	
//}

class SuperClass<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
