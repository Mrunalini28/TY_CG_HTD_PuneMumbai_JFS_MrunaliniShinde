package com.cagemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(24);
		al.add("chinuu");
		al.add(2.9);
		al.add('M');
		ListIterator m=al.listIterator();
		System.out.println("--------->farward");
		while(m.hasNext()) 
		{
			Object r=m.next();
			System.out.println(r);
		}
		System.out.println("<------------backward");
		while(m.hasPrevious()) 
		{
			Object r=m.previous();
			System.out.println(r);
		}
	}

}
