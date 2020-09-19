package com.alibaba.classOther.java2;

/*
 *	关键字 ：abstract
 *
 *  abstract可以修饰方法和类
 *  
 *  abstract修饰类 ： 抽象类
   	1.抽象类不能被实例化
   	2.一个非抽象子类继承抽像类后必须重写抽象父类中的所有抽象方法
   		抽象子类可以重写抽象父类中的抽象方法，一旦重写了抽象方法。那么非抽象子类就可以不用再重写该抽象方法
   	3.子类如果不想重写抽象父类中的抽象方法，那么该类可以声明成抽象子类
   	4.抽象类中不一定有抽象方法，抽象类中除了抽象方法还可以有非抽象方法。
   
   abstract修饰方法 ： 抽象方法
  		1.抽象方法没有方法体
  		2.抽象方法所在的类必须的抽象类
  
 *  思考：abstract不能和哪些关键字一起使用？
 *  	private , final , static
 */

public class AbstractTest {
	
	/**
	 * 输出所有的图形的面积
	 */
	public void showArea(GeometricObject go){
		System.out.println(go.findArea());
	}
	
	

	public static void main(String[] args) {
		
//		new GeometricObject(); 不能创建抽象类的对象
		Circle circle = new Circle();
		System.out.println(circle.toString());
	}
}


abstract class Math{
	
	public abstract void study();
	
	public void test(){
		
	}
}
/**
 * 抽象类
 */
abstract class GeometricObject extends Math {
	//抽像类有没有构造器 ? 有 ，为了子类对象的实例化过程（为了加载父类中的信息）
	public GeometricObject(){
		System.out.println("几何图形的构造器");
	}
	/**
	 * 抽象方法
	 * @return
	 */
	public abstract double findArea();
	
	/*
	 * 1.子类如果不想重写抽象父类中的抽象方法，那么该类可以声明成抽象子类
	 * 2.抽象子类可以重写抽象父类中的方法，一旦重写非抽象子类就可以不用再重写该抽象方法
	 */
	@Override
	public void study() {
		//
		
	}
	
}

//一个非抽象子类继承抽像类后必须重写抽象父类中的所有抽象方法
class Circle extends GeometricObject{

	@Override
	public double findArea() {
		
		return 0;
	}
	
}
