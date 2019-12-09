package com.capgemini.oct14;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDAOJDBCImpl implements UserDAO 
{
	UserBean user;
	Properties prop = null;
	FileReader reader = null;
	Statement pstmt = null;

	public UserDAOJDBCImpl() {

		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserBean getInfo(int userid) {

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))) {
			pstmt.setInt(1, userid);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					user = new UserBean();

					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}
		} catch (Exception a) {
			a.printStackTrace();
		}
		return null;
	}

	@Override
	public UserBean getLogin(int userid, String password)
	{
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"))) {
			pstmt.setInt(1, userid);
			pstmt.setString(2, password);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) 
				{	
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
									}
				return user;
			}
		} catch (Exception a) {
			a.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserBean> AlluserList() 
	{
		List<UserBean> userList =new ArrayList<UserBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dburl"), prop.getProperty("user"),
				prop.getProperty("password"));
				Statement pstmt = conn.createStatement()) {

			try (ResultSet rs = pstmt.executeQuery(prop.getProperty("query"))) {
				while (rs.next()) {
					user = new UserBean();

					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
					userList.add(user);
				}
				return userList;
			}
		} catch (Exception a) {
			a.printStackTrace();
		}
		return null;
	}


}
