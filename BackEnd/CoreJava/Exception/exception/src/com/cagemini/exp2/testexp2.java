package com.cagemini.exp2;

public class testexp2 {

	public static void main(String[] args)
	{
		validate v=new validate();
		try {
			v.verify(2);
			System.out.println("valid age");
		}
		catch(InvalidAgeException a) 
		{
			System.out.println(a.getMessage());
		}
	}
}
