package com.alibaba.classOther.exer;

public class Something {

	// public int addOne(final int x) {
	// return ++x;
	// }


	public static void main(String[] args) {
		Other o = new Other();
		new Something().addOne(o);
	}

	public void addOne(final Other o) {//o是对象的引用（o里面存放的是地址值）
//		o.i++; 可以，因为修改的是对象中的属性
//		o = new Other(); 不可以，不能修改o变量的地址值
	}
}
class Other {
	public int i;
}
