package com.alibaba.Desinger.exer;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//声明一个数组
		Employee[] es = new Employee[3];
		
		//创建对象
		Employee employee = new Employee("亮哥", 200);
		CommonEmployee commonEmployee = new CommonEmployee("文才哥", 2000);
		Manager manager = new Manager("小龙哥", 200000, 1000000);
		//将对象存放到数组
		es[0] = employee;
		es[1] = commonEmployee;
		es[2] = manager;
		//遍历数组中的元素
		for (int i = 0; i < es.length; i++) {
			Employee emp = es[i];
			//判断类型
			if(emp instanceof CommonEmployee){
				CommonEmployee ce = (CommonEmployee) emp;
				ce.work();
			}else if(emp instanceof Manager){
				Manager m = (Manager) emp;
				m.manange();
			}
		}
	}
}
/*
 * 定义员工类Employee，包含姓名和月工资，以及计算年工资getAnnual的方法。
 * 普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法

需求1：定义员工数组，里面保存普通员工、经理、Employee对象
①循环打印每个员工的年工资
②如果是普通员工，调用其work，如果是经理 调用manage方法
*/

/**
 * 经理
 */
class Manager extends Employee{
	double bonus;
	
	public Manager(String name, double salary,double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public void manange(){
		System.out.println(name + "拿着月工资" + salary + "吃 着火锅唱着歌上班" 
					+ "拿着奖金" + bonus + "不干人事");
	}
}
/**
 * 普通员工
 * @author Administrator
 *
 */
class CommonEmployee extends Employee{
	
	public CommonEmployee(String name, double salary) {
		super(name, salary);
	}

	public void work(){
		System.out.println(name + "拿着月工资" + salary + "操作卖白粉的心");
	}
}
class Employee{
	String  name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	public double getAnnual(){
		return salary * 12;
	}
}
