package com.alibaba.Throws.exer2;

import java.util.Scanner;

/*
 输入用户名 和密码，判断是否 为“john”和“000”
如果用户名输入错误，生成错误信息为“用户名不存在”的异常对象
如果用户名正确，密码输入错误，生成错误信息为“密码不正确”的异常对象

 */
public class LoginTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = s.next();
		System.out.println("请输入密码");
		String password = s.next();
		
		LoginTest test = new LoginTest();
		try {
			test.login(username, password);
		} catch (MyException2 e) {
			//输出异常信息
			System.out.println(e.getMessage());
		}
	}
	
	public void login(String username,String password) throws MyException2{
		//用户名对
		if("john".equals(username)){
			//密码不对
			if(!"000".equals(password)){
				throw new MyException2("密码不正确");
			}else{
				System.out.println("登录成功！！！");
			}
		}else{//
			throw new MyException2("用户名不存在");
		}
	}
}










