package com.capgemini.set;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Mrunal");
		hs.add("Priya");
		hs.add("Kavya");
		hs.add("Deepa");
		System.out.println("------using for-loop--------------");

		for(String r:hs) 
		{
			System.out.println(r);
		}
		System.out.println("----------using Iterator--------- ");
		Iterator<String> it =hs.iterator();
		while(it.hasNext()){
			String r=it.next();	
			System.out.println(r);
		}
	}

}
