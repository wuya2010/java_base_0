package com.alibaba.mapTest.java2;

public class Student implements Comparable {

	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Student){
			Student s = (Student) o;
//			return this.age - s.age;  //年纪从小到大
//			return -(this.age - s.age); //年纪从大到小
			
			
			//安照名字进行排序
//			return -(this.name.compareTo(s.name));
			
			//安照年纪排序，如果年纪一样安照名字排序
			int a = this.age - s.age;
			
			if(a == 0){
				return this.name.compareTo(s.name);
			}
			
			return a;
		}
		
		return 0; //如果返回值是0则说明两个元素是一样的。
	}
	
	@Override
	public String toString() {
		return "(" + name + "," + age + ")";
	}

	
}
