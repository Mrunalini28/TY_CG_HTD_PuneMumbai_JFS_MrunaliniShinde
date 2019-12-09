package com.capgemini.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCRetrivalAll2 {

	public static void main(String[] args) 
	{
		Connection conn =null;
		FileReader reader=null;
		Properties prop=null;
		ResultSet rs=null;
		Statement stmt=null;
		try {
			reader = new FileReader("db.properties");
			prop =new Properties();
			prop.load(reader);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		//Get the connection

		String dburl=prop.getProperty("dburl");
		try 
		{   //Driver loaded

			java.sql.Driver driver =new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded");
			System.out.println("--------------------");

			//Get connection

			conn=DriverManager.getConnection(dburl, prop.getProperty("user"),prop.getProperty("password"));
			System.out.println("connection Establish....");
			System.out.println("---------------------");

			//Issue the query 

			String query="select * from user_info";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(query);

			//process the query 
			while(rs.next()) 
			{
				System.out.println("user id: "+rs.getInt(1));
				System.out.println("user name: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("pasword: "+rs.getString("password"));
				System.out.println("----------------------------------");

			}	

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}finally
		{
			if(conn !=null) {
				try {
					conn.close();
				}
				catch(SQLException a) {
					a.printStackTrace();
				}

			}if(stmt !=null) {
				try {
					stmt.close();
				}
				catch(SQLException a) {
					a.printStackTrace();
				}

			}
			if(rs !=null) {
				try {
					rs.close();
				}
				catch(SQLException a) {
					a.printStackTrace();
				}

			}
			if(reader !=null) {
				try {
					reader.close();
				}
				catch(IOException a) {
					a.printStackTrace();
				}
			}
		}
	}

}
