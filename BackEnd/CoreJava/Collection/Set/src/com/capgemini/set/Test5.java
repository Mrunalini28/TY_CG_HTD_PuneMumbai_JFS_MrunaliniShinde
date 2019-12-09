package com.capgemini.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args)
	{
    TreeSet t=new TreeSet();
    
	t.add(15);
	t.add(24);
	t.add(98);
	t.add(86);
	t.add(null);
	
	System.out.println("------using for-loop--------------");
	
	for(Object r:t) 
	{
		System.out.println(r);
	}
    
	}

}
