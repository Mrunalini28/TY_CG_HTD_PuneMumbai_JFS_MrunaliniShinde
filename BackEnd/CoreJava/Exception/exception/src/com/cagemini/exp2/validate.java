package com.cagemini.exp2;

public class validate {
	void verify(int age)
	{
		if(age<18)
		{		
      throw new InvalidAgeException();
		}
	}

}
