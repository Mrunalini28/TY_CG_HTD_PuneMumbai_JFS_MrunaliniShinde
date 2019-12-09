package com.cagemini.exp2;

public class Amount {
	void check(int val) throws Invalidlimitexception
	{
		if(val>4000) {
			throw new Invalidlimitexception();
		}
	}
}
