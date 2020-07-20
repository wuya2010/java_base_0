package com.alibaba.classMutilTai.exer3;

public class Girl {

	private String name;
	private int age;
	
	public Girl(String name,int age){
		this.name = name;
		this.age = age;
	}
	/*
	 * +marry(boy:Boy)
	   +compare(girl:Girl)

	 */
	public void marry(Boy boy){
		if(boy.getAge() < 18){
			System.out.println(this.name + ":小屁孩一边玩去");
		}else if(boy.getAge() < 30){
			System.out.println(this.name + ":我们还是先恋爱吧");
		}else{
			System.out.println(this.name + ":" + boy.getName() + "我要嫁给你");
			boy.marry(this);
		}
	}
	
	/*
	 * 比较
	 */
	public void compare(Girl girl){
		
		if(this.getAge() > girl.getAge()){
			System.out.println(girl.getName() + "比" + this.getName() + "更好看");
		}else if(this.getAge() < girl.getAge()){
			System.out.println(this.getName() + "比" + girl.getName() + "更好看");
		}else{
			System.out.println(girl.getName() + "和" + this.getName() + "都好看我都要");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
