package com.cpagemini.jdbc.dao;

//import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO
{
//public List<UserBean> getAllInfo();
public UserBean getInfo(int userid);

}
