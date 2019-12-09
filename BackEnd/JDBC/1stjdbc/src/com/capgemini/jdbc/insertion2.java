
package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertion2 {

	public static void main(String[] args) {
		Connection conn=null; 
		Statement stmt=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
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
			
			String query ="insert into user_info values (?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter user id");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter user name");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter user email");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter password");
			pstmt.setString(4,sc.nextLine());

			int count =pstmt.executeUpdate();

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
				sc.close();
			}

		}
	}
}




