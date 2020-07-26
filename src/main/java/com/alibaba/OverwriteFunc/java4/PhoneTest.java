package com.alibaba.OverwriteFunc.java4;

/*
 	多态的使用场景
 */
public class PhoneTest {

	public static void main(String[] args) {
		PhoneTest pt = new PhoneTest();
		//需求 ：调用IPhone和AndroidPhone中的功能
		
		pt.usePhone(new IPhone());
		pt.usePhone(new AndroidPhone());
	}
	
	/*
	 * 多态
	 */
	public void usePhone(Phone phone){
		phone.call();
		phone.sendMessage();
		// 调用了100个方法
	}
	
}


class IPhone extends Phone{
	@Override
	public void call(){
		System.out.println(" IPhone call");
	}
	@Override
	public void sendMessage(){
		System.out.println("IPhone sendMessage");
	}
}

class AndroidPhone extends Phone{
	@Override
	public void call(){
		System.out.println(" AndroidPhone call");
	}
	@Override
	public void sendMessage(){
		System.out.println("AndroidPhone sendMessage");
	}
}

class Phone{
	public void call(){
		System.out.println("call");
	}
	
	public void sendMessage(){
		System.out.println("sendMessage");
	}
}




