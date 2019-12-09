package com.capgemini.oct14;

import java.util.List;

public interface UserDAO 
{
	//public List<UserBean> getAllInfo();
	public UserBean getInfo(int userid);
	public UserBean getLogin(int userid ,String password);
	public List<UserBean> AlluserList();
	
}
