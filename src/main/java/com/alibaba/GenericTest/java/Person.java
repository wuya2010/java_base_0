package com.alibaba.GenericTest.java;


/*

 */
public class Person {

	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	/*
	 * 特殊处理 ： 该类的多个对象的哈希值是相同的，但是内容可以不相同。
	 */
	@Override
	public int hashCode() {
		
		return 10000;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "key=" + name;
	}
	
	
}
