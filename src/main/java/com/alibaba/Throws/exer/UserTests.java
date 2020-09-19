package com.alibaba.Throws.exer;

public class UserTests {

	public static void main(String[] args) {
		
		UserDAO ud = new UserDAO(){

			@Override
			public void add(Object obj) {
				System.out.println(obj);
			}

			@Override
			public void delete(int id) {
				System.out.println(id);
			}
			
		};
		
		ud.delete(10);
	}
}

//class User implements UserDAO{
//	@Override
//	public void add(Object obj) {
//		//
//		
//	}
//	@Override
//	public void delete(int id) {
//		//
//		
//	}
//}


interface UserDAO{

	void add(Object obj);

	void delete(int id);
}
