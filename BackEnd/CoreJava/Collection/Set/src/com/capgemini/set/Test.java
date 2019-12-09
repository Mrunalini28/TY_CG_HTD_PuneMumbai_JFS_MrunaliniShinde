package com.capgemini.set;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(15);
		hs.add('A');
		hs.add(2.4);
		hs.add("Deepa");
		System.out.println("------using for-loop--------------");
		
		for(Object r:hs) 
		{
			System.out.println(r);
		}
		System.out.println("----------using Iterator--------- ");
		Iterator it =hs.iterator();
		while(it.hasNext()){
			Object r=it.next();	
			System.out.println(r);
		}
	}

}
