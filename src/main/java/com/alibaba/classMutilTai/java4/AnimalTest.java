package com.alibaba.classMutilTai.java4;

/*
 	面向对象特性之 ： 封装性
 	
 	一 为什么要使用封装性？
 		当我们创建对象以后，可以通过对象名.属性的方式给属性赋值。但是只能对数据的类型和范围加以限制。
 		在实际问题中往往我们还会有一些其它的限制条件。但是在属性的声明处不能加以限制。
 		所以采取如下方式：
 		1.将属性私有化，这样就不能再通过 对象名.属性名直接进行赋值
 		2.提供方法给属性赋值，这样就可以在方法中加上我们需要的限制条件。
 	
 	二 封装性的理解（狭义上）
 		1.私有化属性
 		2.提供公共的方法:setXxx,getXxx
 	
 	三 封装性的理解（广义上）
 		1.四种权限修饰符 ：private,缺省的，protected,public
 		2.四种权限修饰符可以修饰 ：属性，方法，构造器，内部类。
 		3.类只能使用public和缺省的修饰
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.name = "金毛";
//		animal.legs = 3;
//		animal.age = -2;
		
		animal.setLegs(3);
		animal.setAge(-3);
		
		animal.info();
		
	}
}

class Animal{
	
	String name;
	//只要眼不瞎你就别瞎写
	private int legs;
	//1.将属性私有化，不让其它人直接访问属性进行赋值
	private int age;
	
	//注意：一般我们会定义两个方法： setXxx(给属性赋值),getXxx(获取属性的值)
	//所谓的setXxx和getXxx都是普通方法而已
	public int getAge(){
		return age;
	}
	
	//提供公共的方法给属性赋值，在方法中可以加上一些限制条件。
	public void setAge(int a){
		if(a < 0){
			System.out.println("哥们你火星来的吧");
			age = 5;
		}else{
			age = a;
		}
	}
	
	public int getLegs(){
		return legs;
	}
	
	public void setLegs(int l){
		if(l != 4){
			System.out.println("哥们你眼瞎啊，见过" + l + "条腿的狗吗");
			//如果赋值不成功，可以考虑给一个默认值，或者抛出异常，或者其它操作（根据实际开发场景去操作）
			legs = 4;
		}else{
			legs = l;
		}
	}
	
	public void info(){
		System.out.println("名字叫" + name + " " + legs + "条腿  ，年纪" + age  +  "岁");
	}
}













