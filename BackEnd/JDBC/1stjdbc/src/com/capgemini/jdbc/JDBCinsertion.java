package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCinsertion {

	public static void main(String[] args) {
		Connection conn=null; 
		Statement stmt=null;
		try {
			//load the Driver 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded....");
			System.out.println("------------------");

			//Get the DB connection 
			String dbUrl="jdbc:mysql://localhost:3306/capg_db?user=root&password=mrunal";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection Establish");
			System.out.println("---------------------");

			//Issue the query via connection
			String query ="insert into user_info values (2019005,'peter parker','p.parker@avg.com','marryjane')";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(query);

			//Process the result
			if(count>0) 
			{
				System.out.println("Data Inserted.....");
			}
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();

				}
				catch(SQLException a) {
					a.printStackTrace();

				}
				if(stmt!=null) {
					try {
						stmt.close();

					}
					catch(SQLException a) {
						a.printStackTrace();

					}

				}
			}

		}
	}
}