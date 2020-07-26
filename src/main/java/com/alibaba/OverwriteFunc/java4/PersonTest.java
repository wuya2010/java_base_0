package com.alibaba.OverwriteFunc.java4;

/*
 	面向对象特性之 ：多态性
 	
 	一  说明 ： 一类事物的多种形态
 	
 	二  多态的理解 ：
 		1.狭义上：子类对象的多态性
 		
 		2.广义上： ①方法的重写，方法的重载   ②子类对象的多态性
 	
 	三 子类对象的多态性 ：父类的引用指向子类的对象
 	
 	四  多态性的前提 ： 1.要有继承关系   2.要有方法的重写   3.父类的引用指向子类的对象
 	
 	五  属性没有多态性。
 		
 */
public class PersonTest {

	public static void main(String[] args) {
		//本态
		Person person = new Person();
		//多态 : 父类的引用指向子类的对象
		Person p = new Man();
		//编译看左边，运行看右边 （对象是谁那么就调用谁的方法） - （虚拟方法调用）
		p.show();//调用的是Man中的方法，因为运行看右边（存在多态）
		p.say(); //调用的是Person中的say,因为子类没有重写该方法
//		p.smoking(); 不能调用因为编译看左边
		
		System.out.println("------------------------");
		//思考 ： 如何调用子类中特有的方法？ 可以向下转型
		Man m = (Man) p;
		m.smoking();
		//ClassCastException : 类型转换异常
//		Women women = (Women) p; //因为p对象本身就是一个Man,不能转成Women
//		women.buy();
		
		System.out.println("--------------------------");
		/*
			类型判断 ： instanceof 
			
			a(对象) instanceof A（类） : a对象是否是A类的一个实例（对象），如果是返回true,否则返回false
			
			如果 a instanceof A 结果为true ，a instanceofB结果也为true。
			那说明A和B存在子父类关系。
		*/
		if(p instanceof Women){
			Women women = (Women) p; 
			women.buy();
		}else{
			System.out.println("我是一个老爷们");
		}
		
		System.out.println("-----------------------------");
		
		System.out.println(p instanceof Women);//false
		System.out.println(p instanceof Man); //true
		System.out.println(p instanceof Person);//true
		
		Person p2 = new Person();
		System.out.println(p2 instanceof Person);//true
		System.out.println(p2 instanceof Women);//false
		System.out.println(p2 instanceof Man);//false
		
		System.out.println("------------------------------------");
		//最后show方法调用提Women中的，因为对象是Women的对象
		Creature c = new Women();//多态
		Person per = (Person) c; //多态
		per.show();
		
		System.out.println("------------------------------------");
		//思考 ： 属性有没有多态性？ 因为属性没有多态性
		/*
		 * 了解即可 ：
		 * 属性 ： 编译时行为 （编译时就确定了值）
		 * 方法的重写 ： 运行时行为 （编译时不能确定方法调用的是谁的）
		 */
		Person pers = new Women();
		System.out.println(pers.age);
		
		System.out.println("---------------------------------");
		//常见的问题：ClassCastException
		Object obj = new String("aaa"); //父类的引用指向子类的对象
		//下面的代码不对，因为obj是String类的对象。不能将String的对象转成Women
//		Women w2 = (Women) obj;

	}
}
















