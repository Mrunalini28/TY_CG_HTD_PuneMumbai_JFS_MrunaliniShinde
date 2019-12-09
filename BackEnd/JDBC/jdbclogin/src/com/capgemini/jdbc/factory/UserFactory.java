package com.capgemini.jdbc.factory;

import com.cpagemini.jdbc.dao.UserDAO;
import com.cpagemini.jdbc.dao.UserDAOJDBCImpl;

public class UserFactory 
{
	private UserFactory() {

	}
	public static UserDAO getInstance() 
	{
		UserDAO dao= new UserDAOJDBCImpl();
		return dao;
		
	}
}
