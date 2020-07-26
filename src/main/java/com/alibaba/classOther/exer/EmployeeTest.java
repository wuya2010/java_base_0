package com.alibaba.classOther.exer;

/*
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
 * 提供必要的构造器和抽象方法：work()。对于Manager类来说，他既是员工，
 * 还具有奖金(bonus)的属性。请使用继承的思想，设计CommonEmployee类和Manager类，
 * 要求类中提供必要的方法进行属性访问。
 * 

 */

class Manager extends Employee{
	
	double bonus;

	public Manager(String name, int id, double salary,double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("name=" + name + " id=" + id + " salary=" + salary + " bonus=" + bonus);
	}
	
}
class CommonEmployee extends Employee{

	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println("name=" + name + " id=" + id + " salary=" + salary);
	}
	
}
abstract class Employee{
	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
	
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		
		Manager manager = new Manager("亮哥", 100, 100000, 200000);
		manager.work();
		CommonEmployee commonEmployee = new CommonEmployee("小龙哥", 10000, 1000000);
		commonEmployee.work();
	}
}
