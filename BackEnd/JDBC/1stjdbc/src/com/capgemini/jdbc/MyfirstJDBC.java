package com.capgemini.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyfirstJDBC {

	public static void main(String[] args) 
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			java.sql.Driver driver =new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded");
			System.out.println("--------------------");

			//Get DB connection via Driver
			String dbUrl="jdbc:mysql://localhost:3306/capg_db?user=root&password=mrunal";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection Establish");
			System.out.println("---------------------");

			//Issue SQL query via connection
			String query="select * from user_info";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(query);

			//Process the results returned by SQL query
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
		}
		finally {
			if(conn !=null) {
				try {
					conn.close();

				}
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();

				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();

				}
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
			}

		}
	}
}
