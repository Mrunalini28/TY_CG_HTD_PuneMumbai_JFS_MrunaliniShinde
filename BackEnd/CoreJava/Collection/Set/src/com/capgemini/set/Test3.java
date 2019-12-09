package com.capgemini.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test3 {

	public static void main(String[] args) 
	{
		LinkedHashSet hs=new LinkedHashSet();
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
