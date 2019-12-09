package com.cagemini.exp2;

public class Invalidlimitexception  extends RuntimeException
{
	private String Message="day limit is only 4000";
	
	@Override
	public String getMessage() 
	{
		return Message;
	}
}
