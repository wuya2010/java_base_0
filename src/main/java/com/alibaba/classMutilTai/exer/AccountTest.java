package com.alibaba.classMutilTai.exer;

/*
 * 1.创建程序,在其中定义两个类：Account和AccountTest类体会Java的封装性。
Account类要求具有属性：姓名（长度为2位3位或4位）、余额(必须>20)、密码（必须是六位）
并在AccountTest中测试

 */
public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setName("aa");
		account.setBalance(30);
		account.setPassword("aaaaaa");
		
		System.out.println("设置完成");
	}
}

class Account{
	
	private String name;
	private int balance;
	private String password;
	
	//（长度为2位3位或4位）
	public void setName(String n){
		if(n.length() == 2 || n.length() == 3 || n.length() == 4){
			name = n;
		}else{
			System.out.println("姓名长度错误");
		}
	}
	//余额(必须>20)
	public void setBalance(int b){
		if(b > 20){
			balance = b;
		}else{
			System.out.println("余额不足");
		}
	}
	//密码（必须是六位）
	public void setPassword(String p){
		if(p.length() == 6){
			password = p;
		}else{
			System.out.println("密码长度不够");
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public String getPassword(){
		return password;
	}
	
}














