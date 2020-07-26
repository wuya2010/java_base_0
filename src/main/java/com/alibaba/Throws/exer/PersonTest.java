package com.alibaba.Throws.exer;

/*

创建三个类Student,Teacher,Worker个类
都需要实现接口 Runner 并重写 run方法
在PersonTest类中声明一个public void test(Runner runner)方法
在该方法 实现调用传入对象的run方法
如果是Student类的对象那么调用特有的方法say()
 */
public class PersonTest {

	public static void main(String[] args) {
		new PersonTest().test(new Student());
	}
	public void test(Runner runner){
		runner.run();
		
		if(runner instanceof Student){//判断类型
			//向下转型 - 为了调用实现类中特有的方法或属性
			Student s = (Student) runner;
			s.say();
		}
	}
}
interface Runner{
	void run();
}
class Worker implements Runner{

	@Override
	public void run() {
		System.out.println("Worker");
	}
	
}
class Teacher implements Runner{

	@Override
	public void run() {
		System.out.println("Teacher");
	}
	
}
class Student implements Runner{

	@Override
	public void run() {
		System.out.println("student");
	}
	
	public void say(){
		System.out.println("say");
	}
	
}
