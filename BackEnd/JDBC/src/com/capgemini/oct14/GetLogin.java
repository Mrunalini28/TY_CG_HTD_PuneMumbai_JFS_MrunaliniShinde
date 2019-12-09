package com.capgemini.oct14;

import java.util.Scanner;

public class GetLogin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserDAO dao =UserFactory.getInstance();
		 System.out.println("Enter the userid:"); 
		 
	     int userid =Integer.parseInt(sc.nextLine());
	     System.out.println("Enter the password:"); 
	     String  password =sc.nextLine();
	     UserBean user =dao.getLogin(userid, password);
		
		if(user!=null)
		{
			System.out.println(user);
		}
		else
		{
			System.out.println("something went wrong");
		}
		sc.close();
	}


	}
