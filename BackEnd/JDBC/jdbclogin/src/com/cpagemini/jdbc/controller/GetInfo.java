package com.cpagemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.cpagemini.jdbc.dao.UserDAO;

public class GetInfo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		UserDAO dao =UserFactory.getInstance();
		System.out.println("Enter the userid:");
		UserBean user=dao.getInfo(sc.nextInt());
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
