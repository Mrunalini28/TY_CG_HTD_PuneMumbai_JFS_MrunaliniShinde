package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCretrival {

	public static void main(String[] args) {
		Connection conn=null; 
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		ResultSet rs=null;

		try {
			//load the Driver 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded....");
			System.out.println("------------------");

			//Get the DB connection
			String dbUrl="jdbc:mysql://localhost:3306/capg_db?user=root&password=mrunal";
			conn= DriverManager.getConnection(dbUrl);
			System.out.println("connection Establish");
			System.out.println("---------------------");

			//Issue SQL query 
			String query ="select * from user_info where userid=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter the user query");
			pstmt.setInt(1, sc.nextInt());
			rs=pstmt.executeQuery();

			// Process the result 
			if(rs.next()) {
				System.out.println("user id: "+rs.getInt(1));
				System.out.println("user name: "+rs.getString(2));
				System.out.println("user email: "+rs.getString(3));
				System.out.println("user password: "+rs.getString(4));
			}
			else 
			{
				System.out.println("something went wrong....");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null)
				try {
					conn.close();

				}
			catch(SQLException a) {
				a.printStackTrace();

			}
			if(pstmt!=null) {
				try {
					pstmt.close();

				}
				catch(SQLException a) {
					a.printStackTrace();

				}
				if(rs!=null) {
					try {
						rs.close();

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
