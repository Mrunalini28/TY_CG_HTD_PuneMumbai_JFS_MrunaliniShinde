package com.capgemini.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 {

	public static void main(String[] args) 
	{
		LinkedHashSet<Double> hs=new LinkedHashSet<Double>();
		hs.add(1.5);
		hs.add(3.4);
		hs.add(2.9);
		hs.add(5.7);
		System.out.println("------using for-loop--------------");

		for(Double r:hs) 
		{
			System.out.println(r);
		}
		System.out.println("----------using Iterator--------- ");
		Iterator<Double> it =hs.iterator();
		while(it.hasNext()){
			Double r=it.next();	
			System.out.println(r);
		}
	}
}

