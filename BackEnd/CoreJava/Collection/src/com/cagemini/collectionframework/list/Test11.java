package com.cagemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test11 {

	public static void main(String[] args) 
	{
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(9.6);
		al.add(5.1);
		al.add(4.1);
		ListIterator<Double> it=al.listIterator();
		System.out.println("----------->farward");
		while(it.hasNext()) 
		{
			Double r= it.next();
			System.out.println(r);
		}
		System.out.println("<-----------previous");
		while(it.hasPrevious()) 
		{
			Double r= it.previous();
			System.out.println(r);
		}
		
	}
}
