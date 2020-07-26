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
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//}


interface UserDAO{

	void add(Object obj);

	void delete(int id);
}
