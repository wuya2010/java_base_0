package com.alibaba.OverwriteFunc.java2;

/*
 	方法的重写 ： 有了继承以后子类可以对父类中的方法进行重写（覆盖）
 	
 	说明：子类重写父类的方法后，如果通过子类对象调用相同的方法话，实际上调用的是子类重写父类的方法
 	
 	如何重写 ：复制父类的方法，粘贴到子类 （因为子类对父类的方法不满意所以要重写）
 	
 	----------------------------------细节--------------------------
 	
 	子类重写的方法    父类被重写的方法。
 	
 	权限修饰符   返回值类型   方法名(形参列表){
 		方法体;
 	}
 	
 	说明：
 		1.子类重写的方法和父类被重写的方法的方法名和形参列表必须相同。
 		2.子类重写的方法的权限修饰符不小于父类被重写方法的权限修饰符
 		3.返回值类型：
 			①没有返回值 - 子类重写的方法和父类被重写的方法的返回值如果是void那么只能都是void
 			②有返回值（返回值的类型必须存在子父类关系） - 子类重写的方法的返回值类型不大于父类被重写方法的返回值类型。
 		4.子类方法抛出的异常不能大于父类被重写方法的异常（讲异常的时候再说）

 	 注意：
 	 	1.子类不能重写父类中被private修饰的方法。
 	 	2.子类和父类中同名同参的方法要么同时加static要么同时不加static.
	  		同时加上static的时候子类中的该方法不是重写的方法。
 	
 */
public class OverrideTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.say();
	}
}


class Animal{
	String name;
	int age;
	/*
	 * 父类被重写的方法
	 */
	public void say(){
		System.out.println("动物说话了");
	}
	
	
	protected void show(){
		
	}
	
	public Number info(){
		return null;
	}
	
	private void add(){
		
	}
	
	public static void show2(){
		
	}
}

class Dog extends Animal{
	
	/*
	 * 不是重写的方法
	 * 
	 * 子类和父类中同名同参的方法要么同时加static要么同时不加static.
	 * 		同时加上static的时候该方法不是重写的方法。
	 */
	public static void show2(){
		
	}


	//子类不能重写父类中被private修饰的方法。
//	@Override
//	private void add(){
//		
//	}
	/*
	 * 查看继承树 ： ctrl + t
	 * 三个类之间的关系 ： Object <- Number <- Integer
	 * 返回值类型 ： 
	 * 1. 子类重写的方法的返回值类型和父类被重写方法的返回值类型要是void都得是void
	 * 2. 子类重写的方法的返回值类型不大于父类被重写方法的返回值类型（子类重写的方法返回值类型不能是父类被写方法的父类）
	 */
	public Integer info(){
		return null;
	}

	/*
	 * 权限修饰符 ：从小到大 - private ，缺省的  ，protected,public
	 * 
	 * 子类重写的方法的权限修饰符不小于父类被重写方法的权限修饰符
	 */
	public void show(){
		
	}

	/*
	 * 子类重写的方法
	 */
	@Override
	public void say(){
		System.out.println("汪汪汪.....");
	}
}
