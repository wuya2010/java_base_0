package com.alibaba.classMutilTai.java3;

/*
 	在类的内部四种权限修饰符修饰的属性和方法都可以进行调用
 */
public class Cat {

	private String namePrivate = "namePrivate";
	String name = "name";
	protected String nameProtected = "nameProtected";
	public String namePublic = "namePublic";
	
	
	private void sayPrivate(){
		System.out.println("sayPrivate");
	}
	
	void say(){
		System.out.println("say");
	}
	
	protected void sayProtected(){
		System.out.println("sayProtected");
	}
	
	public void sayPublic(){
		System.out.println("sayPublic");
	}
	
	
	
	public void test(){
		say();
		sayPrivate();
		sayProtected();
		sayPublic();
		
		System.out.println(namePrivate);
		System.out.println(name);
		System.out.println(nameProtected);
		System.out.println(namePublic);
	}
}
