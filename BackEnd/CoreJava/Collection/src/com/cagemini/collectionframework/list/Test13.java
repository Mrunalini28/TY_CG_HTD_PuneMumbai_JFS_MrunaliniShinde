package com.cagemini.collectionframework.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class Test13 {

	public static void main(String[] args) {
		LinkedList<String> lit =new LinkedList();
		lit.add("mrunal");
		lit.add("abc");
		lit.add("cdf");
		Iterator<String> it=lit.iterator();
		while(it.hasNext()) 
		{
			String r= it.next();
			System.out.println(r);
		}  
		for(Object r: lit) {
			System.out.println(r);
		}
		for(int i=0;i<2;i++) {
			String r=lit.get(i);
			System.out.println(r);
		} 
		
		/*
		 * Set nums=new HashSet<String>(); nums.add("5"); nums.add(5);
		 */
	}

}
