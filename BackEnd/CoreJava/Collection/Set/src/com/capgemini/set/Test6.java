package com.capgemini.set;

import java.util.HashSet;

public class Test6 {

	public static void main(String[] args) 
	{
		HashSet h =new HashSet();
		h.add(15);
		h.add("mrunal");
		h.add(2.4);
		h.add('A');
		h.add("mrunal");
		h.add(15);
		h.add(null);
		h.add(null);

		System.out.println("-------for-each-------");
		for(Object r:h)
		{
			System.out.println(r);
		}

	}

}
