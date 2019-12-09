package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCRetrivalAll3 {

	public static void main(String[] args) 
	{  FileReader reader =null;
	Properties prop=null;
	try {
		//load the driver 
		reader =new FileReader("db.properties");
		prop=new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driverclass"));
		System.out.println("Driver loaded.......");
		System.out.println("---------------------");
	}
	catch(Exception a) {
		a.printStackTrace();
	}
	try(Connection conn =DriverManager.getConnection(prop.getProperty("dburl"),prop.getProperty("user"),
			prop.getProperty("password"));
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(prop.getProperty("query")))
	{
		while(rs.next()) {
			System.out.println("user id: "+rs.getInt(1));
			System.out.println("user name: "+rs.getString(2));
			System.out.println("Email: "+rs.getString(3));
			System.out.println("---------------------------");

		}

	}catch(Exception a) {
		a.printStackTrace();

	}

	}

}
