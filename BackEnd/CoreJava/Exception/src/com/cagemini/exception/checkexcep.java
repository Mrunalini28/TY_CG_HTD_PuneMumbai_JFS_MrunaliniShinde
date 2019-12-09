package com.cagemini.exception;

import java.io.File;
import java.io.IOException;

public class checkexcep 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		File f=new File("mrunal.txt");
		try
		{
			f.createNewFile();
			System.out.println("file created");
		}
		catch(IOException i) 
		{
			System.out.println("not able to create file");
		}
		System.out.println("main ended");
	}
}
