package com.capgemini.oct14;

public class UserFactory {
	private UserFactory() {

	}
	public static UserDAO getInstance() 
	{
		UserDAO dao= new UserDAOJDBCImpl();
		return dao;

	}

}
