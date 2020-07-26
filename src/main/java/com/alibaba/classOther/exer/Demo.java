package com.alibaba.classOther.exer;

public class Demo {

	public static void main(String[] args) {
		//该数组中只能存放SuperClass类型的对象
		SuperClass[] scs  = new SuperClass[1];
		//向该数组中存放了一个SubClass类型的对象因为它是SuperClass的子类。（多态）
		scs[0] = new SubClass("子类");//多态
		
		SuperClass sc = scs[0];
		
		//遍历
		for (int i = 0; i < scs.length; i++) {
			scs[i].test();
			//如果需要调用子类中独有的属性和方法需要向下转型
			//向下转型前需要判断类型
			if(scs[i] instanceof SubClass){
				SubClass ss = (SubClass) scs[i];
				ss.show();
			}
		}
	}
}
/*
 * 1.创建两个类，一个父类一个子类。
  ①要求通过子类构造器给父类中的属性赋值
  ②要求子类必须重写父类中的方法
  ③要求在子类中必须调用父类被重写的方法
  ④要求创建一个父类类型的数组，用来存放子类的对象。
  ⑤要求遍历数组调用子类对象中的方法
  */
class SuperClass{
	private String name;
	
	public SuperClass(String name){
		this.name = name;
	}
	
	public void test(){
		System.out.println("superclass");
	}
}

class SubClass extends SuperClass{
	
	public SubClass(String name){
		super(name);
	}
	
	@Override
	public void test() {
		System.out.println("subClass");
	}
	
	//调用父类中被重写的方法
	public void show(){
		super.test();
	}
}


















