package com.capgemini.oct14;

import java.util.List;

public class AlluserList {

	public static void main(String[] args) 
	{
		UserDAO dao =UserFactory.getInstance();
		List <UserBean> userList=dao.AlluserList();
		if(userList !=null) 
		{
			for(UserBean user: userList) 
			{
				System.out.println(user);	
			}
		}

		else 
		{
			System.out.println("something is wrong");
		}
	}
}