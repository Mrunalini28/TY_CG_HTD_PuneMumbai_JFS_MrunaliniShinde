package com.cagemini.exp2;

public class InvalidAgeException extends RuntimeException
{
	private String msg="invalid age";
	
	@Override
	public String getMessage() 
	{
		return msg;
	}
}

