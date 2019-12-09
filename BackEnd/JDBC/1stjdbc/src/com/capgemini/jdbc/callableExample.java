package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class callableExample {

	public static void main(String[] args) {
		Connection conn =null;
		Scanner sc=new Scanner(System.in);
		CallableStatement cstmt=null;
		ResultSet rs=null;

		//load the Driver 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded..");
			System.out.println("---------------");

			//get the connection
			String dburl=("jdbc:mysql://localhost:3306/capg_db?user=root&password=mrunal");
			System.out.println("Enter the username and password");
			String user=sc.nextLine();
			String pssword=sc.nextLine();
			conn=DriverManager.getConnection(dburl, user, pssword);
			System.out.println("connection Established...");
			System.out.println("--------------------");

			//Issue the SQL query
			String query="call getAllInfo()";
			cstmt=conn.prepareCall(query);
			boolean b=cstmt.execute();

			if(b) {
				rs=cstmt.getResultSet();
				while(rs.next()) {
					System.out.println("userid: "+rs.getInt(1));
					System.out.println("username: "+rs.getString(2));
					System.out.println("Email: "+rs.getString(3));
					System.out.println("Password: "+rs.getString(4));
					System.out.println("-------------------------");
				}
			}
			else {
				int i=cstmt.getUpdateCount();
				if(i>0) {
					System.out.println("operation successfull");
				}
			}

		} 
		catch (Exception e) {
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
				if(cstmt!=null) {
					try {

						cstmt.close();

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
}
