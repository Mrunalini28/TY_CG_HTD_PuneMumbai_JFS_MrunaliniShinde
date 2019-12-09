
package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCupdate {


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
			String user=sc.nextLine();
			String password=sc.nextLine();
			
			conn=DriverManager.getConnection(dbUrl, user, password);
			System.out.println("connection Establish");
			System.out.println("---------------------");

			//Issue the query via connection

			String query ="update user_info set username = ? where userid= ? ";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter user name");
			pstmt.setString(1,sc.nextLine());
			
			System.out.println("enter user id");
			pstmt.setInt(2,sc.nextInt());
			
			//System.out.println("enter user email");
			//pstmt.setNString(3,sc.nextLine());
			//System.out.println("enter password");
			//pstmt.setNString(4,sc.nextLine());

			int count =pstmt.executeUpdate();

			//Process the result

			if(count>0) 
			{
				System.out.println("Data updated....");
			}
			else
			{
				System.out.println("somthing went wrong");
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




