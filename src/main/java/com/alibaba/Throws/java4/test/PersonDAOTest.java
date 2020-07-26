package com.alibaba.Throws.java4.test;


import com.alibaba.Throws.java4.PersonDAO;
import org.junit.Test;


public class PersonDAOTest {

	@Test
	public void addTest(){
		PersonDAO personDAO = new PersonDAO();
		personDAO.add("acccc");
	}
}
