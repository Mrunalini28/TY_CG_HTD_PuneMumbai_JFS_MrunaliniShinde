package com.cagemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(24);
		al.add("chinuu");
		al.add(2.9);
		al.add('M');

		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
	}
}
